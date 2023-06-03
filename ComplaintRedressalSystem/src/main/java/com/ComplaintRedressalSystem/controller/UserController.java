package com.ComplaintRedressalSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/userlogin")
	public String login()
	{
		return "userlogin";
	}
	
	@RequestMapping("/usersignup")
	public String signup()
	{
		return "usersignup";
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
		return "userprofle";
	}
	
	 @RequestMapping(value = "allusers" , method = RequestMethod.GET)
	  public String allUser(Model model)
	  {
		  List<User> users=userService.allUsers();
		  model.addAttribute("users", users);
		  return "allusers";
	  }
	 
}
