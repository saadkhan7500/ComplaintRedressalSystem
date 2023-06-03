package com.ComplaintRedressalSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ComplaintRedressalSystem.dao.UserDao;
import com.ComplaintRedressalSystem.model.User;

@Service
public class UserService {
	
	
	@Autowired
	private UserDao userDao;
	
	
	public int addUser(User user)
	{
		return this.userDao.addUser(user);
	}

}
