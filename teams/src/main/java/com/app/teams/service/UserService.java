package com.app.teams.service;

import java.util.List;

import com.app.teams.model.Users;

public interface UserService  {
		public String addUser(Users user);
		public Users getUserById(int id);
		public List<Users> getAllUsers();
	}



