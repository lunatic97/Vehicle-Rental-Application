package com.example.dao;

import java.util.List;

import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;

public interface UserBookingDao {
	
	void insertBookingDetails(Vehicle vehicle,User user);
	List<UserBooking> getAllAvailableVehicles(User user);

}
