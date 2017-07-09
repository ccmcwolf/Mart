package com.zambrone.controller;

import amazon.s3.AmazonS3Template;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Customer;
import com.zambrone.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.UUID;

/**
 * Created by Chamith on 04/07/2017.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    private AmazonS3Template amazonS3Template;
    private String bucketName;

    @Autowired
    public CustomerController(AmazonS3Template amazonS3Template, @Value("${amazon.s3.default-bucket}") String bucketName) {
        System.out.println("template name " + amazonS3Template);
        System.out.println("bucket name " + bucketName);
        this.amazonS3Template = amazonS3Template;
        this.bucketName = bucketName;

    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody
    JsonResponse addCustomer(@Valid @ModelAttribute(value = "customer") Customer customer, @RequestParam(value = "proimage") MultipartFile file, BindingResult result) {

        System.out.println("Content file part " + file.getName());
        JsonResponse res = new JsonResponse();

        String fileid = UUID.randomUUID().toString();
        if (!result.hasErrors()) {
            if (!file.isEmpty()) {
                try {
                    ObjectMetadata objectMetadata = new ObjectMetadata();
                    objectMetadata.setContentType(file.getContentType());

                    // Upload the file for public read
                    amazonS3Template.getAmazonS3Client().putObject(new PutObjectRequest(bucketName, fileid, file.getInputStream(), objectMetadata)
                            .withCannedAcl(CannedAccessControlList.PublicRead));
                    customer.setImagePath("https://s3-ap-southeast-1.amazonaws.com/martonline/" + fileid);
                    customerService.registerNewCustomer(customer);
                    res.setStatus("SUCCESS");
                    res.setResult("successfully uploaded");
                    System.out.println("Customer " + customer);


                } catch (Exception e) {

                    res.setStatus("FAIL");
                    res.setResult("Data Not Submitted");
                    System.out.println("Submission errors" + result.getFieldError());
                }
            } else {

                customerService.registerNewCustomer(customer);
                System.out.println("Customer " + customer);
                res.setStatus("SUCCESS");
            }
        } else {
            res.setStatus("FAIL");
            res.setResult("Data Not Submitted");
            System.out.println("Submission errors" + result.getFieldError());
        }


        return res;
    }
}
