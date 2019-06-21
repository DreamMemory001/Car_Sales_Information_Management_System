<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息更新成功页</title>
</head>
<body>

<div>
    您修改客户信息成功！！！

</div>

<div>
    3秒跳转显示页！！！
    <%
        response.setHeader("refresh", "3;URL=Servlet_Cus_SelectAll");
    %>
</div>
</body>
</html>
