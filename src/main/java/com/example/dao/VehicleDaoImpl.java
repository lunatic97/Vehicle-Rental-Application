package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Vehicle;
import com.example.model.Vendor;

@Repository
public class VehicleDaoImpl implements VehicleDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	UserDao userDao;
	
	final String update = "update vehicle set vehicle_status = ?, vendor_name = ?, vehicle_price = ? where vehicle_name = ?";
	
	
	

	@Override
	public Vehicle insertVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		//System.out.println("gghjh");
		 String sqlQuery = "insert into vehicle (vehicle_name,vehicle_status,vendor_name,vehicle_price)" +
		                   "values (?,?,?,?)";
		 jdbcTemplate.update(sqlQuery,
				 vehicle.getVehicleName(),vehicle.getVehicleStatus(),vehicle.getVendorName(),vehicle.getVehiclePrice()				 
		);
		 
		 return vehicle;
	}

	@Override
	public List<Vehicle> getAllVehicles(Vendor vendor) {
		// TODO Auto-generated method stub
		String sqlQuery = "select * from vehicle where vendor_name ='" + vendor.getVendorName()+"'";
		List<Vehicle> vehicles = jdbcTemplate.query(sqlQuery, new VehicleMapper());
		return vehicles;
	}

	@Override
	public int removeVehicle(String vehicleName){    
	    String sql="delete from vehicle where vehicle_name='"+vehicleName+"'";    
	    return jdbcTemplate.update(sql);    
	}

	@Override
	public int updateVehicle(Vehicle vehicle) {
		 
		//System.out.println("pl"+vehicle.getVehicleStatus());
		 int status = jdbcTemplate.update(update,vehicle.getVehicleStatus(),vehicle.getVendorName(),vehicle.getVehiclePrice(),
				 vehicle.getVehicleName()
	            );
		 return status;
	}  
	
	@Override    
	public List<Vehicle> getVehicleByName(String vehicleName)
	{   
        String sql="select * from vehicle where vehicle_name='"+vehicleName+"'";   
        List<Vehicle> vehicles= jdbcTemplate.query(sql,   new RowMapper<Vehicle>()   
        {

        	public Vehicle mapRow(ResultSet rs,int arg1) throws SQLException
        	{
        		Vehicle vehicle = new Vehicle();
        		vehicle.setVehicleStatus(rs.getString("vehicle_status"));
        		vehicle.setVendorName(rs.getString("vendor_name"));
        		vehicle.setVehiclePrice(rs.getString("vehicle_price"));
        		vehicle.setVehicleName(rs.getString("vehicle_name"));
        		return vehicle;
        	}
        });
        return vehicles;
	}
}

class VehicleMapper implements RowMapper<Vehicle>
{
	public Vehicle mapRow(ResultSet rs,int arg1) throws SQLException{
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName(rs.getString("vehicle_name"));
		vehicle.setVehicleStatus(rs.getString("vehicle_status"));
		vehicle.setVendorName(rs.getString("vehicle_price"));
		return vehicle;
		
	}
}

