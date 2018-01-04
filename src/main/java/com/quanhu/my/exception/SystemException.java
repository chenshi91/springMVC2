/**Created	by	chenshi  at	2018年1月3日 下午7:53:56*/
package com.quanhu.my.exception;

/**
 * @description:	SystemException.java
 * @packageName:	com.quanhu.my
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class SystemException extends RuntimeException {
	/***/
	private static final long serialVersionUID = 1810962551762735214L;
	
	private	String	message;

	/**
	 * @param message
	 */
	public SystemException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
