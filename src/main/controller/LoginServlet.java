package main.controller;

import main.DAO.LoginQuery;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName,passWd;
        boolean LoginFlag;
        String loginState = "Fail";
        String targetUrl="/user/loginError.html";
        LoginQuery loginQuery = new LoginQuery();
        request.setCharacterEncoding("utf-8");
        userName =request.getParameter("loginUpUsername");
        passWd = request.getParameter("loginUpPassword");
        LoginFlag=loginQuery.serachUser(userName,passWd);
        if(LoginFlag){
            loginState = "Success";
            targetUrl = "/user/personlHome.html";
            HttpSession session = request.getSession();
            session.setAttribute("userName",userName);
        }
        request.setAttribute("loginState",loginState);
        response.sendRedirect(targetUrl);
    }


}
