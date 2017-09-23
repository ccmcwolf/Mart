package com.zambrone.dao.impl;

import com.zambrone.dao.UserDAO;
import com.zambrone.dao.UserRoleDAO;
import com.zambrone.entity.UserRoles;
import com.zambrone.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chamith on 21/09/2017.
 */
@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class UserRoleDAOImpl implements UserRoleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private SessionFactory getSessionFactory() {
        return (this.sessionFactory instanceof SessionFactory) ? this.sessionFactory : null;
    }

    private Session getSessionFactoryCurrentSession() {
        return getSessionFactory().openSession();
    }


    @Override
    public void addUserRole(UserRoles userRoles) throws DataAccessException {
        System.out.println(userRoles);
        System.out.println("DAO user role add is called");
        Session session = getSessionFactoryCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(userRoles);
        transaction.commit();
        session.flush();
        session.close();
    }

    @Override
    public void deleteUserRole(Integer roleid) throws DataAccessException {

    }

    @Override
    public void deleteUserRoleName(String rolename) throws DataAccessException {

    }

    @Override
    public UserRoles searchUserRole(String userName) throws DataAccessException {
        return null;
    }

    @Override
    public int searchUserCount() throws DataAccessException {
        return 0;
    }

    @Override
    public void updateUserRole(UserRoles userRoles) throws DataAccessException {
        System.out.println(userRoles);
        System.out.println("DAO user role add is called");
        Session session = getSessionFactoryCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(userRoles);
        transaction.commit();
        session.flush();
        session.close();
    }
}
