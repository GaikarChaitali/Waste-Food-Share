package com.wastefoodshare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wastefoodshare.model.UserLoginAccount;
import com.wastefoodshare.model.UserRegistrationAccount;
import com.wastefoodshare.service.UserService;

@CrossOrigin(origins="http://localhost:4008")
@RestController
@RequestMapping("/fooodshare")
public class UserController {
	
@Autowired
private UserService userService;
	
	
	@PostMapping("/users/create")
	public UserRegistrationAccount createUser(@RequestBody UserRegistrationAccount userRegistrationAccount) {
		System.out.println(userRegistrationAccount);
		userService.createUser(userRegistrationAccount);
		
		return userRegistrationAccount;	
	}
	//@ResponseBody
	@PostMapping("/users/login")
	public boolean validateUser(@RequestBody UserLoginAccount userLoginAccount) {
		//System.out.println(userService.validateUser(userLoginAccount));
		 userService.validateUser(userLoginAccount);
		 return userService.validateUser(userLoginAccount);
		
	}
	
	@GetMapping("/users")
	public List<UserRegistrationAccount> getAllUsers() {
		System.out.println("Get all Users...");
		
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{email}")
	public Optional<UserRegistrationAccount> getUserByEmail(@PathVariable String email) {
		System.out.println("Get sprcific User by email...");
		return userService.getUserByEmail(email);
	}
	@DeleteMapping("/users/delete")
	public void deleteAllUsers() {
		System.out.println("Delete All Users...");
 
		userService.deleteAllUsers();
	}
	
	@DeleteMapping("/users/delete/{email}")
	public void deleteUser(@PathVariable("email") String email) {
		System.out.println("Delete specific User...");
 
		userService.deleteUser(email);
	}


	

}
