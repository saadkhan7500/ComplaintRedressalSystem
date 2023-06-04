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
	public String addManager(@ModelAttribute Manager manager, HttpSession session)
	{
		managerService.addManager(manager);
		session.setAttribute("manager", manager);
		return "managerprofle";
	}
	
	 @RequestMapping(value = "allmanagers", method = RequestMethod.GET)
	 public String allManagers(Model model)
	 {
		 List<Manager> managers = managerService.allManagers(); 
		 model.addAttribute("managers", managers);
		 return "allmanagers";
	 }
	 
	 @RequestMapping(value = "checkmanagerlogin" , method = RequestMethod.POST)
	 public String checkManagerLogin(Model model,
			                         @RequestParam("email")String email,
			                         @RequestParam("password")String password,
			                         HttpSession session)
	 {
		 List<Manager> managers = managerService.allManagers();
		 Manager manager =managers.stream()
				          .filter(e->e.getEmail().equalsIgnoreCase(email)&&e.getPassword().equalsIgnoreCase(password))
				          .findFirst()
				          .orElse(null);
		 model.addAttribute("manager", manager);
		 if(manager!=null)
		 {
			 session.setAttribute("manager", manager);
		     return "managerprofle";
		 }
		 else
			 return "error";
	 }

}
