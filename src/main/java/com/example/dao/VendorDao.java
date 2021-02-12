package com.example.dao;

import java.util.List;

import com.example.model.UserBooking;
import com.example.model.Vendor;

public interface VendorDao {
	
	Vendor insertVendor(Vendor vendor);
	List<UserBooking> showAllUserBookings(Vendor vendor);
	Vendor loginVendor(Vendor vendor);

}
