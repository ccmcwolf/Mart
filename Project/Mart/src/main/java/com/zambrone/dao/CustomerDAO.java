package com.zambrone.dao;

import com.zambrone.entity.Customer;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 04/07/2017.
 */
public interface CustomerDAO {

     void registerNewCustomer(Customer customer) throws DataAccessException;
     List<Customer> getAllCustomer() throws DataAccessException;
     Customer getCustomerByName(String name) throws DataAccessException;
     Customer getCustomerByID(Integer id) throws DataAccessException;
     Customer getCustomerByPhone(String phone) throws DataAccessException;
     void updateCustomer(Customer customer) throws DataAccessException;
     void removeCustomer(Integer id) throws DataAccessException;
     List<Customer> getCustomerByType(String type) throws DataAccessException;
}
