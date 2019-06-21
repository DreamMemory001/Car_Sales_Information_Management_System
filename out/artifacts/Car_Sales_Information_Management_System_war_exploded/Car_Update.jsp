<%@ page import="bean.Car" %><%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/19
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新车辆信息界面</title>
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
<%
    Car car1 = (Car) request.getAttribute("car1");
%>
<div align="center">
    <h2>更新车辆信息</h2>
</div>

<form action="Servlet_Car_UpdateOne" method="post">

    <div align="center">
        汽车编号：<input type="text" id="carid" class="input" maxlength="27" size="100" value="<%=car1.getCar_id()%>" name="carid">
    </div>
    <div align="center">
        汽车名称：<input type="text" id="carname" class="input" maxlength="27" size="100" value="<%=car1.getCar_name()%>" name="carname">
    </div>

    <div align="center">
        汽车类型：<input type="text" id="cartype" class="input" maxlength="27" size="100" value="<%=car1.getCar_type()%>" name="cartype">

    </div>
    <div align="center">
        汽车品牌：<input type="text" id="carbrand" class="input" maxlength="27" size="100" value="<%=car1.getCar_brand()%>" name="carbrand">

    </div>
    <div align="center">
        汽车价格：<input type="text" id="carprice" class="input" maxlength="27" size="100" value="<%=car1.getCar_price()%>" name="carprice">

    </div>

    <div align="center">
        <input type="submit" class="button" value="更新">
    </div>
</form>


</body>
</html>
