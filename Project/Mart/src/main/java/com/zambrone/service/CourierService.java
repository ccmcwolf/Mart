package com.zambrone.service;

import com.zambrone.entity.Courier;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 02/07/2017.
 */
public interface CourierService {
    boolean addCourier(Courier courier);

    public List<Courier> getAllCourier() throws DataAccessException;

    public List<Courier> getCourierByCity(String city) throws DataAccessException;

    public List<Courier> getCourierByDistrict(String district) throws DataAccessException;

    public Courier getCourierByName(String name) throws DataAccessException;

    public Courier getCourierByEmail(String email) throws DataAccessException;

    public Courier getCourierByID(Integer id) throws DataAccessException;

    public Courier getCourierByPhone(String phone) throws DataAccessException;

    public void updateCourier(Courier courier) throws DataAccessException;

    public void removeCourier(Integer id) throws DataAccessException;
}
