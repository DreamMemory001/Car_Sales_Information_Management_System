<%--
  Created by IntelliJ IDEA.
  User: XuChao
  Date: 2019/6/20
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除成功页</title>
</head>
<body>


  <div>
      删除编号为<%=request.getAttribute("id")%>成功！！！
  </div>

  <div>
      3秒跳转显示页！！！
      <%
          response.setHeader("refresh", "3;URL=Servlet_Car_SelectAll");
      %>
  </div>
</body>
</html>
