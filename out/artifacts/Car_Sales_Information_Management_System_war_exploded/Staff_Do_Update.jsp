<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新成功页</title>
</head>
<body>
<div align="center">

    更新员工信息成功！！！
</div>

<div align="center">
    3秒跳转显示页
    <%
        response.setHeader("refresh", "3;URL=Servlet_Staff_SelectAll");
    %>

</div>


</body>
</html>
