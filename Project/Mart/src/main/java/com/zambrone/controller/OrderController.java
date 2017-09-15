package com.zambrone.controller;

import com.zambrone.entity.Orders;
import com.zambrone.entity.Product;
import com.zambrone.entity.ProductOrder;
import com.zambrone.service.OrderService;
import com.zambrone.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by Chamith on 13/09/2017.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;

// -------------------Retrieve Single Orders------------------------------------------

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getOrder(@PathVariable("id") int id) {
        logger.info("Fetching orders with id {}", id);
        Orders orders = orderService.getOrderByOrderId(id);
        if (orders == null) {
            logger.error("Orders with id {} not found.", id);
            return new ResponseEntity("Orders with id " + id
                    + " not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Orders>(orders, HttpStatus.OK);
    }

    // -------------------Retrieve Orders details------------------------------------------
    @RequestMapping(value = "/orderdetail/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getOrderDetail(@PathVariable("id") int id) {
        logger.info("Fetching Orders Details with id {}", id);
        List<ProductOrder> orderDetails = orderService.getOrderDetailsByOrderId(id);

        if (orderDetails.isEmpty()) {
            logger.error("Orders with id {} not found.", id);
            return new ResponseEntity("Orders with id " + id
                    + " not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List>(orderDetails, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getallprameters(
            @RequestParam Map<String, String> allRequestParams) {

        ModelAndView modelAndView = new ModelAndView("placeorder");
        Double unitPrice = new Double(0);
        Integer qty = new Integer(0);
        
        Orders orders = new Orders();
        orderService.addOrder(orders);
        modelAndView.addObject("orderid", orders.getOrderNo());
        List<ProductOrder> productOrders = new ArrayList<>();
        for (Map.Entry<String, String> entry : allRequestParams.entrySet()) {

            if (entry.getKey().contains("item_price")) {

                unitPrice = Double.parseDouble(entry.getValue());

                //System.out.println("Product Price added !!");
            }

            if (entry.getKey().contains("quantity")) {

                qty = Integer.parseInt(entry.getValue());
                //System.out.println("qty " + entry.getValue());

                //System.out.println("Product Quantity added !!");
            }


            if (entry.getValue().contains("numb")) {
                String[] parts = entry.getValue().split(":");
                Integer itemId = Integer.parseInt(parts[1].trim());
                //System.out.println(itemId);
                ProductOrder productOrder = new ProductOrder();

                if (!parts[1].trim().equals("") || !parts[1].trim().equals(null)) {
                    Product product = productService.getProductByID(itemId);
                    if (product != null) {
                        productOrder.setProductId(itemId);
                        productOrder.setOrderId(orders.getOrderNo());

                        productOrder.setUnitPrice(unitPrice);
                        productOrder.setQuantity(qty);

                        //System.out.println("Product Price added !!");

                        productOrders.add(productOrder);

                    } else {
                      //System.out.println("iTem id not found !!!!!!");
                    }
                } else {
                    //System.out.println("problem with parsing the package");
                }
            }
        }

        if (!productOrders.isEmpty()) {
            orderService.saveOrderDetails(orders.getOrderNo(), productOrders);
        } else

        {
             orderService.deleteOrder(orders.getOrderNo());
           //System.out.println("product orders is null");
        }

       // return allRequestParams.toString();
        return modelAndView;
    }

    @GetMapping(path = "/place")
    public String getProducts() {
        //@RequestParam Map<String,String> allRequestParams,Model model
//        allRequestParams.get()
        return "placeorder";
    }
}
