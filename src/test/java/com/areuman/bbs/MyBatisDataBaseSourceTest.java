package com.areuman.bbs;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")
public class MyBatisDataBaseSourceTest {
	@Inject
	private DataSource dataSource;
	
	@Test
	public void testConnection() throws Exception {
		try(Connection conn = dataSource.getConnection()) {
			System.out.println(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
