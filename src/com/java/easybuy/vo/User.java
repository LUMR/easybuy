package com.java.easybuy.vo;

import com.java.easybuy.utils.SecurityUtils;

/**
 * 用户实体
 * Created by fsweb on 17-3-27.
 */
public class User {
    private int id;//主键
    private String loginName;
    private String password;
    private String userName;
    private String sex;
    private String identityCode;//身份证
    private String email;//邮箱
    private String mobile;//手机号
    private int type;//用户类型

    public User() {
    }
    

    public User(String loginName, String password) {
        this.loginName = loginName;
        this.setPassword(password);
    }

    public User(String loginName, String password, String email, String mobile) {
        this.loginName = loginName;
        this.setPassword(password);
        this.email = email;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        SecurityUtils utils = new SecurityUtils();
        this.password = utils.sha1(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
