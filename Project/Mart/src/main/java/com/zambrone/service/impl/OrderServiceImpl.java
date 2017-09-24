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

import java.math.BigInteger;
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
    public void updateOrder(Orders orders) throws DataAccessException {
        orderDAO.update(orders);
        System.out.println("update Service order called");
    }

    @Override
    public Integer getShopIDbyOrderNo(Integer orderNo) throws DataAccessException {
        return orderDAO.getShopIDbyOrderNo(orderNo);
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

    @Override
    public BigInteger getTotalNumberOfOrdersAll() throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getTotalNumberOfOrdersByDate(String date) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getTotalNumberOfActiveOrders() throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getTotalNumberOfCompleted() throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getNumberOfOrdersByShopId(int shopId) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getNumberOfOrdersByShopIdByDate(int shopId, String date) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getNumberOfOrdersByShopIdByWeek(int shopId, int weekNo) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getNumberOfOrdersByShopIdByMonth(int shopId, int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getNumberOfOrdersByShopIdByYear(int shopId, int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getTotalNumberOfActiveOrdersByShopId(int shopId) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getTotalNumberOfCompletedByShopId(int shopId) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getAllOrders(int limit) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getOrdersByDate(int limit, String date) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getOrdersBetweenTwoDays(int limit, String startDate, String endDate) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getOrdersUnDeliveredOrdersByArea(int limit, String startDate, String endDate) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getActiveOrdersByShopId(int limit, int shopId) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getCompletedOrderByShopId(int limit, int shopId) throws DataAccessException {
        return null;
    }


}
