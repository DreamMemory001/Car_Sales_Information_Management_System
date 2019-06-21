<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/20
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加汽车信息</title>
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
    <h2>增加车辆信息</h2>
</div>

<form action="Servlet_Car_Insert" method="post">

    <div align="center">
        汽车编号：<input type="text" id="carid" class="input" maxlength="27" size="100"  name="carid">
    </div>
    <div align="center">
        汽车名称：<input type="text" id="carname" class="input" maxlength="27" size="100" name="carname" >
    </div>

    <div align="center">
        汽车类型：<input type="text" id="cartype" class="input" maxlength="27" size="100" name="cartype">

    </div>
    <div align="center">
        汽车品牌：<input type="text" id="carbrand" class="input" maxlength="27" size="100" name="carbrand">

    </div>
    <div align="center">
        汽车价格：<input type="text" id="carprice" class="input"  name="carprice">

    </div>

    <div align="center">
        <input type="submit" class="button" value="更新">
    </div>
</form>



</body>
</html>
