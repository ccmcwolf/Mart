package com.zambrone.dao;

import com.zambrone.entity.Category;

import java.util.List;

/**
 * Created by Chamith on 05/07/2017.
 */
public interface CategoryDAO {

    boolean addCategory(Category category);

    boolean deleteCategoryByName(String name);

    boolean deleteCategoryById(Integer id);

    Category searchCategoryById(Integer id);

    List<Category> loadAllCategory();

    Integer searchCategoryCount();

    Category searchCategoryByName(String name);
}
