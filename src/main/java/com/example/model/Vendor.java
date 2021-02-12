package com.example.model;

public class Vendor {
	
	private String vendorName;
	private String emailId;
	private String passWord;
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(String vendorName, String emailId, String passWord) {
		super();
		this.vendorName = vendorName;
		this.emailId = emailId;
		this.passWord = passWord;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
	


