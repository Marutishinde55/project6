package com.jbk.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.jbk.dao.UserDao;
import com.jbk.model.UserLogin;
import com.jbk.model.UserRegistration;

public class UserServiceimp implements UserService {
	
	
	@Autowired
	public UserDao userdao;

	public void register(UserRegistration user) {
		
		
	}

	public UserRegistration validateUser(UserLogin login) {
		// TODO Auto-generated method stub
		return null;
	}

}
