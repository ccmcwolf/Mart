package com.zambrone.service.impl;

import com.zambrone.dao.CourierDAO;
import com.zambrone.entity.Courier;
import com.zambrone.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chamith on 02/07/2017.
 */

@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.READ_COMMITTED
)
public class CourierServiceImpl implements CourierService {

    @Autowired
    private CourierDAO courierDAO;

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )

    public CourierDAO getCourierDAO() {
        return this.courierDAO;
    }

    public void setCourierDAO(CourierDAO courierDAO) {
        this.courierDAO = courierDAO;
    }

    @Override
    public boolean addCourier(Courier courier) {
        System.out.println("Courier @ ServiceImpl "+courier);
        return this.getCourierDAO().addCourier(courier);

    }
}
