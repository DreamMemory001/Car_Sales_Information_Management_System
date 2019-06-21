<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户信息添加页</title>
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
    <h2>增加客户信息</h2>
</div>

<form action="Servlet_Cus_Insert" method="post">

    <div align="center">
        客户编号：<input type="text" id="cusid" class="input" maxlength="27" size="100"  name="cusid">
    </div>
    <div align="center">
        客户姓名：<input type="text" id="cusname" class="input" maxlength="27" size="100" name="cusname" >
    </div>

    <div align="center">
        客户性别：<input type="text" id="cussex" class="input" maxlength="27" size="100" name="cussex">

    </div>
    <div align="center">
        客户类型：<input type="text" id="custype" class="input" maxlength="27" size="100" name="custype">

    </div>
    <div align="center">
        员工手机号：<input type="text" id="cusphonum" class="input"  name="cusphonum">

    </div>

    <div align="center">
        <input type="submit" class="button" value="添加">
    </div>
</form>



</body>
</html>
