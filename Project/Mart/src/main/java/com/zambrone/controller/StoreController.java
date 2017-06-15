package com.zambrone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Chamith on 11/06/2017.
// */
//@Controller
//@RequestMapping(value = "/store")
public class StoreController {

    //@RequestMapping(method = RequestMethod.GET)
    public String getStores(){
      return "store";
    }
}
