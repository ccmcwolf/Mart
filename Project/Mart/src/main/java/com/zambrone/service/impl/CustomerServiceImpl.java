package com.zambrone.service.impl;

import com.zambrone.dao.CustomerDAO;
import com.zambrone.entity.Customer;
import com.zambrone.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Chamith on 04/07/2017.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    /**
     *
     * @return
     */
    private CustomerDAO getCustomerDAO(){
        return (this.customerDAO instanceof CustomerDAO) ? this.customerDAO: null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void registerNewCustomer(Customer customer) throws DataAccessException {
        getCustomerDAO().registerNewCustomer(customer);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public List<Customer> getAllCustomer() throws DataAccessException {
        System.out.println(".............................Service...................");
        return getCustomerDAO().getAllCustomer();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public Customer getCustomerByName(String name) throws DataAccessException {
        return getCustomerDAO().getCustomerByName(name);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public Customer getCustomerByID(Integer id) throws DataAccessException {
        return getCustomerDAO().getCustomerByID(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public Customer getCustomerByPhone(String phone) throws DataAccessException {
        return getCustomerDAO().getCustomerByPhone(phone);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void updateCustomer(Customer customer) throws DataAccessException {
        getCustomerDAO().updateCustomer(customer);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void removeCustomer(Integer id) throws DataAccessException {
        getCustomerDAO().removeCustomer(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public List<Customer> getCustomerByType(String type) throws DataAccessException {
        return getCustomerDAO().getCustomerByType(type);
    }

}
