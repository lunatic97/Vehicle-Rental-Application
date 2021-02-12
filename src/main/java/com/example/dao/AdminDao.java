package com.example.dao;

import java.util.List;

import com.example.model.Admin;
import com.example.model.Feedback;
import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;
import com.example.model.Vendor;

public interface AdminDao {
	
	Admin insertAdmin(Admin admin);
	List<User> showAllUsers(User user);
	List<Vendor> showAllVendors(Vendor vendor);
	Admin loginAdmin(Admin admin);
	int removeVendor(String vendorName);
	List<Vehicle> showAllVehicles(Vehicle vehicle);
	int removeVehicle(String vehicleName);
	List<UserBooking> showAllUserBookings(UserBooking userBooking);
	List<Feedback> showAllUserFeedbacks(Feedback feedBack);
	int updateVendor(Vendor vendor);
	List<Vendor> getVendorByName(String vendorName);

}
