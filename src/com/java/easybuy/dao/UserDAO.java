package com.java.easybuy.dao;

import com.java.easybuy.vo.User;

/**
 * 用户的DAO
 * Created by fsweb on 17-3-28.
 */
public interface UserDAO {
	
	int liginName(User user);//根据登录名查询是否存在，存在返回0，不存在返回1
    /**
     * 根据用户名查询用户是否存在
     * @param user 必须有用户名
     * @return 返回值:1表示存在,0表示不存在,-1表示数据库连接错误
     */
    int selectUser(User user);

    /**
     * 检查用户密码是否正确
     * @param user 必须有用户名和密码
     * @return 返回值：1表示密码正确，0表示密码错误，-1表示数据库错误
     */
    int checkPassword(User user);

    /**
     * 根据用户注册名获取用户的全部信息
     * @param user 用户对象，必须有用户名，此用户对象会拥有全部用户信息
     */
    void getUserInfo(User user);

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
