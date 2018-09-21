package com.beans;

public class RegistrationTable {
	
	private int UserID;
	private String FullName;
	private String EmailId;
	private String Password;
	
	public RegistrationTable() {
		UserID=1;
		FullName="Aakash";
		EmailId="abc.gmail.com";
		Password="abc123567";
		
	}
	public RegistrationTable(int userId, String fullName, String emailId, String password) {
		super();
		UserID = userId;
		FullName = fullName;
		EmailId = emailId;
		Password = password;
		
	}
	public int getUserId() {
		return UserID;
	}
	public void setUserId(int userId) {
		UserID = userId;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	

}
