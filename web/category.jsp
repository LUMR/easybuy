<%@ page import="java.util.List" %>
<%@ page import="com.java.easybuy.vo.Category" %><%--
  Created by IntelliJ IDEA.
  User: lumr
  Date: 2017/3/30
  Time: 上午12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品分类测试</title>
</head>
<body>
<%
    List<Category> categories = (List<Category>)request.getAttribute("categories");
    for (Category category : categories) {
        out.write("<h1>"+category.getName()+"</h1>");
        for (int j = 0; j < category.getChild().size(); j++) {
            out.write("<h2>"+category.getChild().get(j).getName()+"</h2>");
            for (int i = 0; i < category.getChild().get(j).getChild().size(); i++) {
                out.write("<p>"+category.getChild().get(j).getChild().get(i).getName()+"</p>");
            }
            out.write("<br>");
        }
        out.write("<hr>");
    }
%>
</body>
</html>
