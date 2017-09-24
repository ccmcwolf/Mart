package com.zambrone.service;


import com.zambrone.entity.Orders;
import com.zambrone.entity.Product;
import com.zambrone.entity.ProductOrder;
import org.hibernate.HibernateException;
import org.springframework.dao.DataAccessException;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by Chamith on 13/09/2017.
 */
public interface OrderService {

     void addOrder(Orders orders) throws DataAccessException;
     void updateOrder(Orders orders) throws DataAccessException;
     Integer getShopIDbyOrderNo(Integer orderNo) throws DataAccessException;
     void saveOrderDetails(Integer orderId, List<ProductOrder> productOrders) throws DataAccessException;
     Orders getOrderByOrderId(Integer orderId) throws DataAccessException;
     List<ProductOrder>  getOrderDetailsByOrderId(int orderId) throws DataAccessException;
     List<Product> getProductsByOrderId(int orderId) throws DataAccessException;
     void deleteOrder(int orderId) throws HibernateException,DataAccessException;

     //    -------------total counts--------
     BigInteger getTotalNumberOfOrdersAll() throws DataAccessException; //done
     BigInteger getTotalNumberOfOrdersByDate(String date) throws DataAccessException; //done

     BigInteger getTotalNumberOfActiveOrders() throws DataAccessException;
     BigInteger getTotalNumberOfCompleted() throws DataAccessException;

     //    -------------order by shop counts--------
     BigInteger getNumberOfOrdersByShopId(int shopId) throws DataAccessException;//done
     BigInteger getNumberOfOrdersByShopIdByDate(int shopId,String date) throws DataAccessException;
     BigInteger getNumberOfOrdersByShopIdByWeek(int shopId,int weekNo) throws DataAccessException;
     BigInteger getNumberOfOrdersByShopIdByMonth(int shopId,int monthNo) throws DataAccessException;
     BigInteger getNumberOfOrdersByShopIdByYear(int shopId,int monthNo) throws DataAccessException;
     BigInteger getTotalNumberOfActiveOrdersByShopId(int shopId) throws DataAccessException;
     BigInteger getTotalNumberOfCompletedByShopId(int shopId) throws DataAccessException;


     //    -------------Orders--------
     List<Orders> getAllOrders(int limit) throws DataAccessException;//done
     List<Orders> getOrdersByDate(int limit,String date) throws DataAccessException;//done
     List<Orders> getOrdersBetweenTwoDays(int limit,String startDate,String endDate) throws DataAccessException;//done
     List<Orders> getOrdersUnDeliveredOrdersByArea(int limit,String startDate,String endDate) throws DataAccessException;//done
     List<Orders> getActiveOrdersByShopId(int limit,int shopId) throws DataAccessException;//done
     List<Orders> getCompletedOrderByShopId(int limit,int shopId) throws DataAccessException;



}
