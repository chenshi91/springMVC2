/**Created	by	chenshi  at	2018年1月3日 下午8:03:06*/
package com.quanhu.my.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.quanhu.my.entity.User;
import com.quanhu.my.exception.SystemException;

/**
 * @description:	UserDaoImpl.java
 * @packageName:	com.quanhu.my.dao
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
@Repository(value="ud")
public class UserDaoImpl implements UserDao {

	public User selectBuUsernameAndPassword(String userName) {
		HashMap<String, User> map;
		try {
			map = new	HashMap<String, User>();
			map.put("chens", new User("chens", "1230"));
			map.put("xujiali",new User("xujiali", "123456"));
			return map.get(userName);
		} catch (Exception e) {
			e.printStackTrace();
			throw	new	SystemException("我的系统出现异常!");
		}
		
	}

}
