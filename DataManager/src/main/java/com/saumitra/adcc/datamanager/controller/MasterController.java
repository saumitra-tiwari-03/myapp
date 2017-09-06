package com.saumitra.adcc.datamanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MasterController {
	
	@RequestMapping("/")
	public String controller(){
		return "welcome";
	}
}
