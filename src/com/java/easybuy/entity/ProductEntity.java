package com.java.easybuy.entity;

import javax.persistence.*;

/**
 * Created by lumr on 2017/4/5.
 */
@Entity
@Table(name = "easybuy_product", schema = "easybuy", catalog = "")
public class ProductEntity {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private Integer categoryLevel1Id;
    private Integer categoryLevel2Id;
    private Integer categoryLevel3Id;
    private String fileName;
    private Integer isDelete;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "stock")
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "categoryLevel1Id")
    public Integer getCategoryLevel1Id() {
        return categoryLevel1Id;
    }

    public void setCategoryLevel1Id(Integer categoryLevel1Id) {
        this.categoryLevel1Id = categoryLevel1Id;
    }

    @Basic
    @Column(name = "categoryLevel2Id")
    public Integer getCategoryLevel2Id() {
        return categoryLevel2Id;
    }

    public void setCategoryLevel2Id(Integer categoryLevel2Id) {
        this.categoryLevel2Id = categoryLevel2Id;
    }

    @Basic
    @Column(name = "categoryLevel3Id")
    public Integer getCategoryLevel3Id() {
        return categoryLevel3Id;
    }

    public void setCategoryLevel3Id(Integer categoryLevel3Id) {
        this.categoryLevel3Id = categoryLevel3Id;
    }

    @Basic
    @Column(name = "fileName")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "isDelete")
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (stock != that.stock) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (categoryLevel1Id != null ? !categoryLevel1Id.equals(that.categoryLevel1Id) : that.categoryLevel1Id != null)
            return false;
        if (categoryLevel2Id != null ? !categoryLevel2Id.equals(that.categoryLevel2Id) : that.categoryLevel2Id != null)
            return false;
        if (categoryLevel3Id != null ? !categoryLevel3Id.equals(that.categoryLevel3Id) : that.categoryLevel3Id != null)
            return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (isDelete != null ? !isDelete.equals(that.isDelete) : that.isDelete != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + stock;
        result = 31 * result + (categoryLevel1Id != null ? categoryLevel1Id.hashCode() : 0);
        result = 31 * result + (categoryLevel2Id != null ? categoryLevel2Id.hashCode() : 0);
        result = 31 * result + (categoryLevel3Id != null ? categoryLevel3Id.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
        return result;
    }
}
