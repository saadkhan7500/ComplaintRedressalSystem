package com.ComplaintRedressalSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ComplaintRedressalSystem.model.Manager;
import com.ComplaintRedressalSystem.model.User;

@Repository
public class ManagerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int addManager(Manager manager)
	{
		return (Integer)hibernateTemplate.save(manager);
	}

}
