/**Created	by	chenshi  at	2018年1月3日 下午8:01:23*/
package com.quanhu.my.dao;

import com.quanhu.my.entity.User;

/**
 * @description:	UserDao.java
 * @packageName:	com.quanhu.my
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public interface UserDao {
	
	User	selectBuUsernameAndPassword(String userName);
}
