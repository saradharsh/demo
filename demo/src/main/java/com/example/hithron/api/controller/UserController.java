package com.example.hithron.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hithron.api.dao.UserRepository;
import com.example.hithron.api.model.UserEntity;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/createUser")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {		
		return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserEntity>> getAllUsers() {		
		return ResponseEntity.ok(userRepository.findAll());
		
	}
	
	
	@GetMapping("/getUserById/{userId}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable Integer userId) {		
		return ResponseEntity.ok(userRepository.findByUserId(userId));
		
	}
	

	@PutMapping("/updateUserInfo")
	public ResponseEntity<UserEntity> updateUserInfo(@RequestBody UserEntity user) {	
		UserEntity dbUser = userRepository.findByUserId(user.getUserId());
		
		return ResponseEntity.ok(dbUser);
		
	}
	

}
