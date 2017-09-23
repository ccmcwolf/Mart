package com.zambrone.dao;

import com.zambrone.entity.ProductOrder;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 13/09/2017.
 */
public interface OrderDetailDAO {
     void saveOrderDetail(ProductOrder productOrder) throws DataAccessException;
     void updateOrderDetailById(ProductOrder productOrderiD) throws DataAccessException;
     boolean removeOrderDetail(ProductOrder productOrder) throws DataAccessException;
     List<ProductOrder> getOrderDetailsByOrderId(int orderId)throws DataAccessException;
     List<Integer> getProductIdsOfOrderByOrderId(int orderId)throws DataAccessException;

}
