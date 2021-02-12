package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.model.Vehicle;

@Repository
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
		return user;
	}

	@Override
	public List<Vehicle> getAllAvailableVehicles(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return userDao.getAllAvailableVehicles(vehicle);
	}

	@Override
	public User loginUsers(User user) {
		// TODO Auto-generated method stub
		return userDao.loginUser(user);
	}

	

	

	

}
