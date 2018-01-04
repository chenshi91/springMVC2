/**Created	by	chenshi  at	2018年1月4日 下午6:10:22*/
package com.quanhu.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:	TestInteceptorController.java
 * @packageName:	com.quanhu.my.controller
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
@RequestMapping(value="/inc")
@Controller
public class TestInteceptorController{
	
	@RequestMapping(value="/ince",method=RequestMethod.GET)
	public	String	inc(){
		System.out.println("---------------serviceMethod()--------------");
		return	"redirect:/index.jsp";
	}
}
