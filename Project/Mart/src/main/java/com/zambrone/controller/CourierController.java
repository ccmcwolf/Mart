package com.zambrone.controller;

import com.zambrone.entity.Courier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Chamith on 02/07/2017.
 */
@RestController

public class CourierController {

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("courier") Courier courier) {
        if (courier != null) {
            System.out.println(courier);
        } else {
            System.out.println("Courier is null");
        }

    return "success";
    }

}



