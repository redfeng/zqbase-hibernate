package com.zqxx.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zqxx.shiro.annotation.CurrentUser;
import com.zqxx.system.entity.SysUser;

@Controller
public class UserCtrl {
	@RequestMapping("/")
	public String index(@CurrentUser SysUser user,ModelMap model){
		
		model.addAttribute("user", user);
		return "index";
	}
	@RequestMapping("/index_v1")
	public String indexv1(){
		return "index_v1";
	}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
