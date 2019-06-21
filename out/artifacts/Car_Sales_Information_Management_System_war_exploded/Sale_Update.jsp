<%@ page import="bean.Sale" %><%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新订单页</title>
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
    Sale sale = (Sale) request.getAttribute("sale1");
%>
<div align="center">
    <h2>更新车辆信息</h2>
</div>

<form action="Servlet_Sale_UpdateOne" method="post">

    <div align="center">
        订单编号：<input type="text" id="saleno" class="input" maxlength="27" size="100" value=" <%=sale.getSale_no()%>" name="saleno" >
    </div>
    <div align="center">
        汽车名称：<input type="text" id="carname" class="input" maxlength="27" size="100" value="<%=sale.getCar_name()%>" name="carname">
    </div>

    <div align="center">
        订单数量：<input type="text" id="salenum" class="input" maxlength="27" size="100" value="<%=sale.getSale_num()%>" name="salenum">

    </div>

    <div align="center">
        <input type="submit" class="button" value="更新">
    </div>
</form>

</body>
</html>
