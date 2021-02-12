package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.User;
import com.example.model.Vehicle;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("inside User insertion DAO" + user.getUserName());
		 String sqlQuery = "insert into user (Username,Password)" +
		                   "values (?,?)";
		 jdbcTemplate.update(sqlQuery,
				 user.getUserName(), user.getPassWord()
		);
		 
		 return user;
	}

	@Override
	public List<Vehicle> getAllAvailableVehicles(Vehicle vehicle) {
		String sql = "select * from vehicle where vehicle_status ='Available'";
		List<Vehicle> vehicles = jdbcTemplate.query(sql, new VehicleAvailabeMapper());
		return vehicles;
	}

	@Override
	public User loginUser(User user) {
		String sql = "select * from user where Username='" + user.getUserName() + "'and Password='" + user.getPassWord() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		//System.out.println(users.get(0));
		return users.size()>0?users.get(0):null;
	}
	
	
	

}

	class UserMapper implements RowMapper<User>
	{
		public User mapRow(ResultSet rs,int arg1) throws SQLException{
			User user = new User();
			user.setUserName(rs.getString("UserName"));
			user.setPassWord(rs.getString("PassWord"));
			return user;
			
		}
	}
	
	class VehicleAvailabeMapper implements RowMapper<Vehicle>
	{
		public Vehicle mapRow(ResultSet rs,int arg1) throws SQLException{
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleName(rs.getString("vehicle_name"));
			//vehicle.setVehicleStatus(rs.getString("vehicle_status"));
			vehicle.setVendorName(rs.getString("vendor_name"));
			vehicle.setVehiclePrice(rs.getString("vehicle_price"));
			return vehicle;
			
		}
	}
