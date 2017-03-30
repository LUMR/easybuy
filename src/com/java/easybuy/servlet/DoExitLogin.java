package com.java.easybuy.servlet;

import java.io.IOException;

import javax.imageio.IIOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoExitLogin extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		//清空
		request.getSession().invalidate();
		//跳转到显示的主页面
		response.sendRedirect("IndexServlet");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		this.doGet(request, response);
	}
}
