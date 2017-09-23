package com.zambrone.dao;

import com.zambrone.entity.Courier;
import com.zambrone.entity.Users;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 02/07/2017.
 */
public  interface CourierDAO {
    boolean addCourier(Courier courier);
     List<Courier> getAllCourier() throws DataAccessException;
     List<Courier> getCourierByCity(String city) throws DataAccessException;
     List<Courier> getCourierByDistrict(String district) throws DataAccessException;
     Courier getCourierByName(String name) throws DataAccessException;
     Courier getCourierByEmail(String email) throws DataAccessException;
     Courier getCourierByID(Integer id) throws DataAccessException;
     Courier getCourierByPhone(String phone) throws DataAccessException;
     void updateCourier(Courier courier) throws DataAccessException;
     void removeCourier(Integer id) throws DataAccessException;



}
