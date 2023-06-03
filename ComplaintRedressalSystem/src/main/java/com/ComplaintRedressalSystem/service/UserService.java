package com.ComplaintRedressalSystem.service;

import java.util.List;

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
	
	public List<User> allUsers()
	{
		return userDao.allUsers();
	}

}
