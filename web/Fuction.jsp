<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/17
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style type="text/css">

        body{background:#494A5F;}
        .container {
            top: 50px;
            width: 500px;
            height: 820px;
            margin: 0 auto;

        }
        .button{
            width: 500px;
            height:100px;
            background-color:#FE6714;
            border:0px #FE6714 solid;
            cursor: pointer;
            color:white;
            font-size:25px;
            border-radius: 10px 10px 10px 10px;
        }
        .time{
            font-size: 25px;

        }




    </style>


</head>
<body >

<%
    Date date  = new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
    String today = df.format(date);
    String usrename = (String) request.getAttribute("username");
%>

<div class="time">
    欢迎登陆用户<%=usrename%>的登录，当前时间：<%=today%>
    <a href="index.jsp" >注销</a>
</div>

<div class="container" align="center">

    <div>
        <form action="Servlet_Car_SelectAll" method="get" >
            <input class="button" type="submit" value="管理车辆信息">
        </form>
    </div>



    <div>
        <form action="Servlet_Cus_SelectAll" method="get">
            <input  class="button" type="submit" value="管理客户信息">
        </form>
    </div>

    <div>
        <form action="Servlet_Staff_SelectAll" method="get">
            <input type="submit" class="button" value="管理员工信息">
        </form>
    </div>

    <div>
        <form action="Servlet_Sale_SelectAll" method="get">
            <input  class="button" type="submit" value="管理车辆销售信息">
        </form>
    </div>

</div>


</body>
</html>

