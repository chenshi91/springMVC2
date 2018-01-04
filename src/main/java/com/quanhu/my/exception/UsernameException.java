/**Created	by	chenshi  at	2018年1月3日 下午8:17:18*/
package com.quanhu.my.exception;

/**
 * @description:	UsernameException.java
 * @packageName:	com.quanhu.my.exception
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class UsernameException extends ApplicationException {

	/***/
	private static final long serialVersionUID = -3864289368533323726L;
	
	private	String message;

	/**
	 * @param message
	 */
	public UsernameException(String message) {
		super(message);
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
