package com.zambrone.dao.impl;

import com.zambrone.dao.UserDAO;
import com.zambrone.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Chamith on 17/09/2017.
 */
@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class UserDAOImpl implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public UserDAOImpl(){}

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     *
     * @return
     */
    private Session getSessionFactoryCurrentSession() {
        return getSessionFactory().openSession();
    }


    @Override
    public void addUser(User user) {
            getSessionFactoryCurrentSession().save(user);

    }

    @Override
    public void deleteUser(Integer userId) {
        getSessionFactoryCurrentSession().delete(userId);
    }

    @Override
    public User searchUser(Integer userId) {
        return getSessionFactoryCurrentSession().get(User.class, userId);

    }

    @Override
    public int searchUserCount() {
        return 0;
    }

    @Override
    public void updateUser(User user, String userName) {
        Session session = getSessionFactoryCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.flush();
        session.close();
        System.out.println("User Updated Successfully" +user.toString());
    }


}
