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

import com.areuman.bbs.dao.CategoryDAO;
import com.areuman.bbs.dao.UserDAO;
import com.areuman.bbs.model.User;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")
public class CategoryDAOTest {
	
	Logger logger = LoggerFactory.getLogger(CategoryDAOTest.class);
	
	@Inject
	private CategoryDAO categoryDAO;

	@Test
	public void selectCategoriesTest() {
		logger.info(categoryDAO.selectCategories().toString());
	}


}
