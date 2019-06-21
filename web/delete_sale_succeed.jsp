<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除订单成功页</title>
</head>
<body>
<div align="center">

    删除订单编号为<%=request.getAttribute("id")%>的订单成功！！！
</div>

<div align="center">
    3秒跳转显示页
    <%
        response.setHeader("refresh", "3;URL=Servlet_Sale_SelectAll");
    %>

</div>

</body>
</html>
