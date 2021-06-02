<%@ page import="main.DAO.CheckUsername" %>
<%@ page import="main.DAO.AddUser" %><%--
  Created by IntelliJ IDEA.
  User: 稍息
  Date: 2021/5/19
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册检测</title>
</head>
<style>
    .remind {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%,-50%);
    }

</style>
<body>
<%--<jsp:useBean id="user" class="main.javabean.Users" scope="session"></jsp:useBean>--%>
<%--<jsp:setProperty property="username" name="user" param="loginInUsername" />--%>
<%--<jsp:setProperty property="password" name="user" param="loginInPassword"/>--%>
<%--<jsp:useBean id="checkname" class="main.DAO.CheckUsername" scope="session"></jsp:useBean>--%>
<%
    String uname= request.getParameter("loginInUsername");
    String upasswd = request.getParameter("loginInPassword");
    CheckUsername checkUsername = new CheckUsername();
    boolean userFlag= checkUsername.CheckName(uname);
%>
<%if(userFlag) {%>

<h2 class="remind">欢迎<%out.println(uname);%>注册成功<span id="succ"></span></h2>
<script>
  var succ = document.querySelector('#succ');
  var timer = 3;
  forward();
  setInterval(forward,1000);
  function forward (){
    if(timer==0){
      location.href = 'register.html';
    }else {
      succ.innerHTML = '注册成功,'+timer+'秒钟后跳转到登录页面';
      timer--;
    }
  }
</script>
<%
    AddUser addUser = new AddUser();
    addUser.adduser(uname,upasswd); //不重复成功就加入数据库
%>
<%
    }
%>
<%if(userFlag==false){%>
<h4 id="remain" class="remind">该用户已被注册</h4>
<script>
  var remain= document.querySelector('h4');
  var timer2 = 3;
  forward2();
  setInterval(forward2,1000);
  function forward2 (){
    if(timer2==0){
      location.href = 'register.html';
    }else {
      remain.innerHTML = '注册失败,该用户名已被他人使用'+timer2+'秒钟后跳转到注册页面';
      timer2--;
    }
  }
</script>
<%
    }
%>
<%--Your name is: <jsp:getProperty property="username" name="user"/><br />--%>
<%--Your age is: <jsp:getProperty property="password" name="user"/><br />--%>
</body>
</html>
