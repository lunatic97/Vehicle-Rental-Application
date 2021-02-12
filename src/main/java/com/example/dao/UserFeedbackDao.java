package com.example.dao;

import com.example.model.Feedback;
import com.example.model.User;

public interface UserFeedbackDao {
	
	Feedback insertUser(Feedback feedBack,User user);

}
