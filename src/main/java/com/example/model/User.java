package com.example.model;

public class User {
	
	private String UserName;
	private String PassWord;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String passWord) {
		super();
		UserName = userName;
		PassWord = passWord;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	@Override
	public String toString() {
		return "User [UserName=" + UserName + ", PassWord=" + PassWord + "]";
	}
	
	

}
