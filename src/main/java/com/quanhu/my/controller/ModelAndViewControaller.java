/**Created	by	chenshi  at	2018年1月4日 上午9:56:05*/
package com.quanhu.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.quanhu.my.entity.User;

/**
 * @description:	ModelAndViewControaller.java
 * @packageName:	com.quanhu.my.controller
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
/*-----------------------------ModelAndView--------------------*/
/*---------------------1,@SessionAttributes操作session作用域*/
/*---------------------2,在使用ModelAndView过程中,如果springMVC发现是redirect跳转,自动把
 * 							ModelAndView.addObject()里面的内容拼接到地址栏里面去*/
@Controller
@RequestMapping(value="/mv")
@SessionAttributes(value={"age"})
public class ModelAndViewControaller {
	
	@RequestMapping(value="/m1",method=RequestMethod.GET)
	public	ModelAndView	m1(){
		ModelAndView mv = new	ModelAndView();
		mv.addObject("age", 100);
		mv.addObject("us", new User("xu", "jiali"));
		mv.setViewName("forward:/index.jsp");
		return	mv;
	}
}
