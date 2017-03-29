package com.java.easybuy.service.impl;

import com.java.easybuy.dao.impl.LoginDAOImpl;
import com.java.easybuy.service.LoginService;
import com.java.easybuy.vo.User;

public class LoginServiceImpl implements LoginService{

	public int liginName(User user) {         
		LoginDAOImpl ea=new LoginDAOImpl();
		return ea.liginName(user);
	}
}
