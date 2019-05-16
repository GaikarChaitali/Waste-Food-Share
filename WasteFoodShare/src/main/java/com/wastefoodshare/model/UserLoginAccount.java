package com.wastefoodshare.model;

public class UserLoginAccount {
	
	private String email;
	private String password;
	
	
	public UserLoginAccount() {
		
	}


	public UserLoginAccount(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserLoginAccount [email=" + email + ", password=" + password + "]";
	}
	

	
	
}