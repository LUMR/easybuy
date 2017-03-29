package com.java.easybuy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.easybuy.dao.impl.LoginDAOImpl;
import com.java.easybuy.vo.User;

@WebServlet(urlPatterns={"/login"})
/**
 * 登录Servlet
 * @author Administrator
 *
 */

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
              
		      String name=request.getParameter("name");
              String password=request.getParameter("password");
              LoginDAOImpl login=new LoginDAOImpl();
              User user=new User(name);
             int i = login.liginName(user);
		     if(i==0){
		    	 String newPassword=user.getPassword();
		    	 if(newPassword.equals(password)){
		    		 System.out.println("登录成功");
		    		 request.getSession().setAttribute(name, name);
		    		 response.sendRedirect("index.jsp");
		    	 }
		    	 else{
		    		 System.out.println("密码不正确");
		    		 response.sendRedirect("login.jsp");
		    	 }
		     }
		     else{
		    	 System.out.println("用户名不存在");
		    	 response.sendRedirect("login.jsp");
		     }
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	

}
