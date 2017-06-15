package com.zambrone.dao.impl;

/**
 * Created by Chamith on 11/06/2017.
 */
import java.util.List;

import com.zambrone.dao.UsersDAO;
import com.zambrone.entity.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class UsersDAOImpl implements UsersDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public UsersDAOImpl() {
    }

    public boolean addUser(Users users) {
        Session session = this.getSessionFactory().getCurrentSession();
        session.saveOrUpdate(users);
        return true;
    }

    public boolean updateUser(Users users, String oldEmail) {
        Session session = this.getSessionFactory().getCurrentSession();
        String hql = "update Users u set u.email=:email,u.firstName=:firstName where u.email=:emails";
        Query query = session.createQuery(hql);
        query.setParameter("email", users.getEmail());
        query.setParameter("emails", oldEmail);
        query.setParameter("firstName", users.getFirstName() + users.getLastName());
        return query.executeUpdate() > 0;
    }

    public boolean deleteUser(String email) {
        Session session = this.getSessionFactory().getCurrentSession();
        String hql = "delete from Users u where u.email=:email";
        Query query = session.createQuery(hql);
        query.setParameter("email", email);
        return query.executeUpdate() > 0;
    }

    public Users searchUser(String email) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "from Users u where u.email =:email";
        Query query = session.createQuery(hql);
        query.setParameter("email", email);
        List list = query.list();
        return list.size() > 0?(Users)list.get(0):null;
    }

    public List<Users> searchAllUsers(int from, int to) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "from Users";
        Query query = session.createQuery(hql);
        query.setFirstResult(from);
        query.setMaxResults(to);
        return query.list();
    }

    public List<Users> searchUserbyFirstName(String fname) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "from Users u where u.firstName =:firstName";
        Query query = session.createQuery(hql);
        query.setParameter("firstName", fname);
        return query.list();
    }

    public List<Users> searchUserbyLastName(String lname) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "from Users u where u.lastName =:lastName";
        Query query = session.createQuery(hql);
        query.setParameter("lastName", lname);
        return query.list();
    }

    public List<Users> searchUserbyUserType(String userType) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "from Users u where u.userType =:userType";
        Query query = session.createQuery(hql);
        query.setParameter("userType", userType);
        return query.list();
    }

    public int searchUserCount() {
        Session session = this.getSessionFactory().getCurrentSession();
        String hql = "select count(u) from Users u";
        Query query = session.createQuery(hql);
        List<Long> count = query.list();
        return ((Long)count.get(0)).intValue();
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
