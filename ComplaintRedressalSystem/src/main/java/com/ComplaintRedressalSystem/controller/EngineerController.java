package com.ComplaintRedressalSystem.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	 
	 @RequestMapping(value = "checkengineerlogin" , method=RequestMethod.POST)
	 public String checkEngineerLogin(@RequestParam("email")String email, 
			                          @RequestParam("password")String password,
			                          HttpSession session)
	 {
		 List<Engineer> engineers=engineerService.allEngineers();
		 Engineer engineer=engineers.stream()
				           .filter(e->e.getEmail().equalsIgnoreCase(email) && e.getPassword().equalsIgnoreCase(password))
				           .findFirst()
				           .orElse(null);
		 if(engineer!=null)
		 {
		 session.setAttribute("engineer", engineer);;
		 return "engineerprofile";
		 }
		 else
			 return "error";
	 }
	 
}
