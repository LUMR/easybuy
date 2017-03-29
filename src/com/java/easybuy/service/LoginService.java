package com.java.easybuy.service;

import com.java.easybuy.vo.User;

public interface LoginService {

	public int liginName(User user);// 查询登录名是否存在,如果存在则返回密码

}
