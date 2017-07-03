package com.zambrone.controller;

import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Product;
import com.zambrone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by Chamith on 03/07/2017.
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody
    JsonResponse addProduct(@Valid @ModelAttribute(value = "product") Product product, BindingResult result) {

        JsonResponse res = new JsonResponse();
        if (!result.hasErrors()) {
            res.setStatus("SUCCESS");
            res.setResult("courier added successfully "+product.getProductId());
            System.out.println(product);
            productService.addNewProduct(product);

        } else {
            res.setStatus("FAIL");
            res.setResult("Data Not Submitted");
            System.out.println("Submission errors" + result.getFieldError());
        }
        return res;
    }
}
