/**Created	by	chenshi  at	2018年1月3日 下午8:19:47*/
package com.quanhu.my.exception;

/**
 * @description:	PasswordException.java
 * @packageName:	com.quanhu.my.exception
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class PasswordException extends ApplicationException {
	/***/
	private static final long serialVersionUID = -8710093874018502632L;
	
	private	String message;

	/**
	 * @param message
	 */
	public PasswordException(String message) {
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
