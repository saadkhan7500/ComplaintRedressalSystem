package com.ComplaintRedressalSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ComplaintRedressalSystem.dao.ManagerDao;
import com.ComplaintRedressalSystem.model.Manager;

@Service
public class ManagerService {
	
	
	@Autowired
	private ManagerDao managerDao;
	
	
	public int addManager(Manager manager)
	{
		return this.managerDao.addManager(manager);
	}

}
