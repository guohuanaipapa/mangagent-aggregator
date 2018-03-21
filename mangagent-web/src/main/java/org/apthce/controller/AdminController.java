package org.apthce.controller;

import javax.servlet.http.HttpSession;

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
		System.out.println("请认证");
		return "redirect:/admin/login";
	 }
}
