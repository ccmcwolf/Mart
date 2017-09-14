package com.zambrone.dao.impl;

import com.zambrone.dao.OrderDetailDAO;
import com.zambrone.dao.ProductDAO;
import com.zambrone.entity.ProductOrder;
import com.zambrone.entity.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chamith on 13/09/2017.
 */
@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class OrderDetailDAOImpl implements OrderDetailDAO {

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
    public void saveOrderDetail(ProductOrder productOrder) throws DataAccessException {
        getSessionFactoryCurrentSession().save(productOrder);

    }

    @Override
    public void updateOrderDetailById(ProductOrder productOrderiD) throws DataAccessException {
         getSessionFactoryCurrentSession().saveOrUpdate(productOrderiD);
    }

    @Override
    public boolean removeOrderDetail(ProductOrder productOrder) throws DataAccessException {
        return false;
    }

    @Override
    public List<ProductOrder> getOrderDetailsByOrderId(int orderId) throws DataAccessException {
        return (List<ProductOrder>) getSessionFactoryCurrentSession()
                .createSQLQuery("select * from product_order p where p.order_id=:oid")
                .setParameter("oid", orderId)
                .list();
    }

    @Override
    public List<Integer> getProductIdsOfOrderByOrderId(int orderId) throws DataAccessException {
        return (List<Integer>) getSessionFactoryCurrentSession()
                .createSQLQuery("select product_id from product_order p where p.order_id=:oid")
                .setParameter("oid", orderId)
                .list();
    }
}
