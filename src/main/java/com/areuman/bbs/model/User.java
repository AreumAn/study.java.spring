package com.areuman.bbs.model;

import java.sql.Timestamp;

public class User {
	String userID; 
	String firstName; 
	String lastName; 
	String userEmail; 
	String userPW; 
	Timestamp createDate;
	
	public User() {
		super();
	}
	
	public User(String userID, String firstName, String lastName, String userEmail, String userPW,
			Timestamp createDate) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmail = userEmail;
		this.userPW = userPW;
		this.createDate = createDate;
	}
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", userEmail="
				+ userEmail + ", userPW=" + userPW + ", createDate=" + createDate + "]";
	}
	
	
	
	

}
