package com.areuman.bbs.service;

import com.areuman.bbs.model.User;

public interface UserService {

	User selectOneUser(String userID);
	void insertUser(User user);
}
