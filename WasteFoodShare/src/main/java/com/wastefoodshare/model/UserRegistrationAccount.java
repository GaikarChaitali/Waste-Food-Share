package com.wastefoodshare.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userAccount")
public class UserRegistrationAccount {
	
	/*{
		"userName":"Priya",
		"emailId":"cvs@gmail.com",
		"phoneNumber":"123456",
		"password":"cvs"
	}*/

	private long phonenumber;
	private String name;
	@Id
	private String email;
	private String password;
	
	
	public UserRegistrationAccount() {
		
	}
	
	public UserRegistrationAccount(long phonenumber, String name, String email, String password) {
		super();
		this.phonenumber = phonenumber;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRegistrationAccount [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", password=" + password + "]";
	}
	
	
	/*public UserRegistrationAccount(String emailId,String password) {
		
		this.emailId = emailId;
		this.password = password;
	}*/

	


	
	
	
	
	
	
	
	
	
	
	
}
