package com.vastika.smd.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.smd.model.User;
import com.vastika.smd.service.UserService;
import com.vastika.smd.util.ImageUtil;


@Controller
public class ImageDisplayController {
	
	
	@Autowired
	private UserService userService;
	
	
	
	@GetMapping("/image_display")
	public void displayImage(@RequestParam int id , HttpServletResponse response) {
		
		
		
		User user = userService.getUserById(id);
		ImageUtil.readImageFromDisk(user.getImageUrl() , response);
		
	}

}
