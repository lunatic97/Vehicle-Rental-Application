package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Admin;
import com.example.model.Feedback;
import com.example.model.User;
import com.example.model.UserBooking;
import com.example.model.Vehicle;
import com.example.model.Vendor;

@Repository
public class AdminDaoImpl implements AdminDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	final String updateVendor = "update vendor set emailid = ?, password = ? where name = ?";

	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		System.out.println("inside Admin insertion DAO" + admin.getAdminName());
		 String sqlQuery = "insert into admin (adminname,password)" +
		                   "values (?,?)";
		 jdbcTemplate.update(sqlQuery,
				 admin.getAdminName(), admin.getPassWord()
		);
		return admin;
	}

	@Override
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql = "select * from admin where adminname='" + admin.getAdminName() + "'and password='" + admin.getPassWord() + "'";
		List<Admin> admins = jdbcTemplate.query(sql, new AdminMapper());
		return admins.size()>0?admins.get(0):null;
	}

	@Override
	public List<Vendor> showAllVendors(Vendor vendor) {
		// TODO Auto-generated method stub
		String sql = "select * from vendor";
		List<Vendor> vendors = jdbcTemplate.query(sql, new AllVendorMapper());
		return vendors;
	}

	@Override
	public int removeVendor(String vendorName) {
		 String sql="delete from vendor where name='"+vendorName+"'";    
		    return jdbcTemplate.update(sql);
	}

	@Override
	public List<Vehicle> showAllVehicles(Vehicle vehicle) {
		// TODO Auto-generated method stub
		String sql = "select * from vehicle";
		List<Vehicle> vehicles = jdbcTemplate.query(sql, new AllVehicleMapper());
		return vehicles;
	}

	@Override
	public int removeVehicle(String vehicleName) {
		// TODO Auto-generated method stub
		String sql="delete from vehicle where vehicle_name='"+vehicleName+"'";    
	    return jdbcTemplate.update(sql);
	}

	@Override
	public List<UserBooking> showAllUserBookings(UserBooking userBooking) {
		// TODO Auto-generated method stub
		String sql = "select * from userbooking";
		List<UserBooking> bookings = jdbcTemplate.query(sql, new BookingMapper());
		return bookings;
	}

	@Override
	public List<Feedback> showAllUserFeedbacks(Feedback feedBack) {
		// TODO Auto-generated method stub
		String sql = "select * from userfeedback";
		List<Feedback> feedbacks = jdbcTemplate.query(sql, new FeedbackMapper());
		return feedbacks;
	}

	@Override
	public int updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		int status = jdbcTemplate.update(updateVendor,vendor.getEmailId(),vendor.getPassWord(),vendor.getVendorName()
	            );
		 return status;
	}

	@Override
	public List<Vendor> getVendorByName(String vendorName) {
		// TODO Auto-generated method stub
		String sql="select * from vendor where name='"+vendorName+"'";   
        List<Vendor> vendors= jdbcTemplate.query(sql,   new RowMapper<Vendor>()   
        {

        	public Vendor mapRow(ResultSet rs,int arg1) throws SQLException
        	{
        		Vendor vendor = new Vendor();
        		vendor.setEmailId(rs.getString("emailid"));
        		vendor.setPassWord(rs.getString("password"));
        		vendor.setVendorName(rs.getString("name"));
        		return vendor;
        	}
        });
        return vendors;
	}

	@Override
	public List<User> showAllUsers(User user) {
		// TODO Auto-generated method stub
		String sql = "select * from user";
		List<User> users = jdbcTemplate.query(sql, new AllUserMapper());
		return users;
	}
	

}

	class AdminMapper implements RowMapper<Admin>
	{
		public Admin mapRow(ResultSet rs,int arg1) throws SQLException{
			Admin admin = new Admin();
			admin.setAdminName(rs.getString("adminName"));
			admin.setPassWord(rs.getString("passWord"));
			return admin;
			
		}
	
	}
	
	class AllUserMapper implements RowMapper<User>
	{
		public User mapRow(ResultSet rs, int arg1) throws SQLException{
			User user = new User();
			user.setUserName(rs.getString("UserName"));
			user.setPassWord(rs.getString("Password"));
			return user;
		}
	}
	
	class AllVendorMapper implements RowMapper<Vendor>
	{
		public Vendor mapRow(ResultSet rs, int arg1) throws SQLException{
			Vendor vendor = new Vendor();
			vendor.setVendorName(rs.getString("name"));
			vendor.setEmailId(rs.getString("emailid"));
			vendor.setPassWord(rs.getString("password"));
			return vendor;
		}
	}
	
	class AllVehicleMapper implements RowMapper<Vehicle>
	{
		public Vehicle mapRow(ResultSet rs, int arg1) throws SQLException{
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleName(rs.getString("vehicle_name"));
			vehicle.setVehicleStatus(rs.getString("vehicle_status"));
			vehicle.setVehiclePrice(rs.getString("vehicle_price"));
			vehicle.setVendorName(rs.getString("vendor_name"));
			return vehicle;
		}
	}
	
	class BookingMapper implements RowMapper<UserBooking>
	{
		public UserBooking mapRow(ResultSet rs, int arg1) throws SQLException{
			UserBooking userBooking = new UserBooking();
			userBooking.setUserName(rs.getString("user_name"));
			userBooking.setVehicleName(rs.getString("vehicle_name"));
			userBooking.setVendorName(rs.getString("vendor_name"));
			userBooking.setVehiclePrice(rs.getString("vehicle_price"));
			return userBooking;
		}
	}
	
	class FeedbackMapper implements RowMapper<Feedback>
	{
		public Feedback mapRow(ResultSet rs, int arg1) throws SQLException{
			Feedback feedBack = new Feedback();
			feedBack.setUserName(rs.getString("user_name"));
			feedBack.setVehicleName(rs.getString("vehical_name"));
			feedBack.setUserFeedback(rs.getString("feedback"));
			return feedBack;
		}
	}


