<%--
  Created by IntelliJ IDEA.
  User: fsweb
  Date: 17-3-31
  Time: 下午1:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--购物车--%>

<div class="i_car">
    <div class="car_t">购物车 [ <span id="productNum">${buyCar.products.size()}</span> ]</div>
    <div class="car_bg">

        <!--Begin 购物车未登录 Begin-->
        <c:if test="${user == null}">
            <div class="un_login">还未登录！<a href="login.jsp" style="color:#ff4e00;">马上登录</a> 查看购物车！</div>
        </c:if>
        <!--End 购物车未登录 End-->

        <!--Begin 购物车已登录 Begin-->
        <ul class="cars">
            <c:forEach var="product" items="${buyCar.products}">
            <li>
                <div class="img"><a href="#"><img src="images/car1.jpg" width="58" height="58"/></a></div>
                <div class="name"><a href="#">${product.name}</a></div>
                <div class="price"><font color="#ff4e00">￥${product.price}</font> X${product.count}</div>
            </li>
            </c:forEach>
        </ul>
        <div class="price_sum">共计&nbsp; <font color="#ff4e00">￥</font><span id="buyCar_total">${buyCar.total}</span></div>
        <div class="price_a"><a href="#">去购物车结算</a></div>
        <!--End 购物车已登录 End-->
    </div>
</div>