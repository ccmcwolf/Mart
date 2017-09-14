package com.zambrone.dao;

import com.zambrone.entity.ProductOrder;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 13/09/2017.
 */
public interface OrderDetailDAO {
    public void saveOrderDetail(ProductOrder productOrder) throws DataAccessException;
    public void updateOrderDetailById(ProductOrder productOrderiD) throws DataAccessException;
    public boolean removeOrderDetail(ProductOrder productOrder) throws DataAccessException;
    public List<ProductOrder> getOrderDetailsByOrderId(int orderId)throws DataAccessException;
    public List<Integer> getProductIdsOfOrderByOrderId(int orderId)throws DataAccessException;

}
