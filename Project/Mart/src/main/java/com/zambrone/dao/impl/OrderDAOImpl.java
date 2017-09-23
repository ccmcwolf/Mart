package com.zambrone.dao.impl;

import com.zambrone.dao.OrderDAO;
import com.zambrone.entity.Orders;
import com.zambrone.entity.Product;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static org.hibernate.criterion.Restrictions.eq;

/**
 * Created by Chamith on 13/09/2017.
 */
@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class OrderDAOImpl implements OrderDAO {


    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private Session getSessionFactoryCurrentSession() {
        return getSessionFactory().openSession();
    }

    @Override
    public void saveOrder(Orders orders) throws DataAccessException {
       getSessionFactoryCurrentSession().save(orders);
    }

    @Override
    public void update(Orders orders) throws DataAccessException {

        Session session = getSessionFactoryCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(orders);
        transaction.commit();
        session.flush();
        session.close();
        System.out.println("update DAOIMPL order called" +orders.toString());
    }

    @Override
    public boolean removeOrder(Integer orderId) throws DataAccessException {

        boolean result = true;
        try {
            getSessionFactoryCurrentSession().beginTransaction();
            Orders orders = (Orders) getSessionFactoryCurrentSession().get(Orders.class, orderId);
            getSessionFactoryCurrentSession().delete(orders);
            getSessionFactoryCurrentSession().getTransaction().commit();
        }
        catch (HibernateException e) {
            e.printStackTrace();
            getSessionFactoryCurrentSession().getTransaction().rollback();
             result = false;
        }
        return result;
    }

    @Override
    public Integer getShopIDbyOrderNo(Integer orderNo) throws DataAccessException {

        List list = getSessionFactoryCurrentSession().createSQLQuery("SELECT shop_id FROM product WHERE product_id IN (SELECT product_id FROM product_order WHERE order_id = 157) ").list();
        //List list = getSessionFactoryCurrentSession().createSQLQuery("SELECT shop_id FROM product WHERE product_id IN (SELECT product_id FROM product_order WHERE order_id = "+orderNo+") ").list();
        System.out.println("! shop found"+list.get(0));
        Integer shopId = (Integer) list.get(0);
        return shopId;
    }

    @Override
    public Orders getOrderByOrderId(Integer orderId) throws DataAccessException {
        return getSessionFactoryCurrentSession().get(Orders.class, orderId);
    }

    @Override
    public Long getTotalNumberOfOrdersAll() throws DataAccessException {
        //return (Integer) getSessionFactoryCurrentSession().createCriteria("Orders").setProjection(Projections.rowCount()).uniqueResult();
        return (Long)getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders").uniqueResult();
    }

    @Override
    public Long getTotalNumberOfOrdersByDate(Date date) throws DataAccessException {
        return null;
    }

    @Override
    public Long getTotalNumberOfOrdersByWeek(int weekNo) throws DataAccessException {
        return null;
    }

    @Override
    public Long getTotalNumberOfOrdersByMonth(int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public Long getTotalNumberOfOrdersByYear(int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public Long getTotalNumberOfActiveOrders() throws DataAccessException {
        return null;
    }

    @Override
    public Long getTotalNumberOfCompleted() throws DataAccessException {
        return null;
    }

    @Override
    public Long getNumberOfOrdersByShopId(int shopId) throws DataAccessException {
        return null;
    }

    @Override
    public Long getNumberOfOrdersByShopIdByDate(int shopId, Date date) throws DataAccessException {
        return null;
    }

    @Override
    public Long getNumberOfOrdersByShopIdByWeek(int shopId, int weekNo) throws DataAccessException {
        return null;
    }

    @Override
    public Long getNumberOfOrdersByShopIdByMonth(int shopId, int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public Long getNumberOfOrdersByShopIdByYear(int shopId, int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public Long getTotalNumberOfActiveOrdersByShopId(int shopId) throws DataAccessException {
        return null;
    }

    @Override
    public Long getTotalNumberOfCompletedByShopId(int shopId) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getAllOrders(int limit) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getOrdersByDate(int limit, Date date) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getOrdersByWeek(int limit, int weekNo) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getOrdersByMonth(int limit, int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getOrdersByYear(int limit, int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getActiveOrdersByShopId(int limit, int shopId) throws DataAccessException {
        return null;
    }

    @Override
    public List<Orders> getCompletedByShopId(int limit, int shopId) throws DataAccessException {
        return null;
    }


}
