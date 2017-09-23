package com.zambrone.dao;

import com.zambrone.entity.Shop;
import org.springframework.dao.DataAccessException;

import java.util.Date;
import java.util.List;

/**
 * Created by Chamith on 05/07/2017.
 */
public interface ShopDAO {

     void registerNewShop(Shop shop) throws DataAccessException;
     List<Shop> getAllShop() throws DataAccessException;
     Shop getShopByName(String name) throws DataAccessException;
     Shop getShopByID(Integer id) throws DataAccessException;
     Shop getShopByPhone(String phone) throws DataAccessException;
     void updateShop(Shop shop) throws DataAccessException;
     void removeShop(Integer id) throws DataAccessException;
     List<Shop> getShopByCategory(String category) throws DataAccessException;

     //    -------------total counts--------
     Integer getTotalNumberOfShopsRegisteredAll() throws DataAccessException;
     Integer getTotalNumberOfShopsRegisteredDate(Date date) throws DataAccessException;
     Integer getTotalNumberOfShopsRegisteredByWeek(int weekNo) throws DataAccessException;
     Integer getTotalNumberOfShopsRegisteredByMonth(int monthNo) throws DataAccessException;
     Integer getTotalNumberOfShopsRegisteredByYear(int monthNo) throws DataAccessException;

     Integer getTotalNumberOfShopsRegisteredByCity(String city) throws DataAccessException;
     Integer getTotalNumberOfShopsRegisteredByCategory(int category) throws DataAccessException;
     Integer getTotalNumberOfShopsRegisteredByCityByCategory(String city,int category) throws DataAccessException;


     //    -------------total Shops--------
     List<Shop> getTotalNumberOfShopsRegisteredAll(int limit) throws DataAccessException;
     List<Shop> getTotalNumberOfShopsRegisteredDate(int limit,Date date) throws DataAccessException;
     List<Shop> getTotalNumberOfShopsRegisteredByWeek(int limit,int weekNo) throws DataAccessException;
     List<Shop> getTotalNumberOfShopsRegisteredByMonth(int limit,int monthNo) throws DataAccessException;
     List<Shop> getTotalNumberOfShopsRegisteredByYear(int limit,int monthNo) throws DataAccessException;

     List<Shop> getTotalNumberOfShopsRegisteredByCity(int limit,String city) throws DataAccessException;
     List<Shop> getTotalNumberOfShopsRegisteredByCategory(int limit,int category) throws DataAccessException;
     List<Shop> getTotalNumberOfShopsRegisteredByCityByCategory(int limit,String city,int category) throws DataAccessException;


}
