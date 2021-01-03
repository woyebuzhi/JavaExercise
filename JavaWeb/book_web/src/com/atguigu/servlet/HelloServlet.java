package com.atguigu.servlet;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化方法");
        System.out.println("hello servlet name :" + servletConfig.getServletName());
        System.out.println("hello servlet param , username :" + servletConfig.getInitParameter("username"));
        System.out.println("hello servlet param , url :" + servletConfig.getInitParameter("url"));
        System.out.println("hello servlet servletcontext :" + servletConfig.getServletContext());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet 被访问了！");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
