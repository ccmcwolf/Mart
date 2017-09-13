package com.zambrone.dao.impl;

import com.zambrone.dao.ProductDAO;
import com.zambrone.entity.Product;
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
 * Created by Chamith on 03/07/2017.
 */

@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class ProductDAOImpl implements ProductDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public ProductDAOImpl(){}

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public boolean addNewProduct(Product product) throws DataAccessException {
        Session session = this.getSessionFactory().openSession();
        session.save(product);
        session.close();
        return true;
    }

    @Override
    public List<Product> getAllProduct() throws DataAccessException {
       return (List<Product>) getSessionFactory().openSession()
                .createCriteria(Product.class)
                .list();
    }

    @Override
    public List<Product> getProductByShopId(int shopId) throws DataAccessException {



        return (List<Product>) getSessionFactory().openSession()
                .createCriteria(Product.class)
                .add(Restrictions.eq("shopId", shopId))
                .list();
    }

    @Override
    public Product getProductByName(String name) throws DataAccessException {
        return null;
    }

    @Override
    public Product getProductByID(Integer id) throws DataAccessException {
        return (Product) getSessionFactory().openSession()
                .createCriteria(Product.class)
                .add(Restrictions.eq("productId", id))
                .uniqueResult();
    }

    @Override
    public void updateProduct(Product product) throws DataAccessException {
        getSessionFactory().openSession().saveOrUpdate(product);
    }

    @Override
    public void removeProduct(Integer id) throws DataAccessException {
        getSessionFactory().openSession()
                .createQuery("delete from Product p where p.productId=:productId")
                .setParameter("productId", id)
                .executeUpdate();
    }
}
