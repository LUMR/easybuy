package com.java.easybuy.service;

import com.java.easybuy.vo.Category;

import java.util.List;

/**
 * 商品分类service
 * Created by lumr on 2017/3/30.
 */
public interface CategoryService {
    /**
     * 获取分类树
     * @return 返回一级商品分类结果集
     */
    List<Category> getAllCategory();
}
