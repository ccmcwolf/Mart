package com.zambrone.service;


import com.zambrone.entity.Orders;
import com.zambrone.entity.Product;
import com.zambrone.entity.ProductOrder;
import org.hibernate.HibernateException;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 13/09/2017.
 */
public interface OrderService {
    public void addOrder(Orders orders) throws DataAccessException;

    public void updateOrder(Orders orders) throws DataAccessException;

    public Integer getShopIDbyOrderNo(Integer orderNo) throws DataAccessException;

    public void saveOrderDetails(Integer orderId, List<ProductOrder> productOrders) throws DataAccessException;

    public Orders getOrderByOrderId(Integer orderId) throws DataAccessException;

    public List<ProductOrder>  getOrderDetailsByOrderId(int orderId) throws DataAccessException;

    public List<Product> getProductsByOrderId(int orderId) throws DataAccessException;

    public void deleteOrder(int orderId) throws HibernateException,DataAccessException;

}
