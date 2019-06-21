<%@ page import="bean.Custom" %><%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新客户信息</title>
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
   Custom custom = (Custom) request.getAttribute("custom1");
%>
<div align="center">
    <h2>更新员工信息</h2>
</div>

<form action="Servlet_Cus_UpdateOne" method="post">

    <div align="center">
        客户编号：<input type="text" id="cusid" class="input" maxlength="27" size="100" value="<%=custom.getCus_id()%>" name="cusid">
    </div>
    <div align="center">
        客户名字：<input type="text" id="cusname" class="input" maxlength="27" size="100" value="<%=custom.getCus_name()%>" name="cusname">
    </div>

    <div align="center">
        客户性别：<input type="text" id="cussex" class="input" maxlength="27" size="100" value="<%=custom.getCus_sex()%>" name="cussex">

    </div>
    <div align="center">
        客户类型：<input type="text" id="custype" class="input" maxlength="27" size="100" value="<%=custom.getCus_type()%>" name="custype">

    </div>
    <div align="center">
        客户手机：<input type="text" id="cusphonum" class="input" maxlength="27" size="100" value="<%=custom.  getCus_phoneNumber()%>" name="cusphonum">


    </div>

    <div align="center">
        <input type="submit" class="button" value="更新">
    </div>
</form>

</body>
</html>
