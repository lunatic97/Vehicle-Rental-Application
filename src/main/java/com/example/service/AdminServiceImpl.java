package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.AdminDao;
import com.example.model.Admin;
import com.example.model.Feedback;
import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;
import com.example.model.Vendor;

@Repository
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao admindao;

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		admindao.insertAdmin(admin);
		return admin;
	}

	@Override
	public Admin loginAdmins(Admin admin) {
		// TODO Auto-generated method stub
		return admindao.loginAdmin(admin);
	}

	@Override
	public List<Vendor> showAllVendors(Vendor vendor) {
		// TODO Auto-generated method stub
		return admindao.showAllVendors(vendor);
	}

	@Override
	public void deleteVendor(String vendorName) {
		// TODO Auto-generated method stub
		admindao.removeVendor(vendorName);
		
	}

	@Override
	public List<Vehicle> showAllVehicles(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return admindao.showAllVehicles(vehicle);
	}

	@Override
	public void deleteVehicle(String vehicleName) {
		// TODO Auto-generated method stub
		admindao.removeVehicle(vehicleName);
	}

	@Override
	public List<UserBooking> showAllUserBookings(UserBooking userBooking) {
		// TODO Auto-generated method stub
		return admindao.showAllUserBookings(userBooking);
	}

	@Override
	public List<Feedback> showAllUserFeedbacks(Feedback feedBack) {
		// TODO Auto-generated method stub
		return admindao.showAllUserFeedbacks(feedBack);
	}

	@Override
	public void updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		admindao.updateVendor(vendor);
	}

	@Override
	public List<Vendor> getVendorByName(String vendorName) {
		// TODO Auto-generated method stub
		return admindao.getVendorByName(vendorName);
	}

	@Override
	public List<User> showAllUsers(User user) {
		// TODO Auto-generated method stub
		return admindao.showAllUsers(user);
	}

}
