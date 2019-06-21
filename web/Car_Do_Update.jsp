<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/20
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新成功</title>
</head>
<body>

<div>
    您更新车辆信息成功！！
</div>
<div>
    3秒跳转显示页！！！
    <%
        response.setHeader("refresh", "3;URL=Servlet_Car_SelectAll");
    %>
</div>

</body>
</html>
