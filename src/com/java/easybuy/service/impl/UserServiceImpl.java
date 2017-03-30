package com.java.easybuy.service.impl;

import com.java.easybuy.dao.UserDAO;
import com.java.easybuy.dao.impl.UserDAOImpl;
import com.java.easybuy.service.UserService;
import com.java.easybuy.vo.User;

/**
 * Created by lumr on 2017/3/28.
 */
public class UserServiceImpl implements UserService {
    @Override
    public int loginName(User user) {
        UserDAO ea=new UserDAOImpl();
        return ea.liginName(user);
    }

    @Override
    public int register(User user) {
        UserDAO userDAO = new UserDAOImpl();
        return userDAO.addUser(user);
    }

    @Override
    public int login(User user) {
        return 0;
    }

	@Override
	public int liginName(User user) {//根据登录名查询是否存在，存在返回0，不存在返回1
		UserDAO userDAO = new UserDAOImpl();
		return userDAO.liginName(user);
	}

    @Override
    public void getUserInfo(User user) {
        UserDAO dao = new UserDAOImpl();
        dao.getUserInfo(user);
    }
}
