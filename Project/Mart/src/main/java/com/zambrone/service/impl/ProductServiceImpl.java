package com.zambrone.service.impl;

import com.zambrone.dao.ProductDAO;
import com.zambrone.entity.Product;
import com.zambrone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chamith on 03/07/2017.
 */
@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.READ_COMMITTED
)
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO productDAO;

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public ProductDAO getProductDAO() {
        return this.productDAO;
    }

    public void setProductDAO(ProductDAO courierDAO) {
        this.productDAO= productDAO;
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public boolean addNewProduct(Product product) throws DataAccessException {
        return this.getProductDAO().addNewProduct(product);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public List<Product> getAllProduct() throws DataAccessException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public List<Product> getProductByShopId(int shopId) throws DataAccessException {
        return productDAO.getProductByShopId(shopId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public Product getProductByName(String name) throws DataAccessException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public Product getProductByID(Integer id) throws DataAccessException {
       return productDAO.getProductByID(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void updateProduct(Product product) throws DataAccessException {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void removeProduct(Integer id) throws DataAccessException {

    }
}
