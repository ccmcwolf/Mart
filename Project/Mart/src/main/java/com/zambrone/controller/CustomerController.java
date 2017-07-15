package com.zambrone.controller;

import amazon.s3.AmazonS3Template;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Customer;
import com.zambrone.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

/**
 * Created by Chamith on 04/07/2017.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService customerService;

    private AmazonS3Template amazonS3Template;
    private String bucketName;

    //setup/initialise the amazon
    @Autowired
    public CustomerController(AmazonS3Template amazonS3Template, @Value("${amazon.s3.default-bucket}") String bucketName) {
        System.out.println("template name " + amazonS3Template);
        System.out.println("bucket name " + bucketName);
        this.amazonS3Template = amazonS3Template;
        this.bucketName = bucketName;

    }

    //save new customer
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

                    //save image to profile image s3 bucket
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
    
    
    // -------------------Retrieve All Customers---------------------------------------------

    @RequestMapping(value = "/customer/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> listAllCustomers() {
        List<Customer> customers = customerService.getAllCustomer();
        if (customers.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }

    // -------------------Retrieve Single Customer------------------------------------------

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getCustomer(@PathVariable("id") int id) {
        logger.info("Fetching Customer with id {}", id);
        Customer customer = customerService.getCustomerByID(id);
        if (customer == null) {
            logger.error("Customer with id {} not found.", id);
            return new ResponseEntity("Customer with id " + id
                    + " not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    // -------------------Create a Customer-------------------------------------------

    @RequestMapping(value = "/customer/", method = RequestMethod.POST)
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer, UriComponentsBuilder ucBuilder) {
        logger.info("Creating Customer : {}", customer);


        customerService.registerNewCustomer(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/customer/{id}").buildAndExpand(customer.getCustomerId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

    // ------------------- Update a Customer ------------------------------------------------

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
        logger.info("Updating Customer with id {}", id);

        Customer currentCustomer = customerService.getCustomerByID(id);

        if (currentCustomer == null) {
            logger.error("Unable to update. Customer with id {} not found.", id);
            return new ResponseEntity<Customer>(currentCustomer, HttpStatus.BAD_REQUEST);
        }

       customerService.updateCustomer(currentCustomer);
        return new ResponseEntity<Customer>(currentCustomer, HttpStatus.OK);
    }

    // ------------------- Delete a Customer-----------------------------------------

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") int id) {
        logger.info("Fetching & Deleting Customer with id {}", id);

        Customer customer = customerService.getCustomerByID(id);
        if (customer == null) {
            logger.error("Unable to delete. Customer with id {} not found.", id);
            return new ResponseEntity("Unable to delete. Customer with id " + id + " not found.",
                    HttpStatus.NOT_FOUND);
        }
        customerService.removeCustomer(id);
        return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
    }
}
