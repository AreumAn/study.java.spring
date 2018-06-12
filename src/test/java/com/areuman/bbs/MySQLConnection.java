package com.areuman.bbs;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnection {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/areum";
	private static final String USER = "areum";
	private static final String PWD = "areum";

	@Test
	public void testConn() throws Exception {
		Class.forName(DRIVER);

		// 1.7 이상 버전부터 try()가 지원 - ()안에다가 close필요했던것을 넣어주면 finally처리
		// 로 close했던것 안해도 됨
		try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) { 
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
