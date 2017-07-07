package com.test.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//定义拦截器
public class commonInterceptor implements HandlerInterceptor {

	private Logger log = Logger.getLogger(commonInterceptor.class);
	
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("拦截器处理");
		log.info("页面拦截跳转");
//		response.sendRedirect("http://music.163.com/#/program?id=902666986");//response重定向跳转 url变化
		request.getRequestDispatcher("/WEB-INF/views/Interceptor.jsp").forward(request,response);//request 跳转
		return false;
	}

}
