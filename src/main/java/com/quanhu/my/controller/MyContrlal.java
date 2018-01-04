/**Created	by	chenshi  at	2018年1月3日 下午5:15:04*/
package com.quanhu.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quanhu.my.entity.User;

/**
 * @description:	MyContrlal.java
 * @packageName:	com.quanhu.my.controal
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
/*--------------------------@ModelAttribute注解------------------------*/
@Controller
@RequestMapping(value="/my")
public class MyContrlal {
	
	/* ------------------------(业务涉及到分页参数)	
	 * @ModelAttribute注解 ,springMVC自动将参数age存放在request作用域中,名字就叫做age
	 * 1.1,如果入参是基本数据类型,则名称和形参保持一致
	 * 1.2,存储的内容不受后面赋值的影响,因为是简单类型
	 */
	@RequestMapping(value="/m1",method=RequestMethod.GET)
	public	String	m1(@ModelAttribute(value="age")int age){
		System.out.println("接收到的参数:"+age);
		age=30;
		return	"forward:/index.jsp";
	}
	
	/*
	 *2.1,如果入参不是基本数据类型,比如包装类型,则名称和形参可以不保持一致 
	 *2.2,存储的内容受后面赋值的影响,因为不是简单类型(引用 corejava:值栈原理...)
	 */
	@RequestMapping(value="/m2",method=RequestMethod.POST)
	public	String	m2(@ModelAttribute("us")User user){
		user.setUserName("corejava");
		return	"forward:/index.jsp";
	}
	
	/*
	 * 3,如果不使用@ModelAttribute注解,springMVC自动吧对象类型放置到request作用域,名称为首字母小写
	 */
	@RequestMapping(value="/m3",method=RequestMethod.POST)
	public	String	m3(User user){
		return	"forward:/index2.jsp";
	}
	
	/*
	 * 4,用在方法上,默认把方法的返回值存在request作用域里面,只要执行controal里面的方法,不管调用哪个方法(比较少用)
	 */
	@ModelAttribute(value="us")
	public	User	createUser(){
		return	new	User("xujiali", "110");
	}

}
