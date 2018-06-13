package com.areuman.bbs.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.areuman.bbs.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	@Inject
	SqlSession sqlSession;
	
	@Override
	public User selectOneUser(String userID) {
		//sqlSession.selectOne(statement, parameter);
//		User user = sqlSession.selectOne("selectOneUser", userID);
//		return user;
		return sqlSession.selectOne("selectOneUser", userID);
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		sqlSession.insert("insertUser", user);

	}

}
