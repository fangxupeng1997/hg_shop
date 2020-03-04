package com.fangxupeng.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fangxupeng.hgshop.Spec;
import com.fangxupeng.service.SpecService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("spec")
public class SpecController {
	
	@Reference
	SpecService specService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,@RequestParam(defaultValue = "")String name,Model m,@RequestParam(defaultValue = "1")int page) {
	
		PageInfo<Spec> info = specService.list(name, page);
		
		request.setAttribute("info", info);
		
		return "spec/list";
		
	}
	
	
	@RequestMapping("add")
	public String add(HttpServletRequest request,Spec spec) {
	
		//System.out.println("spec"+spec);
		spec.getOption().removeIf(x->{return x.getOptionName()==null;});
		//System.out.println("spec 處理後"+spec);
		int i = specService.add(spec);
		
		return i>0?"success":"false";
		
	}
	
}
