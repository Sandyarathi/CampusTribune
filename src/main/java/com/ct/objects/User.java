package com.ct.objects;

public class User {
	private int user_id;
	private String firstName;
	private String lastName;
	private String university;
	private String emailId;
	private boolean isActive;
	private boolean isReported;
	private String user_imageUrl;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean getIsReported() {
		return isReported;
	}
	public void setIsReported(boolean isReported) {
		this.isReported = isReported;
	}
	public String getUser_imageUrl() {
		return user_imageUrl;
	}
	public void setUser_imageUrl(String user_imageUrl) {
		this.user_imageUrl = user_imageUrl;
	}
	

}
