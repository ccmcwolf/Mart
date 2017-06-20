package com.zambrone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Chamith on 13/06/2017.
 */
@Controller
public class DefaultPageController {


    @GetMapping
    @RequestMapping(path = "/store")
    public String getStoresView() {
        return "store";
    }

    @GetMapping
    @RequestMapping(path = "/items")
    public String getItemsView() {
        return "items";
    }

    @GetMapping
    @RequestMapping(path = "/login")
    public String getLoginView() {
        return "login";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "store";
    }

}