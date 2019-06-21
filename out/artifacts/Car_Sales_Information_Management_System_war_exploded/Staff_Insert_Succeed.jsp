<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/21
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加员工成功页</title>
</head>
<body>

<div>
    您增加员工信息成功！！！

</div>

<div>
    3秒跳转显示页！！！
    <%
        response.setHeader("refresh", "3;URL=Servlet_Staff_SelectAll");
    %>
</div>
</body>
</html>
