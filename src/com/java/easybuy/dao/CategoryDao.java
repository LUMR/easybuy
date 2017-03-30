package com.java.easybuy.dao;

import com.java.easybuy.vo.Category;

import java.util.List;

/**
 * categoryDao
 * Created by lumr on 2017/3/29.
 */
public interface CategoryDao {
    /**
     * 获取所有商品分类,
     * @return 返回所有商品分类的结果集
     */
    List<Category> getCategory(Category parentCategory);

    /**
     * 获取下一级的商品分类
     * @param category 父级商品分类
     * @return 返回下一级商品分类的结果集
     */
    List<Category> getChildCategory(Category category);
}
