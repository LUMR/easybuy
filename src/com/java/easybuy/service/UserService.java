package com.java.easybuy.service;

import com.java.easybuy.vo.User;

/**
 * 用户服务接口
 * Created by lumr on 2017/3/28.
 */
public interface UserService {
    int loginName(User user);// 查询登录名是否存在,如果存在则返回密码
    int register(User user);
    int login(User user);
}
