package com.zambrone.dao;

import com.zambrone.entity.Orders;
import org.hibernate.HibernateException;
import org.springframework.dao.DataAccessException;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Created by Chamith on 13/09/2017.
 */
public interface OrderDAO {

    //--------------basic-----------------------
    void saveOrder(Orders orders) throws DataAccessException;
    void update(Orders orders) throws DataAccessException;
    boolean removeOrder(Integer orderId) throws DataAccessException;
    Integer getShopIDbyOrderNo(Integer orderNo) throws DataAccessException;
    Orders getOrderByOrderId(Integer orderId) throws DataAccessException;

    //    -------------total counts--------
    BigInteger getTotalNumberOfOrdersAll() throws DataAccessException; //done
    BigInteger getTotalNumberOfOrdersByDate(String date) throws DataAccessException; //done
    BigInteger getTotalNumberOfOrdersByWeek(int weekNo) throws DataAccessException;
    BigInteger getTotalNumberOfOrdersByMonth(int monthNo) throws DataAccessException;
    BigInteger getTotalNumberOfOrdersByYear(int monthNo) throws DataAccessException;
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
    List<Orders> getOrdersByWeek(int limit,int weekNo) throws DataAccessException;
    List<Orders> getOrdersByMonth(int limit,int monthNo) throws DataAccessException;
    List<Orders> getOrdersByYear(int limit,int year) throws DataAccessException;
    List<Orders> getActiveOrdersByShopId(int limit,int shopId) throws DataAccessException;//done
    List<Orders> getCompletedOrderByShopId(int limit,int shopId) throws DataAccessException;





}
