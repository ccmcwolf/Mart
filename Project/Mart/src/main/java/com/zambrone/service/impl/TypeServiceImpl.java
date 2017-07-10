package com.zambrone.service.impl;

import com.zambrone.entity.Type;
import com.zambrone.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chamith on 09/07/2017.
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeService typeService;


    @Override
    public boolean addType(Type type) throws DataAccessException {
        return false;
    }

    @Override
    public boolean deleteTypeById(Integer id) throws DataAccessException {
        return false;
    }

    @Override
    public Type searchTypeById(Integer id) throws DataAccessException {
        return null;
    }

    @Override
    public List<Type> getAllType() throws DataAccessException {
        return null;
    }

    @Override
    public Integer searchTypeCount() throws DataAccessException {
        return null;
    }

    @Override
    public Type searchTypeByName(String name) throws DataAccessException {
        return null;
    }
}
