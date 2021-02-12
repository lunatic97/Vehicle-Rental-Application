package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.VehicleDao;
import com.example.model.Vehicle;
import com.example.model.Vendor;

@Repository
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleDao vehicleDao;

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleDao.insertVehicle(vehicle);
	}

	@Override
	public List<Vehicle> getAllVehicles(Vendor vendor) {
		// TODO Auto-generated method stub
		return vehicleDao.getAllVehicles(vendor);
	}

	@Override
	public void deleteVehicle(String vehicleName) {
		// TODO Auto-generated method stub
		vehicleDao.removeVehicle(vehicleName);
	}

	@Override
	public void updation(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
		vehicleDao.updateVehicle(vehicle);
			
		
	}

	@Override
	public List<Vehicle> getVehicleByName(String vehicleName) {
		// TODO Auto-generated method stub
		return vehicleDao.getVehicleByName(vehicleName);
	}
	
	

	

}
