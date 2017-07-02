package com.zambrone.controller;

import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Courier;
import com.zambrone.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.*;
import java.util.Set;

/**
 * Created by Chamith on 02/07/2017.
 */
@Controller
public class CourierController {

    @Autowired
    CourierService courierService;

    @RequestMapping(value = "/savec", method = RequestMethod.POST)
    public @ResponseBody
    JsonResponse addCourier(@ModelAttribute(value = "courier") Courier courier, BindingResult result) {

        JsonResponse res = new JsonResponse();
        if (!result.hasErrors()) {
            res.setStatus("SUCCESS");
            res.setResult("courier added successfully "+courier.getCourierId());
            System.out.println("Courier @ Controller "+courier);
            courierService.addCourier(courier);

        } else {
            res.setStatus("FAIL");
            res.setResult("Data Not Submitted");
            System.out.println("Submission errors" + result.getFieldError());
        }
        return res;
    }


}



