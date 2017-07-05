package com.zambrone.controller;

import com.zambrone.config.JsonResponse;
import com.zambrone.entity.Shop;
import com.zambrone.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Chamith on 05/07/2017.
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopService shopService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody JsonResponse addShop(@ModelAttribute(value = "shop") Shop shop, BindingResult result) {

        JsonResponse res = new JsonResponse();
        if (!result.hasErrors()) {
            res.setStatus("SUCCESS");
            res.setResult("Shop added successfully "+shop.getShopNo());
            System.out.println("Shop "+shop);
            shopService.registerNewShop(shop);

        } else {
            res.setStatus("FAIL");
            res.setResult("Data Not Submitted");
            System.out.println("Submission errors" + result.getFieldError());
        }
        return res;
    }


    @GetMapping(path = "/explore")
    public String getProducts(Model model){

        List<Shop> allShop = shopService.getAllShop();

        model.addAttribute("shops",allShop);
        return "shops";
    }

//    @GetMapping(path = "/load")
//    public String getShops(){
//        return "shops";
//    }
}
