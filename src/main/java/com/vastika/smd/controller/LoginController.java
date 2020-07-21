package com.vastika.smd.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.smd.dto.Login;
import com.vastika.smd.model.User;
import com.vastika.smd.service.UserService;

@Controller
public class LoginController {
	
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"/" , "/login"})
	public String getLoginForm() {
		return "login";
	}
	
	
	// here the param username should be as as the one used in the loin jsp
	
	
	
	@PostMapping(value = "/user-login")
	public String login(@ModelAttribute Login login , @RequestParam String name , @RequestParam String password ,   HttpSession session , HttpServletRequest request , HttpServletResponse response , Model model) {
		
		User user = userService.getUserByUsernameAndPassword(login.getName(), login.getPassword());
		
		if(user!=null) {
			
			 
			 session.setAttribute("name", login.getName());
			 
			 if(login.getRememberMe() != null) {
				 Cookie cookie1;
				 Cookie cookie2;
				 cookie1 = new Cookie("name", name);
				 cookie2 = new Cookie("password", password);
				 cookie1.setMaxAge(100);
				 cookie1.setMaxAge(100);
				 response.addCookie(cookie1);
				 response.addCookie(cookie2);
				 
				
				
				 
			 }
			 
             return "redirect:/home";
			
		}
		
		model.addAttribute("msg", "wrong password or username");
		
		return "login";
		
	}
	
	@GetMapping("/logout")
	public String getLogoutForm(Model model , HttpSession session , HttpServletRequest request) {
		
		//when we logiut we need to invalidate 
		
		session.invalidate();
		

	      Cookie [] cookies = request.getCookies();

	      if(cookies != null){
	    	  
	    	  for(int i = 0 ; i < cookies.length ; i++){
	    		  if(cookies[i].getName().equals("name")){
	    			  
	    			  model.addAttribute("uname", cookies[i].getValue());
	    			  
	    		  }
	    		  
	    		  else if (cookies[i].getName().equals("password"));
	    		  
	    		  
	    			  model.addAttribute("pass", cookies[i].getValue());
	    			  
	    		  }
	    	  }
	    	  
	      
		model.addAttribute("logoutMsg", "You are successfully logged out");
		return "login";
	}

	
	
	
	
	
}
