package com.java.easybuy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.easybuy.service.impl.UserServiceImpl;
import com.java.easybuy.utils.SecurityUtils;
import com.java.easybuy.vo.User;

//@WebServlet(name = "login", urlPatterns = {"/login"})

/**
 * 登录Servlet
 * @author Administrator
 */

public class LoginServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;chartSet=UTF-8");
        String name = request.getParameter("name");
        System.out.println(name);
        String password = request.getParameter("password");
        UserServiceImpl login = new UserServiceImpl();
        SecurityUtils securityUtils = new SecurityUtils();
        password = securityUtils.sha1(password);
        User user = new User(name);
        int i = login.liginName(user);

        System.out.println(password);
        System.out.println(user.getPassword());
        if (i == 0) {
            String newPassword = user.getPassword();
            if (newPassword.equals(password)) {
                request.getSession().setAttribute("user", name);//登录成功，保存session
                request.getRequestDispatcher("index.jsp").forward(request, response);//转发到主页
            } else {
                request.setAttribute("hint", "密码不正确,password wrong"+name);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("hint", "用户不存在,user not exist");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }


}
