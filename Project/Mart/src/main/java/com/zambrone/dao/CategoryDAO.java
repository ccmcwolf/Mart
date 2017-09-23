package com.zambrone.dao;

import com.zambrone.entity.Category;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 05/07/2017.
 */
public interface CategoryDAO {

    boolean addCategory(Category category) throws DataAccessException;
    boolean deleteCategoryByName(String name) throws DataAccessException;
    boolean deleteCategoryById(Integer id) throws DataAccessException;
    Category searchCategoryById(Integer id) throws DataAccessException;
    List<Category> getAllCategory() throws DataAccessException;
    Integer searchCategoryCount() throws DataAccessException;
    Category searchCategoryByName(String name) throws DataAccessException;
}
