package main.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class ValidateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        HttpSession session = request.getSession();
//        ServletContext application = this.getServletContext();
        response.setCharacterEncoding("gb2312");
//        String targeturl = "fial.html";

        String resulit = (String) session.getAttribute("result");

        PrintWriter out = response.getWriter();
        if(code.equals(resulit)){
            response.sendRedirect("/Layman/user/useInfoSetSuccess.html");

        }else {
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
