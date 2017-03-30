<%--
  Created by IntelliJ IDEA.
  User: lumr
  Date: 2017/3/30
  Time: 下午9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link type="text/css" rel="stylesheet" href="css/style.css"/>
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input, a');
    </script>
    <![endif]-->

    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>

    <script type="text/javascript" src="js/lrscroll_1.js"></script>


    <script type="text/javascript" src="js/n_nav.js"></script>
    <script type="text/javascript" src="js/service.js"></script>

    <title>商品列表</title>
</head>
<body>
<%--header--%>
<%@include file="header.jsp" %>
<%--header end--%>

<!--Begin Menu Begin-->
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
                                                <a href="#">${category_3.name}</a>|
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
<!--End Menu End-->
<div class="i_bg">
    <div class="postion">
        <span class="fl">全部 > 美妆个护 > 香水 > </span>
        <span class="n_ch">
            <span class="fl">品牌：<font>香奈儿</font></span>
            <a href="#"><img src="images/s_close.gif"/></a>
        </span>
    </div>
    <!--Begin 筛选条件 Begin-->
    <div class="content mar_10">
        <table border="0" class="choice" style="width:100%; font-family:'宋体'; margin:0 auto;" cellspacing="0"
               cellpadding="0">
            <tr valign="top">
                <td width="70">&nbsp; 品牌：</td>
                <td class="td_a"><a href="#" class="now">香奈儿（Chanel）</a><a href="#">迪奥（Dior）</a><a
                        href="#">范思哲（VERSACE）</a><a href="#">菲拉格慕（Ferragamo）</a><a href="#">兰蔻（LANCOME）</a><a href="#">爱马仕（HERMES）</a><a
                        href="#">卡文克莱（Calvin Klein）</a><a href="#">古驰（GUCCI）</a><a href="#">宝格丽（BVLGARI）</a><a href="#">阿迪达斯（Adidas）</a><a
                        href="#">卡尔文·克莱恩（CK）</a><a href="#">凌仕（LYNX）</a><a href="#">大卫杜夫（Davidoff）</a><a href="#">安娜苏（Anna
                    sui）</a><a href="#">阿玛尼（ARMANI）</a><a href="#">娇兰（Guerlain）</a></td>
            </tr>
            <tr valign="top">
                <td>&nbsp; 价格：</td>
                <td class="td_a"><a href="#">0-199</a><a href="#" class="now">200-399</a><a href="#">400-599</a><a
                        href="#">600-899</a><a href="#">900-1299</a><a href="#">1300-1399</a><a href="#">1400以上</a></td>
            </tr>
            <tr>
                <td>&nbsp; 类型：</td>
                <td class="td_a"><a href="#">女士香水</a><a href="#">男士香水</a><a href="#">Q版香水</a><a href="#">组合套装</a><a
                        href="#">香体走珠</a><a href="#">其它</a></td>
            </tr>
            <tr>
                <td>&nbsp; 香型：</td>
                <td class="td_a"><a href="#">浓香水</a><a href="#">香精Parfum香水</a><a href="#">淡香精EDP淡香水</a><a
                        href="#">香露EDT</a><a href="#">古龙水</a><a href="#">其它</a></td>
            </tr>
        </table>
    </div>
    <!--End 筛选条件 End-->

    <div class="content mar_20">
        <div class="l_history">
            <div class="his_t">
                <span class="fl">浏览历史</span>
                <span class="fr"><a href="#">清空</a></span>
            </div>
            <ul>
                <li>
                    <div class="img"><a href="#"><img src="images/his_1.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>368.00</span></font> &nbsp; 18R
                    </div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="images/his_2.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>768.00</span></font> &nbsp; 18R
                    </div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="images/his_3.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>680.00</span></font> &nbsp; 18R
                    </div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="images/his_4.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>368.00</span></font> &nbsp; 18R
                    </div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="images/his_5.jpg" width="185" height="162"/></a></div>
                    <div class="name"><a href="#">Dior/迪奥香水2件套装</a></div>
                    <div class="price">
                        <font>￥<span>368.00</span></font> &nbsp; 18R
                    </div>
                </li>
            </ul>
        </div>
        <div class="l_list">
            <div class="list_t">
            	<span class="fl list_or">
                	<a href="#" class="now">默认</a>
                    <a href="#">
                    	<span class="fl">销量</span>
                        <span class="i_up">销量从低到高显示</span>
                        <span class="i_down">销量从高到低显示</span>
                    </a>
                    <a href="#">
                    	<span class="fl">价格</span>
                        <span class="i_up">价格从低到高显示</span>
                        <span class="i_down">价格从高到低显示</span>
                    </a>
                    <a href="#">新品</a>
                </span>
                <span class="fr">共发现${products.size()}件</span>
            </div>
            <div class="list_c">

                <ul class="cate_list">
                    <c:forEach var="product" items="${products}">
                        <li>
                            <div class="img"><a href="product?pid=${product.id}"><img src="images/per_1.jpg" width="210"
                                                                                     height="185"/></a></div>
                            <div class="price">
                                <font>￥<span>${product.price}</span></font> &nbsp; 26R
                            </div>
                            <div class="name"><a href="product?id=${product.id}">${product.name}</a></div>
                            <div class="carbg">
                                <a href="#" class="ss">收藏</a>
                                <a class="j_car" onclick="buyProduct(${product.id})">加入购物车</a>
                            </div>
                        </li>
                    </c:forEach>
                </ul>

                <div class="pages">
                    <a href="#" class="p_pre">上一页</a><a href="/productlist?page=0" class="cur">1</a><a href="/productlist?page=1">2</a><a
                        href="/productlist?page=2">3</a>...<a href="#">20</a><a href="#" class="p_pre">下一页</a>
                </div>


            </div>
        </div>
    </div>

    <!--Begin Footer Begin -->
    <%@include file="footer.jsp" %>
    <!--End Footer End -->
</div>

</body>
<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
