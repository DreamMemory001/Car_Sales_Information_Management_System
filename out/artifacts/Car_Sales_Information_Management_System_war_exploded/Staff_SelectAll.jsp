<%@ page import="bean.Staff" %>
<%@ page import="bean.Car" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息展示</title>
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

        .sel{
            position:relative;
            top: 10px;
        }
        .button{
            width: 60px;
            height: 30px;
            border-radius: 5px 5px 5px 5px;
            background: #7BA7AB;
            font-size: 15px;
        }


    </style>
</head>
<body>


<div id="container">
    <div class="search bar1">
        <form action="Servlet_Car_Contain" method="get">
            <input type="text" placeholder="请输入您要搜索的内容..." name="ser">
            <button type="submit" ></button>
            <div align="center" class="sel">
                <label >
                    <select name="row" >
                        <option >员工地址</option>
                        <option >员工手机号</option>
                    </select>
                </label>
            </div>



        </form>
    </div>

    <form action="Staff_Insert.jsp" method="post">
        <div align="center">
            添加员工信息：<input align="center" type="submit" class="button" value="增加">

        </div>
    </form>

    <table id="box-table-a" summary="Employee Pay Sheet">
        <thead>
        <tr>
            <th scope="col">员工编号</th>
            <th scope="col">员工姓名</th>
            <th scope="col">员工性别</th>
            <th scope="col">员工地址</th>
            <th scope="col">员工电话</th>
            <th scope="col">操作一</th>
            <th scope="col">操作二</th>

        </tr>
        </thead>
        <tbody>
        <%

            List<Staff> list = (List<Staff>) request.getAttribute("list");
            for (Staff staff: list){
        %>
        <tr>
            <td><%=staff.getSta_id()%></td>
            <td><%=staff.getSta_name()%></td>
            <td><%=staff.getSta_sex()%></td>
            <td><%=staff.getSta_adress()%></td>
            <td><%=staff.getSta_phoneNumber()%></td>
            <td><a href="Servlet_Staff_DeleteOne?id=<%=staff.getSta_id()%>">删除</a></td>
            <td><a href="Servlet_Staff_SelectOne?id=<%=staff.getSta_id()%>">更新</a></td>

        </tbody>

        <%
            }
        %>
    </table>

</div>


</body>
</html>
