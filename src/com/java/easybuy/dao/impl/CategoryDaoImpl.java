package com.java.easybuy.dao.impl;

import com.java.easybuy.dao.BaseDAO;
import com.java.easybuy.dao.CategoryDao;
import com.java.easybuy.vo.Category;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * categoryDaoImpl
 * Created by lumr on 2017/3/29.
 */
public class CategoryDaoImpl extends BaseDAO implements CategoryDao {
    @Override
    public List<Category> getCategory(Category parentCategory) {
        if (parentCategory.getType() > 2)
            return new ArrayList<>();
        String sql = "select * from easybuy_product_category where parentId = ?";
        Object[] obj = new Object[]{parentCategory.getId()};
        List<Category> list = new ArrayList<>();
        try {
            rs = preQuery(sql, obj);
            while (rs.next()) {
                Category category = new Category(rs.getInt("id"), rs.getString("name"),
                        rs.getInt("parentId"), rs.getInt("type"));
                CategoryDao categoryDao = new CategoryDaoImpl();
                category.setChild(categoryDao.getCategory(category));
                list.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return list;
    }

    @Override
    public List<Category> getChildCategory(Category category) {
        String sql = "select * from easybuy_product_category where parentId = ?";
        Object[] obj = new Object[]{category.getId()};
        List<Category> list = new ArrayList<>();
        try {
            rs = preQuery(sql, obj);
            while (rs.next()) {
                Category category1 = new Category(rs.getInt("id"), rs.getString("name"),
                        rs.getInt("parentId"), rs.getInt("type"));
                category1.setChild();
                list.add(category1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return list;
    }
}
