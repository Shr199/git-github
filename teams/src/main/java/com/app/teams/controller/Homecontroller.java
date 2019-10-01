package com.app.teams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	
	@RequestMapping({"","/","/home"})
	public String getIndexPage(Model model){
		return "user/home";
	}

}
