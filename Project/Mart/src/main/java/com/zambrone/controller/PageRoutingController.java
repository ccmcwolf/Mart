package com.zambrone.controller;

import com.zambrone.dao.OrderDAO;
import com.zambrone.entity.Category;
import com.zambrone.entity.Customer;
import com.zambrone.entity.Shop;
import com.zambrone.service.CategoryService;
import com.zambrone.service.CustomerService;
import com.zambrone.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;
import java.util.List;

/**
 * Created by Chamith on 02/07/2017.
 */
@Controller
public class PageRoutingController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    CustomerService customerService;

    @Autowired
    ShopService shopService;

    @GetMapping(path = "/admin/addcourier")
    public ModelAndView showaddCourier() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("addcourier");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        return modelAndView;

    }

    @GetMapping(path = "/shop/addproduct")
    public ModelAndView showaddProduct(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        ModelAndView modelAndView = new ModelAndView("addproduct");
        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        List<Category> allCategory = categoryService.getAllCategory();
        model.addAttribute("categories",allCategory);
        List<Shop> allShop = shopService.getAllShop();
        model.addAttribute("allshop",allShop);

        return modelAndView;
    }


    @GetMapping(path = "/customer/addcustomer")
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
        ModelAndView modelAndView = new ModelAndView("index");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        if (auth != null) {
            boolean role_user = auth.getAuthorities().stream()
                    .anyMatch(r -> r.getAuthority().equals("ROLE_USER"));
            boolean role_seller = auth.getAuthorities().stream()
                    .anyMatch(r -> r.getAuthority().equals("ROLE_SELLER"));
            boolean role_admin = auth.getAuthorities().stream()
                    .anyMatch(r -> r.getAuthority().equals("ROLE_ADMIN"));

            if (role_user == true) {
                System.out.println("user" + auth.getName());
                Customer customer = customerService.getCustomerByEmail(auth.getName());
                String address = customer.getCustomerAddress();
                if(address==null){
                    modelAndView.addObject("details","empty");
                }

            }
            if (role_seller == true) System.out.println("seller");
            if (role_admin == true) System.out.println("admin");
            System.out.println("went through the filter");

        }


        if (name != null || name.equals(null))
            modelAndView.addObject("username", name);

        return modelAndView;
    }

    @GetMapping(path = "/logo")
    public String myLogoff() {
        SecurityContextHolder.clearContext();
        return "/";
    }

    @Autowired
    OrderDAO orderDAO;

    @ResponseBody
    @GetMapping(path = "/testdata")
    public String countorders() {

        return ""+orderDAO.getActiveOrdersByShopId(10,1);
    }

    @GetMapping(path = "/fileupload")
    public String showFileUpload() {
        return "fileupload";
    }


}
