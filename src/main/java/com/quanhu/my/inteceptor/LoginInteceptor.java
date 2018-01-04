/**Created	by	chenshi  at	2018年1月4日 下午6:39:10*/
package com.quanhu.my.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:	LoginInteceptor.java
 * @packageName:	com.quanhu.my.inteceptor
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class LoginInteceptor implements HandlerInterceptor {

	/* 
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		/**1,如果是登录操作,则跳过*/
		if(request.getRequestURI().contains("login.do")){
			return	true;
		}
		
		/**2,如果已经登录了,则跳过;如果没有,则拦截跳转到登录页面*/
		HttpSession session = request.getSession();
		String attribute = (String) session.getAttribute("flag");
		if("y".equals(attribute)){
			return	true;
		}else{
			System.out.println("没有登录,被拦截到登录页面");
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
			return false;
		}
		
	}

	/* 
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	/* 
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
