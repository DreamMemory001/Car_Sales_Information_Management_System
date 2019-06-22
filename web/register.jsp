<!DOCTYPE html
	PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>注册</title>

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/Popt.js"></script>
	<script type="text/javascript" src="js/city.json.js"></script>
	<script type="text/javascript" src="js/citySet.js"></script>
	<link rel="stylesheet" href="css/style.css" />
	<style type="text/css">
		* {
			-ms-word-wrap: break-word;
			word-wrap: break-word;
		}

		html {
			-webkit-text-size-adjust: none;
			text-size-adjust: none;
		}

		html,
		body {
			height: 99%;
			width: 99%;
		}

		.wrap {
			width: 464px;
			height: 34px;
			margin: 20px auto;
			border: 0;
			position: relative;
		}

		.input {
			position: absolute;
			top: 0;
			left: 0;
			width: 457px;
			margin: 0;
			padding-left: 5px;
			height: 30px;
			line-height: 30px;
			font-size: 12px;
			border: 1px solid #c9cacb;
		}

		s {
			position: absolute;
			top: 1px;
			right: 0;
			width: 32px;
			height: 32px;

		}

		._citys {
			width: 450px;
			display: inline-block;
			border: 2px solid rgb(231, 90, 90);
			padding: 5px;
			position: relative;
		}

		._citys span {
			color: #05920a;
			height: 15px;
			width: 15px;
			line-height: 15px;
			text-align: center;
			border-radius: 3px;
			position: absolute;
			right: 10px;
			top: 10px;
			border: 1px solid #05920a;
			cursor: pointer;
		}

		._citys0 {
			width: 95%;
			height: 34px;
			line-height: 34px;
			display: inline-block;
			border-bottom: 2px solid #05920a;
			padding: 0px 5px;
			font-size: 14px;
			font-weight: bold;
			margin-left: 6px;
		}

		._citys0 li {
			display: inline-block;
			line-height: 34px;
			font-size: 15px;
			color: #888;
			width: 80px;
			text-align: center;
			cursor: pointer;
		}

		._citys1 {
			width: 100%;
			display: inline-block;
			padding: 10px 0;
		}

		._citys1 a {
			width: 83px;
			height: 35px;
			display: inline-block;
			background-color: #f5f5f5;
			color: #666;
			margin-left: 6px;
			margin-top: 3px;
			line-height: 35px;
			text-align: center;
			cursor: pointer;
			font-size: 12px;
			border-radius: 5px;
			overflow: hidden;
		}

		._citys1 a:hover {
			color: #fff;
			background-color: #05920a;
		}

		.AreaS {
			background-color: #05920a !important;
			color: #fff !important;
		}
	</style>

<body>

	<div class="register-container">
		<h1>汽车销售信息管理系统注册</h1>

		<div class="connect">
			<p>欢迎您的注册</p>
		</div>


  <form action="Servlet_Root_Insert" method="post">
	  <div>
		  <input type="text" name="username" class="username" placeholder="您的用户名" autocomplete="off" />
	  </div>

	  <div>
		  <input type="password" name="password" class="password" placeholder="输入密码" oncontextmenu="return false"
				 onpaste="return false" />
	  </div>
	  <div>
		  <input type="password" name="confirm_password" class="confirm_password" placeholder="再次输入密码"
				 oncontextmenu="return false" onpaste="return false" />
	  </div>

	  <button id="submit" type="submit">注 册</button>
  </form>



	<a href="index.jsp">
		<button type="button" class="register-tis">已经有账号？</button>
	</a>

	</div>

	<script type="text/javascript">
		$("#city").click(function (e) {
			SelCity(this, e);
		});
		$("s").click(function (e) {
			SelCity(document.getElementById("city"), e);
		});
	</script>

	<script src="js/jquery.min.js"></script>
	<script src="js/common.js"></script>
	<!--背景图片自动更换-->
	<script src="js/supersized.3.2.7.min.js"></script>
	<script src="js/supersized-init.js"></script>
	<!--表单验证-->
	<script src="js/jquery.validate.min.js?var1.14.0"></script>

</body>

</html>