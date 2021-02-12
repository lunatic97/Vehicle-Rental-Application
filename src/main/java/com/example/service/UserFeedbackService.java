package com.example.service;

import com.example.model.Feedback;
import com.example.model.User;

public interface UserFeedbackService {
	
	Feedback addFeedback(Feedback feedBack,User user);

}
