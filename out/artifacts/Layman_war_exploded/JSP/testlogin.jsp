<%@ page import="main.DAO.LoginQuery" %><%--
  Created by IntelliJ IDEA.
  User: 稍息
  Date: 2021/6/1
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String loginName = request.getParameter("loginUpUsername");
    String loginPasswd = request.getParameter("loginUpPassword");
    LoginQuery loginQuery =new LoginQuery();
    boolean flag=loginQuery.serachUser(loginName,loginPasswd);

%>
<%if(flag){%>
<h2>登录成功</h2>
<%}%>
</body>
</html>
