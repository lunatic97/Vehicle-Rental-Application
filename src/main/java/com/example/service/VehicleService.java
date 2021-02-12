package com.example.service;

import java.util.List;

import com.example.model.Vehicle;
import com.example.model.Vendor;

public interface VehicleService {
	
	Vehicle addVehicle(Vehicle vehicle);
	List<Vehicle> getAllVehicles(Vendor vendor);
	void deleteVehicle(String vehicleName);
	void updation(Vehicle vehicle);
	List<Vehicle> getVehicleByName(String vehicleName);

}
