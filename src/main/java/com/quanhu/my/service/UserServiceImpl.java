/**Created	by	chenshi  at	2018年1月3日 下午8:11:43*/
package com.quanhu.my.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.quanhu.my.dao.UserDao;
import com.quanhu.my.entity.User;
import com.quanhu.my.exception.ApplicationException;
import com.quanhu.my.exception.PasswordException;
import com.quanhu.my.exception.SystemException;
import com.quanhu.my.exception.UsernameException;

/**
 * @description:	UserServiceImpl.java
 * @packageName:	com.quanhu.my.service
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
//@Transactional
@Service(value="us")
public class UserServiceImpl implements UserService {
	
	@Resource(name="ud")
	private	UserDao	userDao;

	//@Transactional
	public User login(String userName, String password) {
		User user;
		try {
			user = userDao.selectBuUsernameAndPassword(userName);
			if(user==null){
				throw	new	UsernameException("用户名不对");
			}else	if(!password.equals(user.getPassword())){
				throw	new	PasswordException("密码不对");
			}else{
				return	user ;
			}
		} catch (ApplicationException ae) {
			throw	ae;
		}catch (Exception e) {
			throw	new	SystemException("系统级别异常");
		}
	}

}
