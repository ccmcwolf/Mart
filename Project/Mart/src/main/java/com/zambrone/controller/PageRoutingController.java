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
}
