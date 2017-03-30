package com.java.easybuy.servlet;

import com.java.easybuy.service.CategoryService;
import com.java.easybuy.service.impl.CategoryServiceImpl;
import com.java.easybuy.vo.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 首页的映射
 * Created by lumr on 2017/3/30.
 */
@WebServlet(name = "IndexServlet",urlPatterns = {"/index"})
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoryService categoryService = new CategoryServiceImpl();
        List<Category> categoryList;
        categoryList = categoryService.getAllCategory();
        req.setAttribute("categories",categoryList);
        req.getRequestDispatcher("/category.jsp").forward(req,resp);
    }
}
