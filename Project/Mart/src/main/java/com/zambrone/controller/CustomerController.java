package com.zambrone.controller;

import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Customer;
import com.zambrone.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Chamith on 04/07/2017.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody
    JsonResponse addCustomer(@Valid @ModelAttribute(value = "customer") Customer customer, BindingResult result) {

        JsonResponse res = new JsonResponse();
        if (!result.hasErrors()) {
            res.setStatus("SUCCESS");
            res.setResult("customer added successfully "+customer.getCustomerId());
            System.out.println("Customer "+customer);
            customerService.registerNewCustomer(customer);

        } else {
            res.setStatus("FAIL");
            res.setResult("Data Not Submitted");
            System.out.println("Submission errors" + result.getFieldError());
        }
        return res;
    }
}
