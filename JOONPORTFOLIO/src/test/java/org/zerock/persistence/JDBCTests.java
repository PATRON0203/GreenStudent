package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCTests {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	static {	// 초기화 블럭
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testConnection() {
		try (
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joonportfolio?serverTimezone=Asia/Seoul","root","1234")){
				logger.info("연결실패="+con);
			}		
		catch(Exception e) {
			fail(e.getMessage());
		}
	}
}