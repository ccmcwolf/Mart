package com.zambrone.controller;

import amazon.s3.AmazonS3Template;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Category;
import com.zambrone.entity.Product;
import com.zambrone.entity.Shop;
import com.zambrone.service.CategoryService;
import com.zambrone.service.ProductService;
import com.zambrone.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

/**
 * Created by Chamith on 03/07/2017.
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ShopService shopService;
    @Autowired
    CategoryService categoryService;

    private AmazonS3Template amazonS3Template;
    private String bucketName;

    @Autowired
    ProductService productService;

    @Autowired
    public ProductController(AmazonS3Template amazonS3Template, @Value("${amazon.s3.default-bucket}") String bucketName) {
        System.out.println("template name " + amazonS3Template);
        System.out.println("bucket name " + bucketName);
        this.amazonS3Template = amazonS3Template;
        this.bucketName = bucketName;

    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody
    JsonResponse addProduct(@Valid @ModelAttribute(value = "product") Product product, @RequestParam(value = "productImagePic") MultipartFile file, BindingResult result) {

        System.out.println("multipart file name " + file.getName());
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
                    product.setImagePath("https://s3-ap-southeast-1.amazonaws.com/martonline/" + fileid);
                    res.setResult("courier added successfully " + product.getProductId());
                    System.out.println(product);
                    productService.addNewProduct(product);

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


    @GetMapping(path="/{shopId}")
    public ModelAndView showProducts(Model model,@PathVariable("shopId") int shopId){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("products");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        if(shopId!=0) {
            List<Product> allShopProducts = productService.getProductByShopId(shopId);
            System.out.println(allShopProducts);
            model.addAttribute("products", allShopProducts);
            return modelAndView;
        }
        else{
            modelAndView.setViewName("shops");
            return modelAndView;
        }
    }
}
