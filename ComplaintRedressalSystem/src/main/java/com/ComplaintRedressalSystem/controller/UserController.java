package com.ComplaintRedressalSystem.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "index";
	}
	
	@RequestMapping("/complaintForm")
	public String complaintForm()
	{
		return "complaintForm";
	}
	
	@RequestMapping(value = "addUser" , method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user , HttpSession session)
	{
		userService.addUser(user);
		session.setAttribute("user", user);
		User u=(User)session.getAttribute("user");
		System.out.println("inside addUser Handler "+u);
		return "userprofile";
	}
	
	 @RequestMapping(value = "allusers" , method = RequestMethod.GET)
	 public String allUser(Model model)
	 {
		  List<User> users=userService.allUsers();
		  model.addAttribute("users", users);
		  return "allusers";
	 }
	 
	 
	 @RequestMapping(value = "checkuserlogin" ,method = RequestMethod.POST)
	 public String checkUerLogin(Model model,
			                     @RequestParam("email")String email,
			                     @RequestParam("password")String password,
			                     HttpSession session)
	 {
		 
		 List<User> users=userService.allUsers();
		 User user =users.stream()
		 .filter(e->e.getEmail().equalsIgnoreCase(email) && e.getPassword().equalsIgnoreCase(password))
		 .findFirst()
		 .orElse(null);
		 if(user!=null)
		 {
			    session.setAttribute("user", user);
		        return "userprofile";
		 }
		 else
			 return "error"; 
	 }
}
