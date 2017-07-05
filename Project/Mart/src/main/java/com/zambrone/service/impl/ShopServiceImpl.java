package com.zambrone.service.impl;

import com.zambrone.dao.ShopDAO;
import com.zambrone.entity.Shop;
import com.zambrone.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chamith on 05/07/2017.
 */
@Repository
public class ShopServiceImpl implements ShopService {

    @Autowired
    ShopDAO shopDAO;


    /**
     *
     * @return
     */
    private ShopDAO getShopDAO(){
        return (this.shopDAO instanceof ShopDAO) ? this.shopDAO: null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void registerNewShop(Shop shop) throws DataAccessException {
        getShopDAO().registerNewShop(shop);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public List<Shop> getAllShop() throws DataAccessException {
        System.out.println(".............................Service...................");
        return getShopDAO().getAllShop();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public Shop getShopByName(String name) throws DataAccessException {
        return getShopDAO().getShopByName(name);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public Shop getShopByID(Integer id) throws DataAccessException {
        return getShopDAO().getShopByID(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public Shop getShopByPhone(String phone) throws DataAccessException {
        return getShopDAO().getShopByPhone(phone);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void updateShop(Shop shop) throws DataAccessException {
        getShopDAO().updateShop(shop);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void removeShop(Integer id) throws DataAccessException {
        getShopDAO().removeShop(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public List<Shop> getShopByCategory(String category) throws DataAccessException {
        return getShopDAO().getShopByCategory(category);
    }


}
