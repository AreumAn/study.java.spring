package com.areuman.bbs.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.areuman.bbs.dao.UserDAO;
import com.areuman.bbs.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	UserDAO userDAO;

	@Override
	public User selectOneUser(String userID) {
		return userDAO.selectOneUser(userID);
	}

	@Override
	public void insertUser(User user) {
		userDAO.insertUser(user);

	}

}
