package com.example.dao;

import java.util.List;

import com.example.model.User;
import com.example.model.Vehicle;

public interface UserDao {
	
	User insertUser(User user);
	List<Vehicle> getAllAvailableVehicles(Vehicle vehicle);
	User loginUser(User user);
	

}
