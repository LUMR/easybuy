package com.java.easybuy.servlet;

import com.java.easybuy.service.impl.UserServiceImpl;
import com.java.easybuy.utils.SecurityUtils;
import com.java.easybuy.vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * login
 * Created by lumr on 2017/3/30.
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        UserServiceImpl userService = new UserServiceImpl();
        SecurityUtils securityUtils = new SecurityUtils();
        password = securityUtils.sha1(password);
        User user = new User(name);
        int i = userService.liginName(user);
        if (i == 0) {
            String newPassword = user.getPassword();
            if (newPassword.equals(password)) {
                userService.getUserInfo(user);
                request.getSession().setAttribute("user", user);//登录成功，保存session
                response.sendRedirect("index");//转发到主页
            } else {
                request.setAttribute("hint", "密码不正确,password wrong" + name);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("message","用户不存在啊");
            request.setAttribute("hint", "用户不存在,user not exist" + name);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
