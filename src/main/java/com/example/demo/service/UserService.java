package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.exception.UserAlreadyExistsException;

public interface UserService {
	
	User saveUser(User user) throws UserAlreadyExistsException;
	List<User> getAllUsers();

}
