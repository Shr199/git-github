package com.app.teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.teams.model.Users;
import com.app.teams.service.UserService;


	@Controller
	public class Registrationformcontroller {
		@Autowired
		private UserService userService;
		
		@RequestMapping({"/Registrationform"})
		public String getRegistrationPage(Model model){
			return "user/Registrationform";
		}
		@RequestMapping({"/user/add"})
		public String addUser(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("password") String password, Model model){
			Users user=new Users();
			user.setEmail(email);
			user.setPassword(password);
			String retVal=userService.addUser(user);
			model.addAttribute("res",retVal);
			return "user/Registrationform";
		}
	}
	



