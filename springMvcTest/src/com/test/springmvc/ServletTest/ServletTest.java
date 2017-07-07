package com.test.springmvc.ServletTest;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest extends HttpServlet {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 7955702833005852642L;
	
	
	
	//初始化servlet
	public void init(){
		//此处定义的变量将会在servlet 的整个生命周期存在
	}
	
	
	//
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		//
		response.setContentType("");//设置返回类型 json 、 html
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		//
		response.setContentType("");//设置返回类型 json 、 html
		request.getContentType();
		request.getContextPath();//String url 请求的上下文的部分url
		Cookie[] cookies=request.getCookies();//取得返回的Cookie数组
		request.getMethod();//获取请求的方法 get /post
		request.getQueryString();//get请求里面参数拼接部分，？以后的部分  返回String
		request.getRequestURI();
		request.getRequestURL();//差异
		request.getSession();//返回httpSession 获取session 没有的话创建session
		
	}

}
