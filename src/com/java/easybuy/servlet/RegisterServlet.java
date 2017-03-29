package com.java.easybuy.servlet;

import com.java.easybuy.service.UserService;
import com.java.easybuy.service.impl.UserServiceImpl;
import com.java.easybuy.vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 注册服务
 * Created by lumr on 2017/3/28.
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String yzm = request.getParameter("yzm");
        String googlecode = request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY).toString();
        if (!yzm.equals(googlecode)){
            request.setAttribute("message", "验证码错误，注册失败");
            request.getRequestDispatcher("/Regist.jsp").forward(request, response);
        }

        User user = new User(loginName, password, email, mobile);
        UserService userService = new UserServiceImpl();
        int result = userService.register(user);
        if (result == 1) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("Member.html");
        } else {
            request.setAttribute("message", "服务器繁忙，注册失败");
            request.getRequestDispatcher("/Regist.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
