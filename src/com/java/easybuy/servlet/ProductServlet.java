package com.java.easybuy.servlet;

import com.java.easybuy.service.CategoryService;
import com.java.easybuy.service.ProductService;
import com.java.easybuy.service.impl.CategoryServiceImpl;
import com.java.easybuy.service.impl.ProductServiceImpl;
import com.java.easybuy.vo.Category;
import com.java.easybuy.vo.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lumr on 2017/3/30.
 */
@WebServlet(name = "ProductServlet",urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取商品详细信息
        int pid;
        try{
            pid = Integer.parseInt(request.getParameter("pid"));
        }catch (Exception e){
            pid = 0;
        }

        ProductService service = new ProductServiceImpl();
        Product product = service.getProductById(pid);

        //获取商品类别树
        CategoryService categoryService = new CategoryServiceImpl();
        List<Category> categoryList;
        categoryList = categoryService.getAllCategory();
        request.setAttribute("categories", categoryList);

        request.setAttribute("product",product);
        request.getRequestDispatcher("Product.jsp").forward(request,response);
    }
}
