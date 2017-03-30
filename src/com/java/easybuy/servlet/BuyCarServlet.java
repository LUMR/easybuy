package com.java.easybuy.servlet;

import com.java.easybuy.service.ProductService;
import com.java.easybuy.service.impl.ProductServiceImpl;
import com.java.easybuy.vo.BuyCar;
import com.java.easybuy.vo.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 购物车
 * Created by lumr on 2017/3/30.
 */
@WebServlet(name = "BuyCarServlet", urlPatterns = "/buyCar")
public class BuyCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        BuyCar car = (BuyCar) session.getAttribute("buyCar");
        if (car == null)
            car = new BuyCar();
        int id;
        int count;
        System.out.println(request.getParameter("pid"));
        System.out.println(request.getParameter("count"));
        try {
            id = Integer.parseInt(request.getParameter("pid"));
            count = Integer.parseInt(request.getParameter("count"));
        } catch (Exception e) {
            id = 0;
            count = 0;
        }

        PrintWriter out  = response.getWriter();
        if (id != 0 && count >0) {
            ProductService service = new ProductServiceImpl();
            Product product = service.getProductById(id);
            car.add(product);
            session.setAttribute("buyCar",car);
            out.print(true);
        }else {
            out.print(false);
        }
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
