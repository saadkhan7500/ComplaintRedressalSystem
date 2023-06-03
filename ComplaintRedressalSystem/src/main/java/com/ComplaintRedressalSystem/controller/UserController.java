package com.ComplaintRedressalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ComplaintRedressalSystem.model.User;
import com.ComplaintRedressalSystem.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/index")
	public String index1()
	{
		return "index";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/signup")
	public String signup()
	{
		return "signup";
	}

	
	@RequestMapping("/complaintForm")
	public String complaintForm()
	{
		return "complaintForm";
	}
	
	@RequestMapping(value = "addUser" , method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user)
	{
		userService.addUser(user);
		return "profle";
	}

}
