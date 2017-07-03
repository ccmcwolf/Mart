package com.zambrone.service.impl;

import com.zambrone.dao.CourierDAO;
import com.zambrone.entity.Courier;
import com.zambrone.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public boolean addCourier(Courier courier) {
        return this.getCourierDAO().addCourier(courier);

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public List<Courier> getAllCourier() throws DataAccessException {
        return this.getCourierDAO().getAllCourier();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public List<Courier> getCourierByCity(String city) throws DataAccessException {
        return this.getCourierDAO().getCourierByCity(city);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public List<Courier> getCourierByDistrict(String district) throws DataAccessException {
        return this.getCourierDAO().getCourierByDistrict(district);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public Courier getCourierByName(String name) throws DataAccessException {
        return this.getCourierDAO().getCourierByName(name);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public Courier getCourierByEmail(String email) throws DataAccessException {
        return this.getCourierDAO().getCourierByEmail(email);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public Courier getCourierByID(Integer id) throws DataAccessException {
        return this.getCourierDAO().getCourierByID(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public Courier getCourierByPhone(String phone) throws DataAccessException {
        return this.getCourierDAO().getCourierByPhone(phone);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void updateCourier(Courier courier) throws DataAccessException {
        this.getCourierDAO().updateCourier(courier);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void removeCourier(Integer id) throws DataAccessException {
        this.getCourierDAO().removeCourier(id);
    }
}
