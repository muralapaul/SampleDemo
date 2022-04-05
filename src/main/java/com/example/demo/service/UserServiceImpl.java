package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserAlreadyExistsException;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) throws UserAlreadyExistsException {
		if(userRepository.existsById(user.getId()))
			throw new UserAlreadyExistsException();
		else
	//		User savedUser=userRepository.save(user);
			return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}
	

}
