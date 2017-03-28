package com.java.easybuy.dao;

import com.java.easybuy.vo.User;

/**
 * 用户的DAO
 * Created by fsweb on 17-3-28.
 */
public interface UserDAO {
    /**
     * 根据用户名查询用户是否存在
     * @param username 用户名
     * @return 返回值:1表示存在,0表示不存在,-1表示数据库连接错误
     */
    int selectUser(String username);

    /**
     * 根据用户id获取用户的全部信息
     * @param id 用户id
     * @return 一个完整的用户对象
     */
    User getUser(int id);

    /**
     * 增加一个user到数据库
     * @param user 要增加的用户对象
     * @return 返回值:>0表示增加成功,0表示增加失败,-1表示数据库连接错误
     */
    int addUser(User user);

    /**
     * 更新用户信息,用户根据id来定位,所以id不能改
     * @param user 必须是一个完整的用户对象
     * @return 返回值:>0表示增加成功,0表示失败,-1表示数据库连接错误
     */
    int updateUser(User user);
}
