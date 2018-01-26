package com.zhy.listener;

import javax.servlet.*;

public class TestFilter implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String rootPath = servletContextEvent.getServletContext().getRealPath("/");
        String contextConfigLocation = servletContextEvent.getServletContext().getInitParameter("contextConfigLocation");
        System.out.println("++++++++++++++" + contextConfigLocation);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

