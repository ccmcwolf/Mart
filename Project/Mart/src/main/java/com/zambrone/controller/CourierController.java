package com.zambrone.controller;

import amazon.s3.AmazonS3Template;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.zambrone.Util.ImageUpload;
import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Courier;
import com.zambrone.service.CourierService;
import com.zambrone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.*;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Chamith on 02/07/2017.
 */
@Controller
@RequestMapping("/courier")
public class CourierController {

    @Autowired
    CourierService courierService;

    private AmazonS3Template amazonS3Template;
    private String bucketName;

    @Autowired
    public CourierController(AmazonS3Template amazonS3Template, @Value("${amazon.s3.default-bucket}") String bucketName) {
        System.out.println("template name " + amazonS3Template);
        System.out.println("bucket name " + bucketName);
        this.amazonS3Template = amazonS3Template;
        this.bucketName = bucketName;

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody
    JsonResponse addCourier(@Valid @ModelAttribute(value = "courier") Courier courier ,@RequestParam("proimage") MultipartFile file, BindingResult result) {

        String fileid = UUID.randomUUID().toString();
        JsonResponse res = new JsonResponse();

        if (!file.isEmpty()) {
            if (!result.hasErrors()) {

                try {
                    ObjectMetadata objectMetadata = new ObjectMetadata();
                    objectMetadata.setContentType(file.getContentType());

                    // Upload the file for public read
                    amazonS3Template.getAmazonS3Client().putObject(new PutObjectRequest(bucketName, fileid, file.getInputStream(), objectMetadata)
                            .withCannedAcl(CannedAccessControlList.PublicRead));
                    System.out.println("upload success");
                    System.out.println("You successfully uploaded " + fileid + "!" + "\thttps://s3-ap-southeast-1.amazonaws.com/martonline/" + fileid);
                    res.setStatus("SUCCESS");
                    courier.setImagepath("https://s3-ap-southeast-1.amazonaws.com/martonline/" + fileid);
                    res.setResult("courier added successfully " + courier.getCourierId());
                    courierService.addCourier(courier);

                } catch (Exception e) {
                    System.out.println("You failed to upload " + fileid + " => " + e.getMessage());
                }


            } else {
                res.setStatus("FAIL");
                res.setResult("Data Not Submitted");
                System.out.println("Submission errors" + result.getFieldError());
            }

        } else {
            res.setStatus("FAIL");
            res.setResult("Data Not Submitted");
            System.out.println("Submission errors" + result.getFieldError());
        }
        return res;
    }

}



