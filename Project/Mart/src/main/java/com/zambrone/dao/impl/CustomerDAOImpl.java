package com.zambrone.dao.impl;

import com.zambrone.dao.CustomerDAO;
import com.zambrone.entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Chamith on 04/07/2017.
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * @return
     */
    private SessionFactory getSessionFactory() {
        return (this.sessionFactory instanceof SessionFactory) ? this.sessionFactory : null;
    }

    /**
     * @return
     */
    private Session getSessionFactoryCurrentSession() {
        return getSessionFactory().openSession();
    }

    @Override
    public void registerNewCustomer(Customer customer) {
        try {
            getSessionFactoryCurrentSession().saveOrUpdate(customer);
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Customer> getAllCustomer() throws DataAccessException {
        System.out.println(".............................REpository...................");
        return (List<Customer>) getSessionFactoryCurrentSession()
                .createCriteria(Customer.class)
                .addOrder(Order.desc("companyName"))
                .list();
    }

    @Override
    public Customer getCustomerByName(String name) throws DataAccessException {
        System.out.println("...............Repository..................");
        return (Customer) getSessionFactoryCurrentSession()
                .createCriteria(Customer.class)
                .add(Restrictions.eq("companyName", name))
                .uniqueResult();
    }

    @Override
    public Customer getCustomerByID(Integer id) throws DataAccessException {
        return (Customer) getSessionFactoryCurrentSession()
                .createCriteria(Customer.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

    @Override
    public Customer getCustomerByPhone(String phone) throws DataAccessException {
        return (Customer) getSessionFactoryCurrentSession()
                .createQuery("from Customer c where c.mobileNo=:pn")
                .setParameter("pn", phone)
                .uniqueResult();
    }

    @Override
    public Customer getCustomerByEmail(String email) throws DataAccessException {
        return (Customer) getSessionFactoryCurrentSession()
                .createQuery("from Customer c where c.mobileNo=:email")
                .setParameter("email", email)
                .uniqueResult();
    }

    @Override
    public void updateCustomer(Customer customer) throws DataAccessException {
        getSessionFactoryCurrentSession().saveOrUpdate(customer);
    }

    @Override
    public void removeCustomer(Integer id) throws DataAccessException {
        int executeUpdate = getSessionFactoryCurrentSession()
                .createQuery("delete from Customer c where c.id=:id")
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<Customer> getCustomerByType(String type) throws DataAccessException {
        return (List<Customer>) getSessionFactoryCurrentSession()
                .createSQLQuery("select * from CUSTOMER c where c.TYPE=:type")
                .setParameter("type", type)
                .list();
    }
}
