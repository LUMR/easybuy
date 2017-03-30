package com.java.easybuy.service.impl;

import com.java.easybuy.dao.CategoryDao;
import com.java.easybuy.dao.impl.CategoryDaoImpl;
import com.java.easybuy.service.CategoryService;
import com.java.easybuy.vo.Category;

import java.util.List;

/**
 * impl
 * Created by lumr on 2017/3/30.
 */
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> getAllCategory() {
        Category category = new Category();
        CategoryDao categoryDao = new CategoryDaoImpl();
        return categoryDao.getCategory(category);
    }
}
