package com.zambrone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Chamith on 02/07/2017.
 */
@Controller
public class PageRoutingController {


    @GetMapping(path = "/admin/addcourier")
    public String showaddCourier(){
    return "addcourier";
    }

    @GetMapping(path = "/addcustomer")
    public String showaddCustomer(){
        return "addcustomer";
    }

    @GetMapping(path = "/admin/addshop")
    public String showAddShop(){
        return "addshop";
    }



    @GetMapping(path = "/fileupload")
    public String showFileUpload(){
        return "fileupload";
    }

//    @GetMapping(path = "/shops")
//    public String getShops(){
//        return "shops";
//    }
}
