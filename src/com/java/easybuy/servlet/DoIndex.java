package com.java.easybuy.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.java.easybuy.dao.NewsDao;

public class DoIndex extends HttpServlet {
	public static final int PAGE_SIZE = 7;
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//获得初始页
		int pageIndex = 1;
		if(request.getParameter("pageIndex")!=null&&
				request.getParameter("pageIndex")!=""){
			pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		}
		//获得分页的数值
		NewsDao newsDao = new NewsDaoImpl();
		List<News> news = newsDao.getAll(pageIndex, PAGE_SIZE);
		
		//从数据库中获得总的页数
		
		int count = newsDao.getCount();
		int pageCount = (count%PAGE_SIZE==0)?count/PAGE_SIZE:count/PAGE_SIZE+1;
		request.setAttribute("news", news);
		request.setAttribute("pageIndex", pageIndex);
		request.setAttribute("pageCount", pageCount);
		//创建类对象
		CategoryDao category = new CategoryDaoImpl();
		//获取所有父类
		List<Category> Parents = category.getParent();
		//获取所有二级ID
		List<Category> categorys = category.getAllCategory();
		
		
	}
}
