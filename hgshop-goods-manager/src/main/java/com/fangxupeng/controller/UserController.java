package com.fangxupeng.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fangxupeng.service.GoodsService;
import com.fangxupeng.service.UserService;

@Controller
public class UserController { 
	
	@Reference(timeout = 2000,version = "1.0.0")
	UserService userService;
	
	@RequestMapping("toLogin")
	public String toLogin() {
		return "login";
	}
	
	
	@RequestMapping("login.do")
	public String login(String userName,String passWord) {
		
		boolean b = userService.login(userName, passWord);
		
		if(b) {
			return "index";
		}
		
		return "login";
	}
	
}
