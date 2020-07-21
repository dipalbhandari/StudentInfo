package com.vastika.smd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vastika.smd.service.UserService;

@Controller
public class HomeController {
	
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping (value = "/home")
	public String getHomePage() {
		return "home";
	}

}
