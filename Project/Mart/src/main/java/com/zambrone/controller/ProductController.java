package com.zambrone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chamith on 22/06/2017.
 */
@Controller
class ProductController {

    @Autowired ProductService productService;

    @GetMapping(path = "/products")
    public String getProducts(Model model){
        model.addAttribute("products", productService.getProducts());
        System.out.println(productService.getProducts());
        return "products";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
@Component
class ProductService {
    public List<String> getProducts() {
        return Arrays.asList("iPad","iPod","iPhone");
    }
}