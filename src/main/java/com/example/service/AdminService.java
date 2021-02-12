package com.example.service;

import java.util.List;

import com.example.model.Admin;
import com.example.model.Feedback;
import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;
import com.example.model.Vendor;

public interface AdminService {
	
	Admin addAdmin(Admin admin);
	List<User> showAllUsers(User user);
	List<Vendor> showAllVendors(Vendor vendor);
	Admin loginAdmins(Admin admin);
	void deleteVendor(String vendorName);
	List<Vehicle> showAllVehicles(Vehicle vehicle);
	void deleteVehicle(String vehicleName);
	List<UserBooking> showAllUserBookings(UserBooking userBooking);
	List<Feedback> showAllUserFeedbacks(Feedback feedBack);
	void updateVendor(Vendor vendor);
	List<Vendor> getVendorByName(String vendorName);

}
