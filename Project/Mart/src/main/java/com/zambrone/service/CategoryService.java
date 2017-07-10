package com.zambrone.service;

import com.zambrone.entity.Category;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 09/07/2017.
 */
public interface CategoryService{

        boolean addCategory(Category courier) throws DataAccessException;

        public List<Category> getAllCategory() throws DataAccessException;

        public Category getCategoryByName(String name) throws DataAccessException;

        public Category getCategoryByID(Integer id) throws DataAccessException;

        public void updateCategory(Category courier) throws DataAccessException;

        public void removeCategory(Integer id) throws DataAccessException;

}





























































