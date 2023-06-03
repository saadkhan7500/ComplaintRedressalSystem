package com.ComplaintRedressalSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ComplaintRedressalSystem.model.Engineer;
import com.ComplaintRedressalSystem.model.User;

@Repository
public class EngineerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int addEngineer(Engineer engineer)
	{
		return (Integer)hibernateTemplate.save(engineer);
	}
	
	public List<Engineer> allEngineers()
	{
		return hibernateTemplate.loadAll(Engineer.class);
	}

}
