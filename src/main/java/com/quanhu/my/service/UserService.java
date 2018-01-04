/**Created	by	chenshi  at	2018年1月3日 下午8:10:45*/
package com.quanhu.my.service;

import com.quanhu.my.entity.User;

/**
 * @description:	UserService.java
 * @packageName:	com.quanhu.my.service
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public interface UserService {
	
	User	login(String userName,String password);
}
