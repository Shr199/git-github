package com.app.teams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.teams.model.Users;
import com.app.teams.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String addUser(Users user) {
		
		userRepository.save(user);
		return "success";
	}

	@Override
	public Users getUserById(int id) {
		Users users=userRepository.getUserById(id);
		return users;
	}

	@Override
	public List<Users> getAllUsers() {
		List<Users> userlist=userRepository.findAll();
		return userlist;
	}
}