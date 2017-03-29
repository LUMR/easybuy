package com.java.easybuy.vo;

import java.io.Serializable;

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
	private int categoryId;
	//商品二级类别编号
	private int childCategoryId;
	//上传文件名
	private String fileName;
	//购买数量
	private int count=1;
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getChildCategoryId() {
		return childCategoryId;
	}
	public void setChildCategoryId(int childCategoryId) {
		this.childCategoryId = childCategoryId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
