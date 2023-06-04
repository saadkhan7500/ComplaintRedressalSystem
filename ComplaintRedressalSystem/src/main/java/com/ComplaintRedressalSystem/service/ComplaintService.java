package com.ComplaintRedressalSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ComplaintRedressalSystem.dao.ComplaintDao;

import com.ComplaintRedressalSystem.model.Complaint;

@Service
public class ComplaintService {
	
	
	@Autowired
	private ComplaintDao complaintDao;
	
	
	public int addComplaint(Complaint complaint)
	{
		return this.complaintDao.addComplaint(complaint);
	}
	
	public List<Complaint> allComplaints()
	{
		return complaintDao.allComplaints();
	}

}
