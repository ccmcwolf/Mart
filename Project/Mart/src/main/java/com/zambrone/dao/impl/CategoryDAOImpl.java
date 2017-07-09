package com.zambrone.dao.impl;

import com.zambrone.dao.CategoryDAO;
import com.zambrone.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Chamith on 05/07/2017.
 */
@Repository


public class CategoryDAOImpl implements CategoryDAO {
    @Override
    public boolean addCategory(Category category) {
        return false;
    }

    @Override
    public boolean deleteCategoryByName(String name) {
        return false;
    }

    @Override
    public boolean deleteCategoryById(Integer id) {
        return false;
    }

    @Override
    public Category searchCategoryById(Integer id) {
        return null;
    }

    @Override
    public List<Category> loadAllCategory() {
        return null;
    }

    @Override
    public Integer searchCategoryCount() {
        return null;
    }

    @Override
    public Category searchCategoryByName(String name) {
        return null;
    }
}
