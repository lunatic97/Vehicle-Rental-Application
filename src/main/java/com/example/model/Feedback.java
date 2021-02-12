package com.example.model;

public class Feedback {
	
	private String userName;
	private String vehicleName;
	private String userFeedback;
	public Feedback(String vehicleName, String userFeedback) {
		super();
		this.vehicleName = vehicleName;
		this.userFeedback = userFeedback;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getUserFeedback() {
		return userFeedback;
	}
	public void setUserFeedback(String userFeedback) {
		this.userFeedback = userFeedback;
	}
	@Override
	public String toString() {
		return "Feedback [vehicleName=" + vehicleName + ", userFeedback=" + userFeedback + "]";
	}
	
	
	

}
