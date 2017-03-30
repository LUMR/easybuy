package com.java.easybuy.vo;

import com.java.easybuy.dao.CategoryDao;
import com.java.easybuy.dao.impl.CategoryDaoImpl;

import java.util.List;

/**
 * 商品类别
 * Created by lumr on 2017/3/29.
 */
public class Category {
    private int id;//编号
    private String name;//名字
    private int parentId;//父分类
    private int type;//分类等级
    private List<Category> child;//子分类集合

    public Category() {
    }

    public Category(int id, String name, int parentId, int type) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.type = type;
    }

    //调用数据库，获取子分类
    public void setChild() {
        if (type < 3 && id != 0) {
            CategoryDao categoryDao = new CategoryDaoImpl();
            child = categoryDao.getChildCategory(this);
        } else
            child = null;
    }

    public void setChild(List<Category> child){
        this.child = child;
    }

    public List<Category> getChild(){
        return child;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
