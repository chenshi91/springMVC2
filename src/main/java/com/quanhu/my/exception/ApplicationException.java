/**Created	by	chenshi  at	2018年1月3日 下午7:57:07*/
package com.quanhu.my.exception;

/**
 * @description:	ApplicationException.java
 * @packageName:	com.quanhu.my.exception
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class ApplicationException extends RuntimeException {
	/***/
	private static final long serialVersionUID = -965466131416673542L;
	
	private	String	message;

	/**
	 * @param message
	 */
	public ApplicationException(String message) {
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
