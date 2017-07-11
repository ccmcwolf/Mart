package com.zambrone.controller;

import amazon.s3.AmazonS3Template;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Category;
import com.zambrone.entity.Shop;
import com.zambrone.service.CategoryService;
import com.zambrone.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

/**
 * Created by Chamith on 05/07/2017.
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopService shopService;

    @Autowired
    CategoryService categoryService;

    private AmazonS3Template amazonS3Template;
    private String bucketName;

    @Autowired
    public ShopController(AmazonS3Template amazonS3Template, @Value("${amazon.s3.default-bucket}") String bucketName) {
        System.out.println("template name "+ amazonS3Template);
        System.out.println("bucket name "+ bucketName);
        this.amazonS3Template = amazonS3Template;
        this.bucketName = bucketName;

    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody JsonResponse addShop(@ModelAttribute(value = "shop") Shop shop, @RequestParam(value = "shoplogopathPic")MultipartFile logoFile, @RequestParam(value = "shopcoverpathPic") MultipartFile coverFile ,BindingResult result) {

        System.out.println("Shop logo path"+logoFile.getName());
        System.out.println("Shop Cover path"+coverFile.getName());

        String fileid = UUID.randomUUID().toString();
        JsonResponse res = new JsonResponse();


        if (!logoFile.isEmpty()) {
            if (!result.hasErrors()) {

                try {
                    ObjectMetadata objectMetadata = new ObjectMetadata();
                    objectMetadata.setContentType(logoFile.getContentType());

                    // Upload the file for public read
                    amazonS3Template.getAmazonS3Client().putObject(new PutObjectRequest(bucketName, fileid, logoFile.getInputStream(), objectMetadata)
                            .withCannedAcl(CannedAccessControlList.PublicRead));
                    System.out.println("upload success");
                    System.out.println("You successfully uploaded " + fileid + "!" + "\thttps://s3-ap-southeast-1.amazonaws.com/martonline/" + fileid);
                    res.setStatus("SUCCESS");
                    shop.setShoplogoPath("https://s3-ap-southeast-1.amazonaws.com/martonline/" + fileid);
                    res.setResult("courier added successfully " + shop.getShopNo());
                    System.out.println(shop);
                    shopService.registerNewShop(shop);

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

    @GetMapping(path = "/products")
    public String showProducts() {
        return "products";
    }

    @GetMapping(path = "/explore")
    public String getProducts(Model model){

        List<Category> allCategory = categoryService.getAllCategory();
        List<Shop> allShop = shopService.getAllShop();

        model.addAttribute("categories",allCategory);
        model.addAttribute("shops",allShop);

        return "shops";
    }


}
