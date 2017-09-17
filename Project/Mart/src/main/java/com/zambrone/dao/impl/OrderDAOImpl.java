package com.zambrone.dao.impl;

import com.zambrone.dao.OrderDAO;
import com.zambrone.entity.Orders;
import com.zambrone.entity.Product;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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


    /**
     *
     * @return
     */
    private SessionFactory getSessionFactory() {
        return (this.sessionFactory instanceof SessionFactory) ? this.sessionFactory : null;
    }

    /**
     *
     * @return
     */
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
        System.out.println("! shop found"+list.get(0));
        Integer shopId = (Integer) list.get(0);
        return shopId;
    }

    @Override
    public Orders getOrderByOrderId(Integer orderId) throws DataAccessException {
        return getSessionFactoryCurrentSession().get(Orders.class, orderId);
    }
}
