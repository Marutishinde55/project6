package com.jbk.services;

import com.jbk.model.UserLogin;
import com.jbk.model.UserRegistration;

public interface UserService {
	void register (UserRegistration user);
	UserRegistration validateUser(UserLogin login);

}
