package com.fangxupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("brand")
public class BrandController {

	@RequestMapping("list")
	public String list(Model m,@RequestParam(defaultValue = "1")int page) {
	
		return "/brand/list";
		
	}
}
