package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.VendorDao;
import com.example.model.UserBooking;
import com.example.model.Vendor;

@Repository
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	VendorDao venderDao;

	@Override
	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		venderDao.insertVendor(vendor);
		return vendor;
	}

	@Override
	public Vendor loginVendors(Vendor vendor) {
		// TODO Auto-generated method stub
		return venderDao.loginVendor(vendor);
	}

	@Override
	public List<UserBooking> showAllUserBookings(Vendor vendor) {
		// TODO Auto-generated method stub
		return venderDao.showAllUserBookings(vendor);
	}



}
