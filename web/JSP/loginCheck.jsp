<%@ page import="main.DAO.LoginQuery" %><%--
  Created by IntelliJ IDEA.
  User: ито╒
  Date: 2021/6/1
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<%
    request.setCharacterEncoding("gb2312");
    String loginStat="fail";
    String loginName = request.getParameter("loginUpUsername");
    String loginPasswd = request.getParameter("loginUpPassword");
    LoginQuery loginQuery = new LoginQuery();
    boolean LoginFlag=loginQuery.serachUser(loginName,loginPasswd);

%>
<head>
    <title>
    </title>
</head>
<body>
<%
    if(LoginFlag){
    response.sendRedirect("../user/personalHome.html");
}
%>
</body>
</html>
