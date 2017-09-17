package com.zambrone.dao.impl;

import com.zambrone.dao.ProductDAO;
import com.zambrone.entity.Product;
import com.zambrone.entity.ProductOrder;
import org.hibernate.Criteria;
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


    /**
     *
     * @return
     */
    private Session getSessionFactoryCurrentSession() {
        return getSessionFactory().openSession();
    }


    @Override
    public boolean addNewProduct(Product product) throws DataAccessException {
        Session session = getSessionFactoryCurrentSession();
        session.save(product);
        session.close();
        return true;
    }

    @Override
    public List<Product> getAllProduct() throws DataAccessException {
       return (List<Product>) getSessionFactoryCurrentSession()
                .createCriteria(Product.class)
                .list();
    }

    @Override
    public List<Product> getProductByShopId(int shopId) throws DataAccessException {

        return (List<Product>) getSessionFactoryCurrentSession()
                .createCriteria(Product.class)
                .add(Restrictions.eq("shopId", shopId))
                .list();
    }

    @Override
    public Product getProductByName(String name) throws DataAccessException {
        return null;
    }

    @Override
    public Integer getShopIDByProductNo(Integer productID) throws DataAccessException {

        Session currentSession=null;
        try {
            System.out.println("productID "+productID);
            currentSession = getSessionFactoryCurrentSession();
            ProductOrder productOrder =  (ProductOrder) currentSession.get(ProductOrder.class, productID);
            System.out.println("product Order "+productOrder);
            //if(pr)
            Integer productId = productOrder.getProductId();
            Product product = getProductByID(productId);

            return product.getShopId();

        } finally {
        if(currentSession!=null){
            currentSession.close();
        }
        }
    }

    @Override
    public Product getProductByID(Integer id) throws DataAccessException {
        Session session = getSessionFactoryCurrentSession();
        try {
            return (Product) session
                    .createCriteria(Product.class)
                    .add(Restrictions.eq("productId", id))
                    .uniqueResult();
        }finally {
            session.close();
        }
    }

    @Override
    public void updateProduct(Product product) throws DataAccessException {
        getSessionFactoryCurrentSession().saveOrUpdate(product);
    }

    @Override
    public void removeProduct(Integer id) throws DataAccessException {
        getSessionFactoryCurrentSession()
                .createQuery("delete from Product p where p.productId=:productId")
                .setParameter("productId", id)
                .executeUpdate();
    }
}
