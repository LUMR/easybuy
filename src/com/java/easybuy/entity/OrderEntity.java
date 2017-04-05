package com.java.easybuy.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lumr on 2017/4/5.
 */
@Entity
@Table(name = "easybuy_order", schema = "easybuy", catalog = "")
public class OrderEntity {
    private int id;
    private Integer userId;
    private String loginName;
    private String userAddress;
    private Timestamp createTime;
    private Double cost;
    private String serialNumber;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "loginName")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "userAddress")
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "cost")
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (userAddress != null ? !userAddress.equals(that.userAddress) : that.userAddress != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (serialNumber != null ? !serialNumber.equals(that.serialNumber) : that.serialNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (userAddress != null ? userAddress.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}
