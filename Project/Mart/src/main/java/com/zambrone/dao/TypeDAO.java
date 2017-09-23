package com.zambrone.dao;

import com.zambrone.entity.Type;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 09/07/2017.
 */
 public interface TypeDAO {

    boolean addType(Type type) throws DataAccessException;
    boolean deleteTypeById(Integer id) throws DataAccessException;
    Type searchTypeById(Integer id) throws DataAccessException;
    List<Type> getAllType() throws DataAccessException;
    Integer searchTypeCount() throws DataAccessException;
    Type searchTypeByName(String name) throws DataAccessException;
}
