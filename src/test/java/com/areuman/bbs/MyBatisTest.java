package com.areuman.bbs;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")
public class MyBatisTest {
	public static final String TAG ="MyBatisTest";
	
	Logger logger = LoggerFactory.getLogger(MyBatisTest.class);
	
	@Inject
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testSqlFactory() {
		logger.info(TAG, sqlSessionFactory);
		logger.info(sqlSessionFactory.toString());
	}
	
	@Test
	public void testConnection() throws Exception {
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			logger.info(sqlSession.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
