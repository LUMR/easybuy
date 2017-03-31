<%--
  Created by IntelliJ IDEA.
  User: fsweb
  Date: 17-3-31
  Time: 下午1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--左侧--全部商品分类--%>

<div class="menu_bg">
    <div class="menu">
        <!--Begin 商品分类详情 Begin-->
        <div class="nav">
            <div class="nav_t">全部商品分类</div>
            <div class="leftNav">
                <ul>
                    <c:forEach var="category_1" items="${categories}" varStatus="status">
                        <li>
                            <div class="fj">
                                <span class="n_img"><span></span><img src="images/nav1.png"/></span>
                                <span class="fl">${category_1.name}</span>
                            </div>
                            <div class="zj" style="top:${status.index*(-40)}px;">
                                <div class="zj_l">
                                    <c:forEach var="category_2" items="${category_1.child}">
                                        <div class="zj_l_c">
                                            <h2>${category_2.name}</h2>
                                            <c:forEach var="category_3" items="${category_2.child}">
                                                <a href="productlist?cid=${category_3.id}">${category_3.name}</a>|
                                            </c:forEach>
                                        </div>
                                    </c:forEach>
                                </div>
                                <div class="zj_r">
                                    <a href="#"><img src="images/n_img1.jpg" width="236" height="200"/></a>
                                    <a href="#"><img src="images/n_img2.jpg" width="236" height="200"/></a>
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <!--End 商品分类详情 End-->
        <ul class="menu_r">
            <li><a href="Index.html">首页</a></li>
            <li><a href="Food.html">美食</a></li>
            <li><a href="Fresh.html">生鲜</a></li>
            <li><a href="HomeDecoration.html">家居</a></li>
            <li><a href="SuitDress.html">女装</a></li>
            <li><a href="MakeUp.html">美妆</a></li>
            <li><a href="Digital.html">数码</a></li>
            <li><a href="GroupBuying.html">团购</a></li>
        </ul>
        <div class="m_ad">中秋送好礼！</div>
    </div>
</div>
