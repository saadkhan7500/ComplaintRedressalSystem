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

	public void editComplaint(int uid, int eid) 
	{
		 complaintDao.editComplaint(uid,eid);
		
	}

	public List<Complaint> assignedComplaint(int id) {
		
		return complaintDao.assignedComplaint(id);
	}

	public void solvedComplaint(int id, int uid, int eid) {
		
		complaintDao.solvedComplaint(id,uid,eid);
	}

	public void completeComplaint(int id, int uid , int eid, String feedback) {

       complaintDao.completeComplaint(id,uid,eid,feedback);
		
	}

}
