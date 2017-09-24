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

import javax.persistence.TemporalType;
import javax.xml.crypto.Data;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.hibernate.criterion.Restrictions.eq;
import static org.hibernate.type.StandardBasicTypes.DATE;

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
        System.out.println("update DAOIMPL order called" + orders.toString());
    }

    @Override
    public boolean removeOrder(Integer orderId) throws DataAccessException {

        boolean result = true;
        try {
            getSessionFactoryCurrentSession().beginTransaction();
            Orders orders = (Orders) getSessionFactoryCurrentSession().get(Orders.class, orderId);
            getSessionFactoryCurrentSession().delete(orders);
            getSessionFactoryCurrentSession().getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            getSessionFactoryCurrentSession().getTransaction().rollback();
            result = false;
        }
        return result;
    }

    @Override
    public Integer getShopIDbyOrderNo(Integer orderNo) throws DataAccessException {

        List list = getSessionFactoryCurrentSession().createSQLQuery("SELECT shop_id FROM product WHERE product_id IN (SELECT product_id FROM product_order WHERE order_id = 157) ").list();
        if (!list.isEmpty()) {
            System.out.println("! shop found" + list.get(0));
            Integer shopId = (Integer) list.get(0);
            return shopId;
        } else {
            return 0;
        }
    }

    @Override
    public Orders getOrderByOrderId(Integer orderId) throws DataAccessException {
        return getSessionFactoryCurrentSession().get(Orders.class, orderId);
    }

    @Override
    public BigInteger getTotalNumberOfOrdersAll() throws DataAccessException {
        return (BigInteger) getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders").uniqueResult();
    }

    @Override
    public BigInteger getTotalNumberOfOrdersByDate(String date) throws DataAccessException {
        return (BigInteger) getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders as o WHERE o.date='" + date + "'").uniqueResult();
    }

    @Override
    public BigInteger getTotalNumberOfOrdersByWeek(int weekNo) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getTotalNumberOfOrdersByMonth(int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getTotalNumberOfOrdersByYear(int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public BigInteger getTotalNumberOfActiveOrders() throws DataAccessException {
        return (BigInteger) getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders as o WHERE o.status='active'").uniqueResult();
    }

    @Override
    public BigInteger getTotalNumberOfCompleted() throws DataAccessException {
        return (BigInteger) getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders as o WHERE o.status='completed'").uniqueResult();
    }

    @Override
    public BigInteger getNumberOfOrdersByShopId(int shopId) throws DataAccessException {
        return (BigInteger) getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders as o WHERE o.shop_no='" + shopId + "'").uniqueResult();
    }

    @Override
    public BigInteger getNumberOfOrdersByShopIdByDate(int shopId, String date) throws DataAccessException {
        return (BigInteger) getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders as o WHERE o.shop_no='" + shopId + "' AND o.date='" + date + "'").uniqueResult();
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
        return (BigInteger) getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders as o WHERE o.shop_no='" + shopId + "'").uniqueResult();
    }

    @Override
    public BigInteger getTotalNumberOfCompletedByShopId(int shopId) throws DataAccessException {
        return (BigInteger) getSessionFactoryCurrentSession().createSQLQuery("select count(*) from Orders as o WHERE o.shop_no='" + shopId + "' AND o.status='completed'").uniqueResult();
    }

    @Override
    public List<Orders> getAllOrders(int limit) throws DataAccessException {

        return getSessionFactoryCurrentSession()
                .createQuery("FROM Orders ").setMaxResults(limit)
                .list();
    }

    @Override
    public List<Orders> getOrdersByDate(int limit, String date) throws DataAccessException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date frmDate = null;

        try {
            frmDate = format.parse(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return getSessionFactoryCurrentSession()
                .createQuery("FROM Orders AS o WHERE o.date = :stDate ").setMaxResults(limit)
                .setParameter("stDate", frmDate)
                .list();
    }

    @Override
    public List<Orders> getOrdersBetweenTwoDays(int limit, String startDate, String endDate) throws
            DataAccessException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date frmDate = null;
        Date enDate = null;
        try {
            frmDate = format.parse(startDate);
            enDate = format.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return getSessionFactoryCurrentSession()
                .createQuery("FROM Orders AS o WHERE o.date BETWEEN :stDate AND :edDate ")
                .setParameter("stDate", frmDate)
                .setParameter("edDate", enDate)
                .list();
    }

    @Override
    public List<Orders> getOrdersUnDeliveredOrdersByArea(int limit, String startDate, String endDate) throws
            DataAccessException {
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
        return getSessionFactoryCurrentSession()
                .createQuery("FROM Orders AS o WHERE o.shopNo = :shopId ").setMaxResults(limit)
                .setParameter("shopId", shopId)
                .list();
    }

    @Override
    public List<Orders> getCompletedOrderByShopId(int limit, int shopId) throws DataAccessException {
        return getSessionFactoryCurrentSession()
                .createQuery("FROM Orders AS o WHERE o.shopNo = :shopId and o.status=:isCompleted").setMaxResults(limit)
                .setParameter("shopId", shopId)
                .setParameter("isCompleted", "completed")
                .list();
    }


}
