package com.example.model;

public class UserBooking {
	
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private String vehicleName;
	private String vendorName;
	private String vehiclePrice;
	public UserBooking(String vehicleName, String vendorName, String vehiclePrice) {
		super();
		this.vehicleName = vehicleName;
		this.vendorName = vendorName;
		this.vehiclePrice = vehiclePrice;
	}
	public UserBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(String vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	
	

}
