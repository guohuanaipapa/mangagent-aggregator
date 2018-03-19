package org.apthce.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mangagent.dao.SysUserDao;
import org.mangagent.pojo.SysUser;
import org.mangagent.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class usercontroller {

	@Resource
	private UserService userService;
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index() throws Exception {
		return "sysuser/index";
	}
	
	 
	@RequestMapping("/list")
	@ResponseBody
	public Map<String, Object> list(Integer page, Integer rows,@RequestParam(defaultValue="id") String sort,@RequestParam(defaultValue="asc") String order,SysUser condition) throws Exception {
		Map<String, Object> map = new HashMap<>();
		
		int start = (page - 1) * rows;
		List<SysUser> list =userService.getList(0,5,null, "id", "asc");
		int total = userService.getCount(null);
		
		map.put("rows", list);
		map.put("total", total);
		
		return map;
	} 
}
