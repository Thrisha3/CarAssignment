package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value ="/")
	public String init(Model model1) {
		model1.addAttribute("welcome", "Cars Room");
		return "index";
	}

}
