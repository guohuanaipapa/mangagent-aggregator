package org.apthce.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	


	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index() throws Exception {
		return "sysuser/index";
	}
	
	
	@RequestMapping("/login")
	public String  login() throws Exception{
		return "userLogin";
	}
	
	@RequestMapping("/main")
	public String main()throws Exception{
		return "main";
	}
}
