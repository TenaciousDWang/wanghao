package com.wanghao.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wanghao.auth.service.ShiroService;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
    	WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContextEvent.getServletContext());
    	ShiroService shiroService = (ShiroService) context.getBean("shiroServiceImpl");
    	shiroService.updatePermission();
    }
 
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
 
    }
}

