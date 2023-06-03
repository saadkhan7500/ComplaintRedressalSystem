package com.ComplaintRedressalSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ComplaintRedressalSystem.model.Manager;
import com.ComplaintRedressalSystem.model.User;
import com.ComplaintRedressalSystem.service.ManagerService;
import com.ComplaintRedressalSystem.service.UserService;

@Controller
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	
	@RequestMapping("/managerlogin")
	public String login()
	{
		return "managerlogin";
	}
	
	@RequestMapping("/managersignup")
	public String signup()
	{
		return "managersignup";
	}

	@RequestMapping(value = "addManager" , method = RequestMethod.POST)
	public String addManager(@ModelAttribute Manager manager)
	{
		managerService.addManager(manager);
		return "managerprofle";
	}
	
	 @RequestMapping(value = "allmanagers", method = RequestMethod.GET)
	 public String allManagers(Model model)
	 {
		 List<Manager> managers = managerService.allManagers(); 
		 return "allmanagers";
	 }

}
