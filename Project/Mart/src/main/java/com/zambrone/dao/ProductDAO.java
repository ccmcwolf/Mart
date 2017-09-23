package com.zambrone.dao;

import com.zambrone.entity.Product;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 03/07/2017.
 */
public interface ProductDAO {

     boolean addNewProduct(Product product) throws DataAccessException;

     List<Product> getAllProduct() throws DataAccessException;

     List<Product> getProductByShopId(int shopId) throws DataAccessException;

     Product getProductByName(String name) throws DataAccessException;

     Integer getShopIDByProductNo(Integer productID) throws DataAccessException;

     Product getProductByID(Integer id) throws DataAccessException;

     void updateProduct(Product product) throws DataAccessException;

     void removeProduct(Integer id) throws DataAccessException;
}
