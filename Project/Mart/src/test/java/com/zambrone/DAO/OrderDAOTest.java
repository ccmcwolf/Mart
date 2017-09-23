package com.zambrone.DAO;

import com.zambrone.dao.OrderDAO;
import com.zambrone.dao.OrderDetailDAO;
import com.zambrone.dao.impl.OrderDAOImpl;
import org.junit.Test;

/**
 * Created by Chamith on 23/09/2017.
 */
public class OrderDAOTest {
    @Test
    public void testGetOrderCountAll() {
        OrderDAO orderDAO = new OrderDAOImpl(); // MyClass is tested

        // assert statements
        orderDAO.getTotalNumberOfOrdersAll();

    }
}
