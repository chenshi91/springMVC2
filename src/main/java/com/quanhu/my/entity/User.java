/**Created	by	chenshi  at	2018年1月3日 下午4:46:26*/
package com.quanhu.my.entity;

/**
 * @description:	User.java
 * @packageName:	com.quanhu.entity
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class User {

	private	Long	id;
	private	String	userName;
	private	String	password;
	public Long getId() {
		return id;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	/**
	 * @param userName
	 * @param password
	 */
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
