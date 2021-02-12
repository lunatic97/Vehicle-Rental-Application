package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.UserBookingDao;
import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;

@Repository
public class UserBookingServiceImpl implements UserBookingService {
	
	@Autowired
	UserBookingDao userBookigDao;

	@Override
	public void addBookingDetails(Vehicle vehicle, User user) {
		// TODO Auto-generated method stub
		userBookigDao.insertBookingDetails(vehicle, user);
		
	}

	@Override
	public List<UserBooking> getAllAvailableVehicles(User user) {
		// TODO Auto-generated method stub
		return userBookigDao.getAllAvailableVehicles(user);
	}

}
