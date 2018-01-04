/**Created	by	chenshi  at	2018年1月3日 下午8:36:44*/
package com.quanhu.my.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:	GrobalExceptionHandler.java
 * @packageName:	com.quanhu.my.exception
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class GrobalExceptionHandler implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		String errorMessage=null;
		if(ex	instanceof	ApplicationException){
			ApplicationException	ape=(ApplicationException) ex;
			errorMessage = ape.getMessage();
		}
		if(ex	instanceof	SystemException){
			SystemException	se=(SystemException) ex;
			errorMessage = se.getMessage();
		}
		ModelAndView mav = new	ModelAndView();
		mav.addObject("errorMessage", errorMessage);
		mav.setViewName("error");
		return mav;
	}

}
