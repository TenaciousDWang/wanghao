package com.wanghao.config.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Controller 
@Component 
public class MyInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 获取session
		HttpSession session = request.getSession(true);
		// 判断用户ID是否存在，不存在就跳转到登录界面
		if (session.getAttribute("userId") == null) {
			System.out.println("------:跳转到login页面！");
			System.out.println(request.getContextPath());
			response.sendRedirect(request.getContextPath() + "/"
					+ "login");
			return false;
		} else {
			session.setAttribute("userId", session.getAttribute("userId"));
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}
}
