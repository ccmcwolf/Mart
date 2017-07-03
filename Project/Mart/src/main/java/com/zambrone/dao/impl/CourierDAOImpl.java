package com.zambrone.dao.impl;

import com.zambrone.dao.CourierDAO;
import com.zambrone.entity.Courier;
import com.zambrone.entity.Users;
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

    @Override
    public List<Courier> getAllCourier() throws DataAccessException {
        System.out.println(".............................Repository...................");
        return (List<Courier>) getSessionFactory().openSession()
                .createCriteria(Courier.class)
                .list();
    }

    @Override
    public List<Courier> getCourierByCity(String city) throws DataAccessException {

        return (List<Courier>)  getSessionFactory().openSession()
                .createSQLQuery("select * from courier c where c.city = :city")
                .addEntity(Courier.class)
                .setParameter("city", city)
                .list();
    }

    @Override
    public List<Courier> getCourierByDistrict(String district) throws DataAccessException {
        return (List<Courier>)  getSessionFactory().openSession()
                .createSQLQuery("select * from courier c where c.province = :province")
                .addEntity(Courier.class)
                .setParameter("province", district)
                .list();
    }

    @Override
    public Courier getCourierByName(String name) throws DataAccessException {
        return (Courier)  getSessionFactory().openSession()
                .createSQLQuery("select * from courier c where c.courier_name = :name")
                .addEntity(Courier.class)
                .setParameter("name", name)
                .list();
    }

    @Override
    public Courier getCourierByID(Integer id) throws DataAccessException {
        return (Courier)  getSessionFactory().openSession()
                .createSQLQuery("select * from courier c where c.courierId = :id")
                .addEntity(Courier.class)
                .setParameter("id", id)
                .list();
    }

    @Override
    public Courier getCourierByPhone(String phone) throws DataAccessException {
        return (Courier)  getSessionFactory().openSession()
                .createSQLQuery("select * from courier c where c.contact_no = :phone")
                .addEntity(Courier.class)
                .setParameter("phone", phone)
                .list();
    }

    @Override
    public Courier getCourierByEmail(String email) throws DataAccessException {
        return (Courier)  getSessionFactory().openSession()
                .createSQLQuery("select * from courier c where c.email= :email")
                .addEntity(Courier.class)
                .setParameter("email", email)
                .list();
    }

    @Override
    public void updateCourier(Courier courier) throws DataAccessException {
        getSessionFactory().openSession().saveOrUpdate(courier);
    }

    @Override
    public void removeCourier(Integer id) throws DataAccessException {
        getSessionFactory().openSession()
                .createQuery("delete from Courier c where c.courierId=:courierID")
                .setParameter("courierID", id)
                .executeUpdate();
    }
}
