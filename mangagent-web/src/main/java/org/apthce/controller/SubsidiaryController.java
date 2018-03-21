package org.apthce.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mangagent.pojo.EnterpriseArchives;
import org.mangagent.pojo.SubcompanyArchives;
import org.mangagent.service.EnterpriseArchivesService;
import org.mangagent.service.SubcompanyArchivesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/subsidiary")
public class SubsidiaryController {
	
	@Resource
	private EnterpriseArchivesService enterpriseArchivesService;
	@Resource	
	private SubcompanyArchivesService subcompanyArchivesService;
	
	
	public void setSubcompanyArchivesService(SubcompanyArchivesService subcompanyArchivesService) {
		this.subcompanyArchivesService = subcompanyArchivesService;
	}



	public void setEnterpriseArchivesService(EnterpriseArchivesService enterpriseArchivesService) {
		this.enterpriseArchivesService = enterpriseArchivesService;
	}



	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String getSub() { 
		return "subsidiary/index";
	}
	
	@RequestMapping(value="/getByOne",method=RequestMethod.GET)
	@ResponseBody
	public EnterpriseArchives getbyOne() {
		EnterpriseArchives enter=enterpriseArchivesService.getById(1);
		return enter;
	};
	
	@RequestMapping("/getAll")
	@ResponseBody
	public Map<String,Object> getAll() {
		 Map<String, Object> map =new HashMap<>();
		 List<SubcompanyArchives> list=subcompanyArchivesService.getByContion(0, 100, null, "subName", null);
		 map.put("rows", list);
		 Integer count=subcompanyArchivesService.getCountByContion(null);
		 map.put("total", count);
		return map;
	};
	
 
	
	
}
