package com.zambrone.controller;

import amazon.s3.AmazonS3Template;
import com.amazonaws.services.s3.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/s3")
public class AmazonS3Controller {

    private AmazonS3Template amazonS3Template;
    private String bucketName;

    @Autowired
    public AmazonS3Controller(AmazonS3Template amazonS3Template, @Value("${amazon.s3.default-bucket}") String bucketName) {
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

    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
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

                return "You failed to upload " + fileid + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + fileid + " because the file was empty.";
        }
    }
}
