package com.wastefoodshare.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.wastefoodshare.model.UserLoginAccount;
import com.wastefoodshare.model.UserRegistrationAccount;
import com.wastefoodshare.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void createUser(UserRegistrationAccount userRegistrationAccount) {
		 
	//userRepository.save(new UserAccount(userAccount.getUserName(), userAccount.getEmailId(),userAccount.getPhoneNumber(),userAccount.getPassword()));
		System.out.println(userRegistrationAccount + "saved in database");
		userRepository.save(userRegistrationAccount);
		
	}

	public boolean validateUser(UserLoginAccount userLoginAccount) {

		List<UserRegistrationAccount> users=userRepository.findAll();
		for(UserRegistrationAccount user:users) {
			if(user.getEmail().equals(userLoginAccount.getEmail()) && user.getPassword().equals(userLoginAccount.getPassword())) {
				return true;
			}
		}
		return false;
		
	}

	public List<UserRegistrationAccount> getAllUsers() {
		 
		List<UserRegistrationAccount> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
 
		return users;
	}

	public Optional<UserRegistrationAccount> getUserByEmail(String email) {
		System.out.println(email);
		return userRepository.findById(email);
	}

	public void deleteAllUsers() {
		
		userRepository.deleteAll();
	}

	public void deleteUser(String email) {
		userRepository.deleteById(email);
		
	}
	

	/*public Optional<UserRegistrationAccount> getUserByName(String userName) {
		System.out.println(userName);
		Optional<UserRegistrationAccount> users = userRepository.findById
				//.getUserByName(userName);
		System.out.println(users);
		return users;
	}*/
}
