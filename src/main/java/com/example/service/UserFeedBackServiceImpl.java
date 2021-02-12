package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.UserFeedbackDao;
import com.example.model.Feedback;
import com.example.model.User;

@Repository
public class UserFeedBackServiceImpl implements UserFeedbackService {
	
	@Autowired
	UserFeedbackDao userFeedbackDao;

	@Override
	public Feedback addFeedback(Feedback feedBack,User user) {
		// TODO Auto-generated method stub
		return userFeedbackDao.insertUser(feedBack,user);
	}
	
	

}
