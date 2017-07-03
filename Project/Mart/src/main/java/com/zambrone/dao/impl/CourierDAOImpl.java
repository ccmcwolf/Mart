package com.zambrone.dao.impl;

import com.zambrone.dao.CourierDAO;
import com.zambrone.entity.Courier;
import com.zambrone.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chamith on 02/07/2017.
 */

@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class CourierDAOImpl implements CourierDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public CourierDAOImpl() {
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean addCourier(Courier courier) {
        Session session = this.getSessionFactory().openSession();
        session.save(courier);
        session.close();

        return true;
    }
}
