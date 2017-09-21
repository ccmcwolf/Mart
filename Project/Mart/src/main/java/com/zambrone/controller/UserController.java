package com.zambrone.controller;


import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;
import com.zambrone.entity.UserRoles;
import com.zambrone.entity.Users;
import com.zambrone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Chamith on 17/09/2017.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addUser(@RequestParam Map<String, String> allRequestParams, HttpSession session) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("verify");

        System.out.println("sign up " + allRequestParams);
        String email = allRequestParams.get("email");
        String usertype = allRequestParams.get("usertype");
        String password = allRequestParams.get("password");


        if (!email.equals(null) & !password.equals(null)) {
            Users user = new Users();
            user.setUsername(email);
            user.setPassword(passwordEncoder.encode(password));
            byte byteval = (byte) 0;
            user.setEnabled(byteval);

            SendGrid sendgrid = new SendGrid("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");
            SendGrid.Email semail = new SendGrid.Email();
            semail.addTo(user.getUsername().trim());
            semail.setFrom("noreply@mart.lk");
            semail.setSubject("Welcome to Mart.lk");
            semail.setHtml("You are register as Shopper of Mart.lk if you need to upgrade Please email to clientservices@mart.lk\n " +
                    "Verify your account by clicking the below link http://localhost:8081/user/activate?email="+user.getUsername());

            try {
                sendgrid.send(semail);
            } catch (SendGridException e) {
                e.printStackTrace();
            }


            if (usertype.equals("")||usertype.equals(null)) {
                UserRoles userRoles = new UserRoles();
                userRoles.setRole("ROLE_USER");
                userRoles.setUsername(email);
                userService.addUser(user,userRoles);
                System.out.println("done");
            } else {

            }


        }

        return modelAndView;
    }

    @RequestMapping(value = "/activate", method = RequestMethod.GET)
    public ModelAndView activateUser(@RequestParam Map<String, String> allRequestParams, HttpSession session) {
        String email = allRequestParams.get("email");
        ModelAndView modelAndView = new ModelAndView("verified");
        if(!email.equals(null)|!email.equals("")) {
            Users user = userService.searchUser(email);
            System.out.println("user available"+ user);
            userService.activateUser(user);
        }else{

            modelAndView = new ModelAndView("403");
        }
        return modelAndView;
    }


}
