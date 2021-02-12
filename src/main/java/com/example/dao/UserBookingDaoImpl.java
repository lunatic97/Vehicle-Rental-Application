package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;

@Repository
public class UserBookingDaoImpl implements UserBookingDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void insertBookingDetails(Vehicle vehicle,User user)
	{
		
		//List vehicles= userDao.getAllAvailableVehicles(vehicle);
		System.out.println("inside UserBooking insertion DAO" + vehicle.getVendorName());
		 String sqlQuery = "insert into userbooking (user_name,vehicle_name, vendor_name, vehicle_price)" +
		                   "values (?,?,?,?)";
		 jdbcTemplate.update(sqlQuery,user.getUserName(),
				 vehicle.getVehicleName(),vehicle.getVendorName(), vehicle.getVehiclePrice()
		);
		 
		 //return vehicle;
		
	}
	
	@Override
	public List<UserBooking> getAllAvailableVehicles(User user) {
		String sql = "select * from userbooking where user_name ='"+user.getUserName()+"'";
		List<UserBooking> vehiclenames = jdbcTemplate.query(sql, new VehicleAvailableMapper());
		return vehiclenames;
	}

}

class VehicleAvailableMapper implements RowMapper<UserBooking>
{
	public UserBooking mapRow(ResultSet rs,int arg1) throws SQLException{
		UserBooking userBooking = new UserBooking();
		userBooking.setVehicleName(rs.getString("vehicle_name"));
		return userBooking;
		
	}
}
