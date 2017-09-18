package com.zambrone.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Chamith on 02/07/2017.
 */
@Controller
public class PageRoutingController {


    @GetMapping(path = "/admin/addcourier")
    public ModelAndView showaddCourier() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("addcourier");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        return modelAndView;

    }

    @GetMapping(path = "/addcustomer")
    public ModelAndView showaddCustomer() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("addcustomer");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);
        return modelAndView;
    }

    @GetMapping(path = "/login")
    public String showlogin() {
        return "login";
    }

    @GetMapping(path = "/noaccess")
    public String accessDenied() {
        return "403";
    }

    @GetMapping(path = "/signup")
    public String showSignUp() {
        return "signup";
    }

    @GetMapping(path = "/admin/addshop")
    public ModelAndView showAddShop() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("addshop");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        return modelAndView;
    }

    @GetMapping(path = "/admin")
    public ModelAndView showAdmin() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("admin");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        return modelAndView;

      }

    @GetMapping(path = "/seller")
    public ModelAndView showSeller() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("seller");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        return modelAndView;

    }

    @GetMapping(path = "/delivery")
    public ModelAndView showDelivery() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("delivery");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        return modelAndView;

    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }

    @GetMapping(path = "/order/checkout")
    public String getProducts() {
        return "placeorder";
    }

    @GetMapping(path = "/")
    public ModelAndView showIndex() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("index");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        return modelAndView;
    }

    @GetMapping(path = "/logo")
    public String myLogoff() {
        SecurityContextHolder.clearContext();
        return "/";
    }

    @GetMapping(path = "/fileupload")
    public String showFileUpload() {
        return "fileupload";
    }


}
