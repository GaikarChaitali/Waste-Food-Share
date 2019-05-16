package com.wastefoodshare.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.wastefoodshare.model.UserRegistrationAccount;

public interface UserRepository extends MongoRepository<UserRegistrationAccount, String>{
	
}
