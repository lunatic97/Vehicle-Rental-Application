package com.example.dao;

import java.util.List;

import com.example.model.Vehicle;
import com.example.model.Vendor;

public interface VehicleDao {
	
	Vehicle insertVehicle(Vehicle vehicle);
	List<Vehicle> getAllVehicles(Vendor vendor);
	int removeVehicle(String vehicleName);
	int updateVehicle(Vehicle vehicle);
	List<Vehicle> getVehicleByName(String vehicleName);

}
