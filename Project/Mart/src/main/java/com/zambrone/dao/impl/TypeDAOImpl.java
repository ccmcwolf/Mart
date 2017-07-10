package com.zambrone.dao.impl;

import com.zambrone.dao.TypeDAO;
import com.zambrone.entity.Type;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chamith on 09/07/2017.
 */
@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class TypeDAOImpl implements TypeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public TypeDAOImpl() {
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }


    @Override
    public boolean addType(Type type) throws DataAccessException {
        Session session = this.getSessionFactory().openSession();
        session.save(type);
        session.close();

        return true;

    }

    @Override
    public boolean deleteTypeById(Integer id) throws DataAccessException {
        return false;
    }

    @Override
    public Type searchTypeById(Integer id) throws DataAccessException {
        return null;
    }

    @Override
    public List<Type> getAllType() throws DataAccessException {
        System.out.println(".............................Repository...................");
        return (List<Type>) getSessionFactory().openSession()
                .createCriteria(Type.class)
                .list();
    }

    @Override
    public Integer searchTypeCount() throws DataAccessException {
        return null;
    }

    @Override
    public Type searchTypeByName(String name) throws DataAccessException {
        return null;
    }
}
