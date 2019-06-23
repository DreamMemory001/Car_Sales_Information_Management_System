<%@ page import="bean.Car" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询显示页</title>
    <style type="text/css">
        #box-table-a
        {
            font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
            font-size: 12px;
            margin: 45px;
            width: 480px;
            text-align: left;
            border-collapse: collapse;
        }
        #box-table-a th
        {
            font-size: 13px;
            font-weight: normal;
            padding: 8px;
            background: #b9c9fe;
            border-top: 4px solid #aabcfe;
            border-bottom: 1px solid #fff;
            color: #039;
        }
        #box-table-a td
        {
            padding: 8px;
            background: #e8edff;
            border-bottom: 1px solid #fff;
            color: #669;
            border-top: 1px solid transparent;
        }
        #box-table-a tr:hover td
        {
            background: #d0dafd;
            color: #339;
        }
        body {
            margin: 0;
            padding: 0;
            background: #494A5F;
            font-weight: 500;
            font-family: "Microsoft YaHei","宋体","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif, FreeSans, Arimo;
        }

        #container {
            width: 500px;
            height: 820px;
            margin: 0 auto;
        }
        div.search {padding: 30px 0;}

        form {
            position: relative;
            width: 300px;
            margin: 0 auto;
        }

        input, button {
            border: none;
            outline: none;
        }

        input {
            width: 100%;
            height: 42px;
            padding-left: 13px;
        }

        button {
            height: 42px;
            width: 42px;
            cursor: pointer;
            position: absolute;
        }



        .bar1 {background:  #494A5F;}

        .bar1 input {
            border: 2px solid #7BA7AB;
            border-radius: 5px;
            background: #F9F0DA;
            color: #9E9C9C;
        }
        .bar1 button {
            top: 0px;
            right: 0;
            background: #7BA7AB;
            border-radius: 5px 5px 5px 5px;

        }
        .bar1 button:before {
            content: "\f002";

            font-size: 16px;
            color: #F9F0DA;
        }


        select {
            border: solid 3px #000;

            appearance:none;
            -moz-appearance:none;
            -webkit-appearance:none;
            padding-right: 50px;
            background: url("https://raw.githubusercontent.com/ourjs/static/gh-pages/2015/arrow.png") no-repeat scroll right center transparent;
        }
        select::-ms-expand { display: none; }


    </style>
</head>
<body>
<div id="container">
    <div align="center">
        <h2>
            查询成功显示
        </h2>
    </div>
<table id="box-table-a" summary="Employee Pay Sheet">
    <thead>
    <tr>
        <th scope="col">汽车编号</th>
        <th scope="col">汽车名称</th>
        <th scope="col">汽车类型</th>
        <th scope="col">汽车品牌</th>
        <th scope="col">汽车价格</th>
        <th scope="col">操作一</th>
        <th scope="col">操作二</th>
        <th scope="col">操作三</th>
    </tr>
    </thead>
    <tbody>
    <%

        List<Car> list1 = (List<Car>) request.getAttribute("list1");
        for (Car car: list1){
    %>
    <tr>
        <td><%=car.getCar_id()%></td>
        <td><%=car.getCar_name()%></td>
        <td><%=car.getCar_type()%></td>
        <td><%=car.getCar_brand()%></td>
        <td><%=car.getCar_price()%></td>
        <td><a href="Servlet_Car_DeleteOne?id=<%=car.getCar_id()%>">删除</a></td>
        <td><a href="Servlet_Car_SelectOne?id=<%=car.getCar_id()%>">更新</a></td>
        <td><a href="">购车</a></td>


    </tbody>

    <%
        }
    %>

    <tr>
        <td align="center" colspan="8">
            <a href="Servlet_Car_SelectAll">返回</a>

        </td>
    </tr>
</table>

</div>
</body>
</html>
