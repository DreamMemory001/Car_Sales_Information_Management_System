<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//ZH" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>login</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="stylesheet" href="css/style.css" />

	
</head>
<body>

<%
	String error1 =(String)request.getAttribute("error");
%>

<div class="login-container">
	<h1>汽车销售信息管理系统登录</h1>

	<div class="connect">
		 <p>欢迎您的登录</p>
	 </div>

	<form action="Servlet_Root_Find" method="get" id="loginForm">
		<div>
			<input type="text" name="username" class="phone" placeholder="用户名" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<button id="submit" type="submit">登 录</button>
	</form>

	<a href="register.jsp">
		<button type="button" class="register-tis">还有没有账号？</button>
	</a>
	
</div>

<script  src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/common.js" type="text/javascript"></script>
<!--背景图片自动更换-->
<script src="js/supersized.3.2.7.min.js" type="text/javascript"></script>
<script src="js/supersized-init.js" type="text/javascript"></script>
<!--表单验证-->
<script src="js/jquery.validate.min.js?var1.14.0" type="text/javascript"></script>


<script type="text/javascript">
	var error = '<%=request.getAttribute("error") %>';
	if (error == "1"){
		alert("账号密码错误");
	}
</script>

</body>

</html>