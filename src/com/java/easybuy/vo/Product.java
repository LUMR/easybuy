package com.java.easybuy.vo;

import java.io.Serializable;

/**
 * 商品
 */
public class Product implements Serializable {
    //商品编号
    private int id;
    //商品名称
    private String name;
    //商品描述
    private String description;
    //商品价格
    private double price;
    //商品库存
    private int stock;
    //商品类别编号
    private int categoryLevel1Id;
    //商品二级类别编号
    private int categoryLevel2Id;
    //商品三级分类编号
    private int categoryLevel3Id;
    //上传文件名
    private String fileName;
    //购买数量
    private int count = 1;

    public Product(){}
    public Product(int id, String name, String description, double price, int stock, int categoryLevel1Id, int categoryLevel2Id, int categoryLevel3Id, String fileName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.categoryLevel1Id = categoryLevel1Id;
        this.categoryLevel2Id = categoryLevel2Id;
        this.categoryLevel3Id = categoryLevel3Id;
        this.fileName = fileName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCategoryLevel1Id() {
        return categoryLevel1Id;
    }

    public void setCategoryLevel1Id(int categoryLevel1Id) {
        this.categoryLevel1Id = categoryLevel1Id;
    }

    public int getCategoryLevel2Id() {
        return categoryLevel2Id;
    }

    public void setCategoryLevel2Id(int categoryLevel2Id) {
        this.categoryLevel2Id = categoryLevel2Id;
    }

    public int getCategoryLevel3Id() {
        return categoryLevel3Id;
    }

    public void setCategoryLevel3Id(int categoryLevel3Id) {
        this.categoryLevel3Id = categoryLevel3Id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
