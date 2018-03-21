package org.apthce.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.mangagent.pojo.Admin;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {
	 @RequestMapping(value="/login",method=RequestMethod.GET)
     public String login()throws Exception{
    	   return "/adminLogin";
     }
	 @RequestMapping(value="/login",method=RequestMethod.POST)
	 public String login(HttpSession session)throws Exception{
		System.out.println("diyi");
		return "redirect:/admin/login";
	 }
	 
	 @RequestMapping(value="/main",method=RequestMethod.GET)
	 public String main(HttpSession session) {
		 //	获得当前用户 
		 Subject subject= SecurityUtils.getSubject();
		 Admin admin=(Admin) subject.getPrincipal();
		 session.setAttribute("login_user", admin);
		 return "main";
	 }
}
