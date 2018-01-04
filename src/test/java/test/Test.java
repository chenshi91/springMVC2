/**Created	by	chenshi  at	2018年1月3日 下午11:19:21*/
package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quanhu.my.service.UserService;

/**
 * @description:	Test.java
 * @packageName:	test
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xml = new	ClassPathXmlApplicationContext("spring-mvc.xml");
		UserService	us=(UserService) xml.getBean("userService");
		us.login("chens", "123456");
		System.out.println();
	}
}
