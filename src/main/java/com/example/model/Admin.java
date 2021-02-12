package com.example.model;

public class Admin {
	
	private String adminName;
	private String passWord;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String adminName, String passWord) {
		super();
		this.adminName = adminName;
		this.passWord = passWord;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", passWord=" + passWord + "]";
	}
	
	

}
