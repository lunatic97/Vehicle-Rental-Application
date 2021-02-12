package com.example.service;

import java.util.List;

import com.example.model.UserBooking;
import com.example.model.Vendor;

public interface VendorService {
	
	Vendor addVendor(Vendor vendor);
	List<UserBooking> showAllUserBookings(Vendor vendor);
	Vendor loginVendors(Vendor vendor);

}
