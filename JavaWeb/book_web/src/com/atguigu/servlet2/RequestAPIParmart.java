package com.atguigu.servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class RequestAPIParmart extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("***********doPost**********");
        request.setCharacterEncoding("UTF-8");

        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));

        String[] hobby = request.getParameterValues("hobby");
        System.out.println(Arrays.asList(hobby));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("***********doGet**********");

        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));

        String[] hobby = request.getParameterValues("hobby");
        System.out.println(Arrays.asList(hobby));


    }
}
