package com.ComplaintRedressalSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ComplaintRedressalSystem.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int addUser(User user)
	{
		return (Integer)hibernateTemplate.save(user);
	}
	
	public List<User> allUsers()
	{
		return hibernateTemplate.loadAll(User.class);
	}

}
