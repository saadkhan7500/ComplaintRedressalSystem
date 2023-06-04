package com.ComplaintRedressalSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ComplaintRedressalSystem.model.Complaint;
import com.ComplaintRedressalSystem.service.ComplaintService;


@Controller
public class ComplaintController {
	
	@Autowired
	private ComplaintService complaintService;
	
	
	@RequestMapping(value = "addComplaint" , method = RequestMethod.POST)
	public String addManager(@ModelAttribute Complaint complaint)
	{
		complaint.setStatus("pending");
		complaintService.addComplaint(complaint);
		return "userprofile";
	}
	
	 @RequestMapping(value = "usercomplaints" , method=RequestMethod.POST)
	 public List<Complaint> userComplaints(@RequestParam("id")int id )
	 {
		 return null;
	 }
}
