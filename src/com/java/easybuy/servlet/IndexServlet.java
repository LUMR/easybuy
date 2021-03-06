package com.java.easybuy.servlet;

import com.java.easybuy.service.CategoryService;
import com.java.easybuy.service.NewsService;
import com.java.easybuy.service.impl.CategoryServiceImpl;
import com.java.easybuy.service.impl.NewsServiceImpl;
import com.java.easybuy.vo.Category;
import com.java.easybuy.vo.News;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 首页的映射
 * Created by lumr on 2017/3/30.
 */
@WebServlet(name = "IndexServlet",urlPatterns = {"/index"})
public class IndexServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取商品类别树
        CategoryService categoryService = new CategoryServiceImpl();
        List<Category> categoryList;
        categoryList = categoryService.getAllCategory();
        req.setAttribute("categories",categoryList);
        //获取新闻
        NewsService newsService = new NewsServiceImpl();
        List<News> newsList = newsService.getAllNews();
        req.setAttribute("newsList",newsList);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}
