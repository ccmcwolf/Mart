package com.zambrone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Chamith on 02/07/2017.
 */
@Controller
public class PageRoutingController {


    @GetMapping(path = "/admin/addcourier")
    public String showaddCourier() {
        return "addcourier";
    }

    @GetMapping(path = "/addcustomer")
    public String showaddCustomer() {
        return "addcustomer";
    }

    @GetMapping(path = "/admin/addshop")
    public String showAddShop() {
        return "addshop";
    }


    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }

    @GetMapping(path = "/")
    public String showIndex() {
        return "index";
    }


    @GetMapping(path = "/fileupload")
    public String showFileUpload() {
        return "fileupload";
    }

//    @GetMapping(path = "/shops")
//    public String getShops(){
//        return "shops";
//    }
}
