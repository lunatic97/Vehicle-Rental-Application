package com.example.service;

import java.util.List;

import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;

public interface UserBookingService {
	
	void addBookingDetails(Vehicle vehicle,User user);
	List<UserBooking> getAllAvailableVehicles(User user);

}
