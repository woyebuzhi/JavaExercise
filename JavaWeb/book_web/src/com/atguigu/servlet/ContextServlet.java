package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        javax.servlet.ServletContext context = getServletConfig().getServletContext();

        String usernam = context.getInitParameter("usernam");
        System.out.println(usernam);
        System.out.println(context.getInitParameter("password"));

        System.out.println(context.getContextPath());

        System.out.println(context.getRealPath("/"));
        System.out.println();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
