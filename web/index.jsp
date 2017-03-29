<%--
  Created by IntelliJ IDEA.
  User: fsweb
  Date: 17-3-23
  Time: 下午1:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页</title>
  </head>
  <body>
  <a href="/mysqlTest">数据库测试</a>
  <a href="/Regist.jsp">注册</a>
  	<form action="yzm" method="post">
	    <img title = "点我换一张" alt="" src="kaptcha" style="cursor:pointer;" onclick="changeVerifyCode(this);">
    	<input type="text" name="yzm">
    	<br>
    	<input type="submit" value="测试验证码">
    </form>
    
    <script type="text/javascript">
		//点击切换验证码
		function changeVerifyCode(img){
		
			img.src = "kaptcha?"+Math.floor(Math.random()*100);   
		}
	</script>
  </body>
</html>
