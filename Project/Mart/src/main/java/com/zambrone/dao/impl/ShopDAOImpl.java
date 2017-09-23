package com.zambrone.dao.impl;

import com.zambrone.dao.ShopDAO;
import com.zambrone.entity.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Chamith on 05/07/2017.
 */
@Repository
@Transactional(
        propagation = Propagation.SUPPORTS
)
public class ShopDAOImpl implements ShopDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private SessionFactory getSessionFactory() {
        return (this.sessionFactory instanceof SessionFactory) ? this.sessionFactory : null;
    }
    private Session getSessionFactoryCurrentSession() {
        return getSessionFactory().openSession();
    }


    @Override
    public void registerNewShop(Shop shop) throws DataAccessException {
        getSessionFactoryCurrentSession().save(shop);
    }

    @Override
    public List<Shop> getAllShop() throws DataAccessException {
        System.out.println(".............................REpository...................");
        return (List<Shop>) getSessionFactoryCurrentSession()
                .createCriteria(Shop.class)
                .list();
    }

    @Override
    public Shop getShopByName(String name) throws DataAccessException {
        return (Shop) getSessionFactoryCurrentSession()
                .createCriteria(Shop.class)
                .add(Restrictions.eq("shopName", name))
                .uniqueResult();
    }

    @Override
    public Shop getShopByID(Integer id) throws DataAccessException {
        return (Shop) getSessionFactoryCurrentSession()
                .createCriteria(Shop.class)
                .add(Restrictions.eq("shopNo", id))
                .uniqueResult();
    }

    @Override
    public Shop getShopByPhone(String phone) throws DataAccessException {
        return (Shop) getSessionFactoryCurrentSession()
                .createQuery("from Shop s where s.contactNo=:pn")
                .setParameter("pn", phone)
                .uniqueResult();
    }

    @Override
    public void updateShop(Shop shop) throws DataAccessException {
        getSessionFactoryCurrentSession().saveOrUpdate(shop);
    }

    @Override
    public void removeShop(Integer id) throws DataAccessException {
       getSessionFactoryCurrentSession()
                .createQuery("delete from Shop s where s.contactNo=:id")
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<Shop> getShopByCategory(String category) throws DataAccessException {
        return (List<Shop>) getSessionFactoryCurrentSession()
                .createSQLQuery("select * from shop s where s.category=:cat")
                .setParameter("cat", category)
                .list();
    }

    @Override
    public Integer getTotalNumberOfShopsRegisteredAll() throws DataAccessException {
        return null;
    }

    @Override
    public Integer getTotalNumberOfShopsRegisteredDate(Date date) throws DataAccessException {
        return null;
    }

    @Override
    public Integer getTotalNumberOfShopsRegisteredByWeek(int weekNo) throws DataAccessException {
        return null;
    }

    @Override
    public Integer getTotalNumberOfShopsRegisteredByMonth(int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public Integer getTotalNumberOfShopsRegisteredByYear(int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public Integer getTotalNumberOfShopsRegisteredByCity(String city) throws DataAccessException {
        return null;
    }

    @Override
    public Integer getTotalNumberOfShopsRegisteredByCategory(int category) throws DataAccessException {
        return null;
    }

    @Override
    public Integer getTotalNumberOfShopsRegisteredByCityByCategory(String city, int category) throws DataAccessException {
        return null;
    }

    @Override
    public List<Shop> getTotalNumberOfShopsRegisteredAll(int limit) throws DataAccessException {
        return null;
    }

    @Override
    public List<Shop> getTotalNumberOfShopsRegisteredDate(int limit, Date date) throws DataAccessException {
        return null;
    }

    @Override
    public List<Shop> getTotalNumberOfShopsRegisteredByWeek(int limit, int weekNo) throws DataAccessException {
        return null;
    }

    @Override
    public List<Shop> getTotalNumberOfShopsRegisteredByMonth(int limit, int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public List<Shop> getTotalNumberOfShopsRegisteredByYear(int limit, int monthNo) throws DataAccessException {
        return null;
    }

    @Override
    public List<Shop> getTotalNumberOfShopsRegisteredByCity(int limit, String city) throws DataAccessException {
        return null;
    }

    @Override
    public List<Shop> getTotalNumberOfShopsRegisteredByCategory(int limit, int category) throws DataAccessException {
        return null;
    }

    @Override
    public List<Shop> getTotalNumberOfShopsRegisteredByCityByCategory(int limit, String city, int category) throws DataAccessException {
        return null;
    }
}
