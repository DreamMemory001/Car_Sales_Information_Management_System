<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息添加页</title>
    <style type="text/css">
        .input{
            font-family:Arial,Helvetica,sans-serif;
            background:none repeat scroll 0 0 #F5F7FD;
            border:1px solid #8a90b4;
            padding:5px 7px;
            width:100px;
            vertical-align:middle;
            height:30px;
            font-size:12px;
            margin:0;
            list-style:none outside none;
            border-radius: 5px 5px 5px 5px;
        }

        .button{
            width: 60px;
            height: 40px;
            border-radius: 5px 5px 5px 5px;
            background: #7BA7AB;
        }
        body{background:#494A5F;}

    </style>
</head>
<body>
<div align="center">
    <h2>增加员工信息</h2>
</div>

<form action="Servlet_Staff_Insert" method="post">

    <div align="center">
        员工编号：<input type="text" id="staid" class="input" maxlength="27" size="100"  name="staid">
    </div>
    <div align="center">
        员工姓名：<input type="text" id="staname" class="input" maxlength="27" size="100" name="staname" >
    </div>

    <div align="center">
        员工性别：<input type="text" id="stasex" class="input" maxlength="27" size="100" name="stasex">

    </div>
    <div align="center">
        员工地址：<input type="text" id="staadress" class="input" maxlength="27" size="100" name="staadress">

    </div>
    <div align="center">
        员工手机号：<input type="text" id="staphonum" class="input"  name="staphonum">

    </div>

    <div align="center">
        <input type="submit" class="button" value="添加">
    </div>
</form>



</body>
</html>
