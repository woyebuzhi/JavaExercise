package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletConfig().getServletContext();

        System.out.println("初始化之前是 ： " + context.getAttribute("Kwy1"));
        context.setAttribute("Key1","k1--123");
        System.out.println(context.getAttribute("Key1"));

    }
}
