package com.zambrone.service;

import com.zambrone.entity.Product;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 03/07/2017.
 */
public interface ProductService {
    public boolean addNewProduct(Product product) throws DataAccessException;

    public List<Product> getAllProduct() throws DataAccessException;

    public Product getProductByName(String name) throws DataAccessException;

    public Product getProductByID(Integer id) throws DataAccessException;

    public void updateProduct(Product product) throws DataAccessException;

    public void removeProduct(Integer id) throws DataAccessException;
}
