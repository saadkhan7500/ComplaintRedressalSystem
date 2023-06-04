package com.ComplaintRedressalSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ComplaintRedressalSystem.model.Complaint;

@Repository
public class ComplaintDao {

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	
	@Transactional
	public int addComplaint(Complaint complaint)
	{
		return (Integer)hibernateTemplate.save(complaint);
	}
}
