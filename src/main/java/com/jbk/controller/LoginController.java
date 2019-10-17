package com.jbk.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/processform")
	public String homepage() {
	return "homepage";
	}
	
	
	@RequestMapping("/userpage")
	public String userpage(HttpServletRequest request) {
		String Username=request.getParameter("StudentName");
		String password=request.getParameter("Password");
		if(("jbk".equals(Username))&&("123456".equals(password))) {
			return "Userpage";
		}else
		
		return "homepage";
	}

}
