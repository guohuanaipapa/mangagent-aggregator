package org.apthce.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.mangagent.service.ResidenceService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource
	private ResidenceService residenceService;
	 public void setResidenceService(ResidenceService residenceService) {
		this.residenceService = residenceService;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
     public String login()throws Exception{
    	   return "/adminLogin";
     }
	 @RequestMapping(value="/login",method=RequestMethod.POST)
	 public String login(HttpSession session)throws Exception{
		System.out.println("请认证");
		return "redirect:/admin/login";
	 }
	 @RequestMapping("/ownerlist")
	 @ResponseBody
	 public String ownerlist()throws Exception{
		  return null;
	 }
}
