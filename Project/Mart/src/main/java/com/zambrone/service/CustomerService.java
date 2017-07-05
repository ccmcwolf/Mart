package com.zambrone.service;

import com.zambrone.entity.Customer;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 04/07/2017.
 */
public interface CustomerService {

    /**
     *
     * @param customer
     * @throws DataAccessException
     */
    public void registerNewCustomer(Customer customer) throws DataAccessException;

    /**
     *
     * @return @throws DataAccessException
     */
    public List<Customer> getAllCustomer() throws DataAccessException;

    /**
     *
     * @param name
     * @return
     * @throws DataAccessException
     */
    public Customer getCustomerByName(String name) throws DataAccessException;

    /**
     *
     * @param id
     * @return
     * @throws DataAccessException
     */
    public Customer getCustomerByID(Integer id) throws DataAccessException;

    /**
     *
     * @param phone
     * @return
     * @throws DataAccessException
     */
    public Customer getCustomerByPhone(String phone) throws DataAccessException;

    /**
     *
     * @param customer
     * @throws DataAccessException
     */
    public void updateCustomer(Customer customer) throws DataAccessException;

    /**
     *
     * @param id
     * @throws DataAccessException
     */
    public void removeCustomer(Integer id) throws DataAccessException;

    /**
     *
     * @param type
     * @return
     * @throws DataAccessException
     */
    public List<Customer> getCustomerByType(String type) throws DataAccessException;
}
