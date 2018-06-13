package com.areuman.bbs;

import java.sql.Timestamp;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.areuman.bbs.dao.UserDAO;
import com.areuman.bbs.model.User;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")
public class UserDAOTest {
	
	Logger logger = LoggerFactory.getLogger(UserDAOTest.class);
	
	@Inject
	private UserDAO userDAO;

	@Test
	public void selectOneUserTest() {
		logger.info(userDAO.selectOneUser("abc").toString());
	}
	
	@Test
	public void insertUserTest() {
		User user = new User("abcdef", "areumareum","an","aa0070free@naver.com", "pass", new Timestamp(System.currentTimeMillis()));
		userDAO.insertUser(user);
	}

}
