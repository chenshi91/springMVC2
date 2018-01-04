/**Created	by	chenshi  at	2018年1月4日 上午11:17:48*/
package com.quanhu.my.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:	UploadController.java
 * @packageName:	com.quanhu.my.controller
 * @projectName:	quanhu-springMVC2
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
/*-------------------------------------文件上传------------------------------*/
@Controller
@RequestMapping(value="/upload")
public class UploadController {
	
	@RequestMapping(value="/uploadfile",method=RequestMethod.POST)
	public	String	upload(MultipartFile	uploadFile,HttpSession	session) throws IllegalStateException, IOException{
		/*通过相对路径获取绝对路径*/
		ServletContext servletContext = session.getServletContext();
		String realPath = servletContext.getRealPath("/upload");
		
		File fileLocation = new	File(realPath+"\\"+uploadFile.getOriginalFilename());
		uploadFile.transferTo(fileLocation);
		return	"redirect:/uploadOk.jsp";
	}
}
