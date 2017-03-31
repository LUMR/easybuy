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
 * 商品列表读取
 * Created by lumr on 2017/3/30.
 */
@WebServlet(name = "ProductLiseServlet", urlPatterns = {"/productlist"})
public class ProductLiseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取对应商品
        int cid;
        int page;
        try {
            cid = Integer.parseInt(request.getParameter("cid"));

        } catch (Exception e) {
            cid = 0;
        }
        try{
            page = Integer.parseInt(request.getParameter("page"));
        }catch (Exception e){
            page =0;
        }
        ProductService service = new ProductServiceImpl();
        List<Product> products;
        if (cid == 0)
            products = service.getAllProducts(page);
        else
            products = service.getProductsById(cid);

        request.setAttribute("products", products);

        //获取商品类别树
        CategoryService categoryService = new CategoryServiceImpl();
        List<Category> categoryList;
        categoryList = categoryService.getAllCategory();
        request.setAttribute("categories", categoryList);


        request.getRequestDispatcher("CategoryList.jsp").forward(request, response);
    }
}
