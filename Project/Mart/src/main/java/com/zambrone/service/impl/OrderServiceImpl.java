package com.zambrone.service.impl;

import com.zambrone.dao.OrderDAO;
import com.zambrone.dao.OrderDetailDAO;
import com.zambrone.dao.ProductDAO;
import com.zambrone.entity.Orders;
import com.zambrone.entity.Product;
import com.zambrone.entity.ProductOrder;
import com.zambrone.service.OrderService;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chamith on 13/09/2017.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO orderDAO;

    @Autowired
    OrderDetailDAO orderDetailDAO;

    @Autowired
    ProductDAO productDAO;



    @Override
    public void addOrder(Orders orders) throws DataAccessException {
        orderDAO.saveOrder(orders);
    }

    @Override
    public void saveOrderDetails(Integer orderId, List<ProductOrder> productOrders) throws DataAccessException {
        for (ProductOrder productOrder:productOrders) {
            orderDetailDAO.saveOrderDetail(productOrder);
        }
    }

    @Override
    public Orders getOrderByOrderId(Integer orderId) throws DataAccessException {
        return orderDAO.getOrderByOrderId(orderId);
    }

    @Override
    public List<ProductOrder> getOrderDetailsByOrderId(int orderId) throws DataAccessException {
        return orderDetailDAO.getOrderDetailsByOrderId(orderId);
    }

    @Override
    public List<Product> getProductsByOrderId(int orderId) throws DataAccessException {
        List<Integer> productIds = orderDetailDAO.getProductIdsOfOrderByOrderId(orderId);
        List<Product> products = new ArrayList<>();
        for (Integer productId:productIds) {
            Product productByID = productDAO.getProductByID(productId);
            products.add(productByID);
            System.out.println(productByID.getName());
        }
        return products;
    }

    @Override
    public void deleteOrder(int orderId) throws HibernateException, DataAccessException {
       orderDAO.removeOrder(orderId);
    }


}
