package com.atguigu.servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPIServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("URI : " + req.getRequestURI());
        System.out.println("URL : " + req.getRequestURL());

        System.out.println("IP : " + req.getRemoteHost());
        System.out.println("User-Agent : " + req.getHeader("User-Agent"));
        System.out.println("method" + req.getMethod());

    }
}
