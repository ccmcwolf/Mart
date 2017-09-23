package com.zambrone.dao;

import com.zambrone.entity.Orders;
import org.hibernate.HibernateException;
import org.springframework.dao.DataAccessException;

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
    Long getTotalNumberOfOrdersAll() throws DataAccessException;
    Long getTotalNumberOfOrdersByDate(Date date) throws DataAccessException;
    Long getTotalNumberOfOrdersByWeek(int weekNo) throws DataAccessException;
    Long getTotalNumberOfOrdersByMonth(int monthNo) throws DataAccessException;
    Long getTotalNumberOfOrdersByYear(int monthNo) throws DataAccessException;
    Long getTotalNumberOfActiveOrders() throws DataAccessException;
    Long getTotalNumberOfCompleted() throws DataAccessException;

    //    -------------order by shop counts--------
    Long getNumberOfOrdersByShopId(int shopId) throws DataAccessException;
    Long getNumberOfOrdersByShopIdByDate(int shopId,Date date) throws DataAccessException;
    Long getNumberOfOrdersByShopIdByWeek(int shopId,int weekNo) throws DataAccessException;
    Long getNumberOfOrdersByShopIdByMonth(int shopId,int monthNo) throws DataAccessException;
    Long getNumberOfOrdersByShopIdByYear(int shopId,int monthNo) throws DataAccessException;
    Long getTotalNumberOfActiveOrdersByShopId(int shopId) throws DataAccessException;
    Long getTotalNumberOfCompletedByShopId(int shopId) throws DataAccessException;


    //    -------------Orders--------
    List<Orders> getAllOrders(int limit) throws DataAccessException;
    List<Orders> getOrdersByDate(int limit,Date date) throws DataAccessException;
    List<Orders> getOrdersByWeek(int limit,int weekNo) throws DataAccessException;
    List<Orders> getOrdersByMonth(int limit,int monthNo) throws DataAccessException;
    List<Orders> getOrdersByYear(int limit,int monthNo) throws DataAccessException;
    List<Orders> getActiveOrdersByShopId(int limit,int shopId) throws DataAccessException;
    List<Orders> getCompletedByShopId(int limit,int shopId) throws DataAccessException;


}
