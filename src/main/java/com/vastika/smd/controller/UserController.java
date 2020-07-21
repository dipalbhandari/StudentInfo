package com.vastika.smd.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.vastika.smd.model.User;
import com.vastika.smd.service.UserService;
import com.vastika.smd.util.ImageUtil;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/add_user")
	public String getAddUserForm() {
		
		return "addUser" ;
	}
	
	
	

	
	@RequestMapping(value = "/save_user" , method = RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute User user , @RequestParam CommonsMultipartFile file) throws IOException {
		
		String fileName = file.getOriginalFilename();
		
		String imageUrl = ImageUtil.writeImageToDisk(file);
		user.setImageUrl(imageUrl);
		
		
		userService.saveUserInfo(user);
		
		return "redirect:/list_user";
		
	}
	
	@RequestMapping(value =  "/list_user")
	public String getAllUserInfo(Model model) {
		
		model.addAttribute("users" , userService.getAllUserInfo());
		
		return "listUser";
		
	}
	
	@RequestMapping(value = "/delete_user" , method = RequestMethod.GET)
	public String deleteUserInfo(@RequestParam int id) {
	
		userService.deleteUserInfo(id);
		
		return "redirect:/list_user";
		
	}
	
	
	

	
	
}
