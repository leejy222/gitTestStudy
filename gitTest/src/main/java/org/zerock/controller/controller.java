package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/strcount")
public class controller {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String strcount() {
		
		
		return "strcount";
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String strcount1() {
		
		
		return "strcount";
	}
	
}
