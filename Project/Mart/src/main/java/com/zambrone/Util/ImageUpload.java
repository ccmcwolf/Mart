package com.zambrone.Util;

import amazon.s3.AmazonS3Template;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * Created by Chamith on 02/07/2017.
 */
public class ImageUpload {

    private AmazonS3Template amazonS3Template;
    private String bucketName;

    public ImageUpload(){
    }

    @Autowired
    public ImageUpload(AmazonS3Template amazonS3Template, @Value("${amazon.s3.default-bucket}") String bucketName) {
        this.amazonS3Template = amazonS3Template;
        this.bucketName = bucketName;

    }

    public String handleFileUpload(MultipartFile file) {
        String fileid = UUID.randomUUID().toString();
        if (!file.isEmpty()) {
            try {
                ObjectMetadata objectMetadata = new ObjectMetadata();
                objectMetadata.setContentType(file.getContentType());
                // Upload the file for public read
                amazonS3Template.getAmazonS3Client().putObject(new PutObjectRequest(bucketName, fileid, file.getInputStream(), objectMetadata)
                        .withCannedAcl(CannedAccessControlList.PublicRead));


                return "You successfully uploaded " + fileid + "!"+"\thttps://s3-ap-southeast-1.amazonaws.com/martonline/"+fileid;
            } catch (Exception e) {
                System.out.println(e);
                return "You failed to upload " + fileid + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + fileid + " because the file was empty.";
        }
    }
}
