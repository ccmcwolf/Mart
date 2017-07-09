package com.zambrone.controller;

import amazon.s3.AmazonS3Template;
import com.amazonaws.services.s3.model.*;
import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created by Chamith on 06/07/2017.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {


    private AmazonS3Template amazonS3Template;
    private String bucketName;

    @Autowired
    public CategoryController(AmazonS3Template amazonS3Template, @Value("${amazon.s3.default-bucket}") String bucketName) {
        System.out.println("template name "+ amazonS3Template);
        System.out.println("bucket name "+ bucketName);
        this.amazonS3Template = amazonS3Template;
        this.bucketName = bucketName;

    }



    @RequestMapping(method = RequestMethod.GET)
    public List<Resource<S3ObjectSummary>> getBucketResources() {

        ObjectListing objectListing = amazonS3Template.getAmazonS3Client()
                .listObjects(new ListObjectsRequest()
                        .withBucketName(bucketName));

        return objectListing.getObjectSummaries()
                .stream()
                .map(a -> new Resource<>(a,
                        new Link(String.format("https://s3.amazonaws.com/%s/%s",
                                a.getBucketName(), a.getKey())).withRel("url")))
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody
    String addCategory(@ModelAttribute(value = "category") Category category, @RequestParam("file") MultipartFile file) {

        System.out.println("category " + category.getCategoryName());
        System.out.println("file " + file.getName());

        String fileid = UUID.randomUUID().toString();
        if (!file.isEmpty()) {
            try {
                ObjectMetadata objectMetadata = new ObjectMetadata();
                objectMetadata.setContentType(file.getContentType());

                // Upload the file for public read
                amazonS3Template.getAmazonS3Client().putObject(new PutObjectRequest(bucketName, fileid, file.getInputStream(), objectMetadata)
                        .withCannedAcl(CannedAccessControlList.PublicRead));
                System.out.println("upload success");

                return "You successfully uploaded " + fileid + "!"+"\thttps://s3-ap-southeast-1.amazonaws.com/martonline/"+fileid;
            } catch (Exception e) {

                System.out.println("error"+e);
                return "You failed to upload " + fileid + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + fileid + " because the file was empty.";
        }

    }
}
