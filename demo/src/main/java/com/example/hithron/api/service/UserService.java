package com.example.hithron.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hithron.api.dao.UserRepository;
import com.example.hithron.api.dto.UserDTO;
import com.example.hithron.api.model.UserEntity;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public UserEntity createUser(UserDTO userDto) {
		//UserEntity user = UserEntity.
		return null;	
	}

}
