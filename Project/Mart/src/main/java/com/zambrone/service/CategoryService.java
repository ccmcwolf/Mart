package com.zambrone.service;

import com.zambrone.entity.Category;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 09/07/2017.
 */
public interface CategoryService{

        boolean addCategory(Category courier) throws DataAccessException;

         List<Category> getAllCategory() throws DataAccessException;

         Category getCategoryByName(String name) throws DataAccessException;

         Category getCategoryByID(Integer id) throws DataAccessException;

         void updateCategory(Category courier) throws DataAccessException;

         void removeCategory(Integer id) throws DataAccessException;

}





























































