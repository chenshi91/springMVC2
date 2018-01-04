/**Created	by	chenshi  at	2018年1月4日 上午10:44:06*/
package com.quanhu.my.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:	ImageControaller.java
 * @packageName:	com.quanhu.my.controller
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
/*
 * ---------spingMVC中控制器方法的返回值:
 * 									1,String
 * 									2,ModelAndView
 * 									3,void(返回的内容不是页面,比如图片,JSON,文件下载)							
 */
@Controller
@RequestMapping(value="/image")
public class ImageControaller {
	
	@RequestMapping(value="createImg")
	public	void	createImg(HttpServletRequest request,HttpServletResponse response){
		
	}
	
}
