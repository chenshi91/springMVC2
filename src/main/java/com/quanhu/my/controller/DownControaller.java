/**Created	by	chenshi  at	2018年1月4日 下午3:52:12*/
package com.quanhu.my.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quanhu.my.exception.SystemException;

/**
 * @description:	DownControaller.java
 * @packageName:	com.quanhu.my.controller
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
@Controller
@RequestMapping(value="/down")
public class DownControaller {
	
	@RequestMapping(value="/download",method=RequestMethod.GET)
	public	void	down(HttpSession session,HttpServletResponse response,String fileName){
		/**1,通过相对路径获取绝对路径*/
		ServletContext servletContext = session.getServletContext();
		String realPath = servletContext.getRealPath("/upload");
		
		
		try {
			byte[] bs = FileUtils.readFileToByteArray(new File(realPath+"\\loginName.txt"));
			
			/**告诉浏览器以附件的形式下载内容,*/
			response.setHeader("content-disposition", "attachment;filename="+fileName);
			
			/**获得输出流 */
			ServletOutputStream os = response.getOutputStream();
			os.write(bs);
			
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
			throw	new	SystemException("下载出现异常了");
		}
	}
}
