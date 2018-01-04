/**Created	by	chenshi  at	2018年1月3日 下午8:28:50*/
package com.quanhu.my.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quanhu.my.service.UserService;

/**
 * @description:	UserControaller.java
 * @packageName:	com.quanhu.my.controller
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
/*-----------------------------------异常处理机制--------------------------------*/
@RequestMapping(value="/user")
@Controller
public class UserControaller {
	
	@Resource(name="us")
	private	UserService	userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public	String login(String userName,String password,HttpSession	session){
		userService.login(userName, password);
		session.setAttribute("flag", "y");
		return	"redirect:/login/loginOk.jsp";
		
	}
}
