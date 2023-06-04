package com.ComplaintRedressalSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ComplaintRedressalSystem.dao.ComplaintDao;
import com.ComplaintRedressalSystem.dao.EngineerDao;
import com.ComplaintRedressalSystem.model.Complaint;
import com.ComplaintRedressalSystem.model.Engineer;

@Service
public class ComplaintService {
	
	
	@Autowired
	private ComplaintDao complaintDao;
	
	
	public int addComplaint(Complaint complaint)
	{
		return this.complaintDao.addComplaint(complaint);
	}
	
//	public List<Engineer> allEngineers()
//	{
//		return userDao.allEngineers();
//	}

}
