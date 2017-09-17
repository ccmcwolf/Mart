package com.zambrone.service.impl;

import com.zambrone.dao.CategoryDAO;
import com.zambrone.entity.Category;
import com.zambrone.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chamith on 09/07/2017.
 */


@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.READ_COMMITTED
)

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDAO categoryDAO;

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    @Override
    public boolean addCategory(Category category) {
        return categoryDAO.addCategory(category);
    }

    @Override
    public List<Category> getAllCategory() throws DataAccessException {
        return categoryDAO.getAllCategory();
    }

    @Override
    public Category getCategoryByName(String name) throws DataAccessException {
        return categoryDAO.searchCategoryByName(name);
    }

    @Override
    public Category getCategoryByID(Integer id) throws DataAccessException {
        return categoryDAO.searchCategoryById(id);
    }

    @Override
    public void updateCategory(Category category) throws DataAccessException {

    }

    @Override
    public void removeCategory(Integer id) throws DataAccessException {
        categoryDAO.deleteCategoryById(id);
    }
}
