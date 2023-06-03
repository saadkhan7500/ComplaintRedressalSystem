package com.ComplaintRedressalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ComplaintRedressalSystem.model.User;
import com.ComplaintRedressalSystem.service.UserService;

@Controller
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	
  @RequestMapping("/adminlogin")
  public String adminLogin()
  {
	  return "adminlogin";	  
  }
	
  @RequestMapping(value = "checkAdmin", method = RequestMethod.POST)
  public String checkAdmin(@RequestParam("email")String email, @RequestParam("password")String password)
  {
	  if(email.equalsIgnoreCase("admin123@gmail.com") && password.equalsIgnoreCase("admin"))
		  return "adminprofile";
	  else
		  return "error";
  }
  
 
}
