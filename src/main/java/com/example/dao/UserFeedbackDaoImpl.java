package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Feedback;
import com.example.model.User;

@Repository
public class UserFeedbackDaoImpl implements UserFeedbackDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Feedback insertUser(Feedback feedBack,User user) {
		// TODO Auto-generated method stub
		System.out.println("inside User insertion DAO" + feedBack.getVehicleName());
		 String sqlQuery = "insert into userfeedback (user_name,vehical_name,feedback)" +
		                   "values (?,?,?)";
		 jdbcTemplate.update(sqlQuery,user.getUserName(),
				 feedBack.getVehicleName(),feedBack.getUserFeedback()
		);
		 
		 return feedBack;
	}

}
