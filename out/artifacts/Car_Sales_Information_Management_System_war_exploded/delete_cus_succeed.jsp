<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除客户信息成功页</title>
</head>
<body>

<div align="center">

    删除客户编号为<%=request.getAttribute("id")%>的客户成功！！！
</div>

<div align="center">
    3秒跳转显示页
    <%
        response.setHeader("refresh", "3;URL=Servlet_Cus_SelectAll");
    %>

</div>

</body>
</html>
