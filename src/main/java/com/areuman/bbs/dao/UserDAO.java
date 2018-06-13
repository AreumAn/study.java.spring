package com.areuman.bbs.dao;

import org.springframework.stereotype.Repository;

import com.areuman.bbs.model.User;


public interface UserDAO {
	
	User selectOneUser(String userID);
	void insertUser(User user);
}
