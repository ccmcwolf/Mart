package com.zambrone.service;

import com.zambrone.entity.Shop;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 05/07/2017.
 */
public interface ShopService {
    /**
     *
     * @param shop
     * @throws DataAccessException
     */
    public void registerNewShop(Shop shop) throws DataAccessException;

    /**
     *
     * @return @throws DataAccessException
     */
    public List<Shop> getAllShop() throws DataAccessException;

    /**
     *
     * @param name
     * @return
     * @throws DataAccessException
     */
    public Shop getShopByName(String name) throws DataAccessException;

    /**
     *
     * @param id
     * @return
     * @throws DataAccessException
     */
    public Shop getShopByID(Integer id) throws DataAccessException;

    /**
     *
     * @param phone
     * @return
     * @throws DataAccessException
     */
    public Shop getShopByPhone(String phone) throws DataAccessException;

    /**
     *
     * @param shop
     * @throws DataAccessException
     */
    public void updateShop(Shop shop) throws DataAccessException;

    /**
     *
     * @param id
     * @throws DataAccessException
     */
    public void removeShop(Integer id) throws DataAccessException;

    public List<Shop> getShopByCategory(String category) throws DataAccessException;
}
