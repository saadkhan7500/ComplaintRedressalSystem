package com.ComplaintRedressalSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ComplaintRedressalSystem.dao.EngineerDao;
import com.ComplaintRedressalSystem.model.Engineer;

@Service
public class EngineerService {
	
	
	@Autowired
	private EngineerDao userDao;
	
	
	public int addEngineer(Engineer engineer)
	{
		return this.userDao.addEngineer(engineer);
	}
	
	public List<Engineer> allEngineers()
	{
		return userDao.allEngineers();
	}

}
