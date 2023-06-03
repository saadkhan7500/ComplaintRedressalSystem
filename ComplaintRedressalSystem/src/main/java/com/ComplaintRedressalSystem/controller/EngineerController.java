package com.ComplaintRedressalSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ComplaintRedressalSystem.model.Engineer;
import com.ComplaintRedressalSystem.model.User;
import com.ComplaintRedressalSystem.service.EngineerService;
import com.ComplaintRedressalSystem.service.UserService;

@Controller
public class EngineerController {
	
	@Autowired
	private EngineerService engineerService;
	
	
	@RequestMapping("/engineerlogin")
	public String login()
	{
		return "engineerlogin";
	}
	
	@RequestMapping("/engineersignup")
	public String signup()
	{
		return "engineersignup";
	}

	@RequestMapping(value = "addEngineer" , method = RequestMethod.POST)
	public String addUser(@ModelAttribute Engineer engineer)
	{
		engineerService.addEngineer(engineer);
		return "engineerprofile";
	}
	
	 @RequestMapping(value = "allengineers" , method = RequestMethod.GET)
	  public String allUser(Model model)
	  {
		  List<Engineer> engineers=engineerService.allEngineers();
		  model.addAttribute("engineers", engineers);
		  return "allengineers";
	  }
	 
}
