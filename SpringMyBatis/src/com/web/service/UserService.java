package com.web.service;

import com.web.domain.User;

public interface UserService {
	
	public User login(String username, String password);

	public User json(String id);

	public String register(User user);

	public String update(User user);
	

}