package com.example.service;

import java.util.List;

import com.example.model.User;
import com.example.model.Vehicle;

public interface UserService  {
	
	User addUser(User user);
	List<Vehicle> getAllAvailableVehicles(Vehicle vehicle);
	User loginUsers(User user);
	

}
