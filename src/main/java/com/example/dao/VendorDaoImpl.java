package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.UserBooking;
import com.example.model.Vendor;

@Repository
public class VendorDaoImpl implements VendorDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Vendor insertVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		System.out.println("inside Vendor insertion DAO" + vendor.getEmailId());
		 String sqlQuery = "insert into vendor (name,emailid,password)" +
		                   "values (?,?,?)";
		 jdbcTemplate.update(sqlQuery,
				 vendor.getVendorName(),vendor.getEmailId(),vendor.getPassWord()
		);
		 
		 return vendor;
	}
	
 
	@Override
	public Vendor loginVendor(Vendor vendor) {
		String sql = "select * from vendor where name='" + vendor.getVendorName() + "'and password='" + vendor.getPassWord() + "'";
		List<Vendor> vendors = jdbcTemplate.query(sql, new VendorMapper());
		return vendors.size()>0?vendors.get(0):null;
	}


	@Override
	public List<UserBooking> showAllUserBookings(Vendor vendor) {
		// TODO Auto-generated method stub
		String sqlQuery = "select * from userbooking where vendor_name ='" + vendor.getVendorName()+"'";
		List<UserBooking> bookings = jdbcTemplate.query(sqlQuery, new BookingmapperVendor());
		return bookings;
	}


	


}

	class VendorMapper implements RowMapper<Vendor>
	{
		public Vendor mapRow(ResultSet rs,int arg1) throws SQLException{
			Vendor vendor = new Vendor();
			vendor.setVendorName(rs.getString("name"));
			vendor.setPassWord(rs.getString("password"));
			return vendor;
			
		}
	}
	
	class BookingmapperVendor implements RowMapper<UserBooking>
	{
		public UserBooking mapRow(ResultSet rs,int arg1) throws SQLException{
			UserBooking userBooking = new UserBooking();
			userBooking.setUserName(rs.getString("user_name"));
			userBooking.setVehicleName(rs.getString("vehicle_name"));
			userBooking.setVehiclePrice(rs.getString("vehicle_price"));
			userBooking.setVendorName(rs.getString("vendor_name"));
			return userBooking;
			
		}
	}
	


