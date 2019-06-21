<%@ page import="bean.Car" %><%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购买车辆</title>
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

    Car car  = (Car)request.getAttribute("car2");

%>
<div align="center">
    <h2>
        购买车辆
    </h2>
</div>

<div align="center">

    <form action="Servlet_Buy_Car" method="post">

        <div align="center">
            订单编号：<input type="text" id="carid" class="input" maxlength="27" size="100"  name="saleno">
        </div>
        <div align="center">
            汽车名称：<input type="text" id="carname" class="input" maxlength="27" size="100" name="carname"  value="<%=car.getCar_name()%>">
        </div>

        <div align="center">
            购买数量：<input type="text" id="cartype" class="input" maxlength="27" size="100" name="salenum">

        </div>
        <div align="center">
            <input type="submit" class="button" value="购买">
        </div>
    </form>

</div>


</body>
</html>
