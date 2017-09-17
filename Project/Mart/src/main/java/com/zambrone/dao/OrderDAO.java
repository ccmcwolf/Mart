package com.zambrone.dao;

import com.zambrone.entity.Orders;
import org.hibernate.HibernateException;
import org.springframework.dao.DataAccessException;

/**
 * Created by Chamith on 13/09/2017.
 */
public interface OrderDAO {

    public void saveOrder(Orders orders) throws DataAccessException;
    public void update(Orders orders) throws DataAccessException;
    public boolean removeOrder(Integer orderId) throws DataAccessException;
    public Integer getShopIDbyOrderNo(Integer orderNo) throws  DataAccessException;

//    public List<Orders> getOrdersByShopId(int shopNo)throws DataAccessException;
    public Orders getOrderByOrderId(Integer orderId)throws DataAccessException;
}
