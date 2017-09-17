package com.zambrone.controller;

/**
 * Created by Chamith on 11/06/2017.
 */

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.zambrone.entity.Users;
import com.zambrone.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class AdminUserControl {
    @Autowired
    UsersService usersService;
    @Autowired
    MessageSource messageSource;

    public AdminUserControl() {
    }

    @RequestMapping({"/admin/index"})
    public String index() {
        return "admin/index";
    }

    @RequestMapping({"/admin/register"})
    public String registerUserPage(Model model) {
        Users users = new Users();
        model.addAttribute("users", users);
        return "admin/register";
    }

    @RequestMapping({"/admin/registerUser"})
    public String registerUser(@ModelAttribute("users") Users users, Model model, HttpServletRequest hsr, HttpSession httpSession) {
        if (users != null && users.getEmail() != null && users.getEmail().length() > 0 && users.getPassword() != null && users.getPassword().length() > 0) {
            if (users.getFirstName() != null && users.getFirstName().length() > 0) {
                if (users.getPassword() != null && users.getPassword().length() > 5) {
                    String password = hsr.getParameter("confirm-password");
                    if (password.equals(users.getPassword())) {
                        Users alreadyUser = this.usersService.searchUser(users.getEmail());
                        if (alreadyUser == null) {
                            users.setUserType("AD001");
                            boolean isAdded = this.usersService.addUser(users);
                            if (isAdded) {
                                hsr.setAttribute("userRegMsg", this.messageSource.getMessage("user.success", (Object[]) null, Locale.ENGLISH));
                                Users logusers = new Users();
                                model.addAttribute("loginUser", logusers);
                                return "admin/login";
                            } else {
                                hsr.setAttribute("userRegMsg", this.messageSource.getMessage("user.error", (Object[]) null, Locale.ENGLISH));
                                return "admin/register";
                            }
                        } else {
                            hsr.setAttribute("userRegMsg", this.messageSource.getMessage("user.alreadyemail", (Object[]) null, Locale.ENGLISH));
                            return "admin/register";
                        }
                    } else {
                        hsr.setAttribute("userRegMsg", this.messageSource.getMessage("user.wrongusernameorpw", (Object[]) null, Locale.ENGLISH));
                        return "admin/register";
                    }
                } else {
                    hsr.setAttribute("userRegMsg", this.messageSource.getMessage("user.wrongpwlength", (Object[]) null, Locale.ENGLISH));
                    return "admin/register";
                }
            } else {
                hsr.setAttribute("userRegMsg", this.messageSource.getMessage("user.invaliedname", (Object[]) null, Locale.ENGLISH));
                return "admin/register";
            }
        } else {
            hsr.setAttribute("userRegMsg", this.messageSource.getMessage("user.wrongdata", (Object[]) null, Locale.ENGLISH));
            return "admin/register";
        }
    }

    @RequestMapping({"/admin/login"})
    public String logUserPage(Model model, HttpSession httpSession) {
        if (httpSession.getAttribute("loggedAdmin") != null) {
            httpSession.invalidate();
            return "admin/index";
        } else {
            Users users = new Users();
            model.addAttribute("loginUser", users);
            return "admin/login";
        }
    }

    @RequestMapping({"/admin/loginUser"})
    public String logUser(@ModelAttribute("loginUser") Users users, HttpServletRequest hsr, HttpSession httpSession) {
        Users alreadyUser = this.usersService.searchUser(users.getEmail());
        if (alreadyUser != null) {
            if (users.getPassword().equals(alreadyUser.getPassword()) && alreadyUser.getUserType().equals("AD001")) {
                httpSession.setAttribute("loggedAdmin", alreadyUser);
                return "admin/index";
            } else {
                hsr.setAttribute("logUsrMsg", this.messageSource.getMessage("user.wrongusernameorpw", (Object[]) null, Locale.ENGLISH));
                return "admin/login";
            }
        } else {
            hsr.setAttribute("logUsrMsg", this.messageSource.getMessage("user.wrongusernameorpw", (Object[]) null, Locale.ENGLISH));
            return "admin/login";
        }
    }
}
