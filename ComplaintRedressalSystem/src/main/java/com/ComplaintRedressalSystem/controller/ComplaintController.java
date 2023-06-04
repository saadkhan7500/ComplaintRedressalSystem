package com.ComplaintRedressalSystem.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ComplaintRedressalSystem.dao.ComplaintDao;
import com.ComplaintRedressalSystem.model.Complaint;
import com.ComplaintRedressalSystem.model.Engineer;
import com.ComplaintRedressalSystem.model.Manager;
import com.ComplaintRedressalSystem.service.ComplaintService;
import com.ComplaintRedressalSystem.service.EngineerService;
import com.ComplaintRedressalSystem.service.ManagerService;


@Controller
public class ComplaintController {
	
	@Autowired
	private ComplaintService complaintService;
	
	@Autowired
	private EngineerService engineerService;
	
	
	@RequestMapping(value = "addComplaint" , method = RequestMethod.POST)
	public String addManager(@ModelAttribute Complaint complaint)
	{
		complaint.setStatus("pending");
		complaint.setUserfeedback("nill");
		complaintService.addComplaint(complaint);
		return "userprofile";
	}
	
	 @RequestMapping(value = "usercomplaints")
	 public String userComplaints(@RequestParam("id")int id ,Model model)
	 {
		 List<Complaint> complaints=complaintService.allComplaints();
		 List<Complaint> usercomplaints = complaints.stream()
		           .filter(e->e.getUid()==id).
		           collect(Collectors.toList());
		 
		 model.addAttribute("usercomplaints", usercomplaints);
		 System.out.println(usercomplaints);
		 
		 return "usercomplaints";
	
	 }
	 
	 @RequestMapping(value = "allcomplaints" , method=RequestMethod.GET)
	 public String allComplaints(Model model)
	 {
		 List<Complaint> complaints = complaintService.allComplaints();
		 model.addAttribute("complaints", complaints);
		 model.addAttribute("size", complaints.size());
		 
		 List<Engineer> engineers = engineerService.allEngineers();
		 model.addAttribute("engineers", engineers);
		 return "allcomplaints";
	 }
	 
	 @RequestMapping(value = "editcomplaint" , method=RequestMethod.GET)
	 public String editComplaint(@RequestParam("uid")int uid,
			                     @RequestParam("eid")int eid,
			                     Model model)
	 {
		 complaintService.editComplaint(uid,eid);
		 List<Complaint> complaints = complaintService.allComplaints();
		 model.addAttribute("complaints", complaints);
		 model.addAttribute("size", complaints.size());
		 return "allcomplaints";
	 }
	 
	 @RequestMapping(value = "assignedcomplaint" , method=RequestMethod.GET)
	 public String assignedComplaint(@RequestParam("id")int id,Model model)
	 {
		 List<Complaint> complaints = complaintService.assignedComplaint(id) ;
		 model.addAttribute("complaints", complaints);
		 return "engineerassignedcomplaint";
	 }
}
