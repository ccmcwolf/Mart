package com.zambrone.controller;

import com.zambrone.entity.Orders;
import com.zambrone.entity.ProductOrder;
import com.zambrone.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Chamith on 13/09/2017.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    OrderService orderService;

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
    public String getallprameters(
            @RequestParam Map<String, String> allRequestParams) {

        ModelAndView modelAndView = new ModelAndView("placeorder");

        Orders orders = new Orders();
        orderService.addOrder(orders);
        modelAndView.addObject("orderid", orders.getOrderNo());
//       orderService.saveOrderDetails(orders.getOrderNo());
        List<ProductOrder> productOrders = new ArrayList<>();

        Iterator<Map.Entry<String, String>> entries = allRequestParams.entrySet().iterator();

        while (entries.hasNext()) {
            ProductOrder productOrder = new ProductOrder();
            productOrder.setOrderId(orders.getOrderNo());


                Map.Entry<String, String> entry = entries.next();

                if (entry.getKey().contains("itemid")) {
                    System.out.println("item id FOUND " + entry.getValue());

                    Integer itemId = Integer.parseInt(entry.getValue());
                    productOrder.setProductId(itemId);
                    productOrders.add(productOrder);

                    if (entry.getKey().contains("item_quantity")) {

                        Integer qty = Integer.parseInt(entry.getValue());
                        productOrder.setQuantity(qty);
                    }
                    if (entry.getKey().contains("item_name")) {
                        String[] keyparts = entry.getKey().split("_");
                        System.out.println(keyparts[2] + " -> " + entry.getValue());

                    }
                    if (entry.getKey().contains("item_price")) {
                        String[] keyparts = entry.getKey().split("_");
                        Double unitPrice = Double.parseDouble(entry.getValue());
                        productOrder.setUnitPrice(unitPrice);

                    }

                }else{

                    System.out.println("iTem id not found !!!!!!");
                }


        }
        if (!productOrders.isEmpty()) {
            orderService.saveOrderDetails(orders.getOrderNo(), productOrders);
        } else {
           // orderService.deleteOrder(orders.getOrderNo());
            System.out.println("product orders is null");
        }

         return  allRequestParams.toString();
        //return modelAndView;
    }

    @GetMapping(path = "/place")
    public String getProducts() {
        //@RequestParam Map<String,String> allRequestParams,Model model
//        allRequestParams.get()
        return "placeorder";
    }

}
