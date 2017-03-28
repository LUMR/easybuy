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
    public int register(User user) {
        UserDAO userDAO = new UserDAOImpl();
        return userDAO.addUser(user);
    }

    @Override
    public int login(User user) {
        return 0;
    }
}
