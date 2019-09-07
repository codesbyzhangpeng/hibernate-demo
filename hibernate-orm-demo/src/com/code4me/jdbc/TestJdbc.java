package com.code4me.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String user = "hbstudent";
		String pass = "hbstudent";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// get connection to database
		try {
			
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Class.forName(driver);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("SUCCESS!!!");
			
			myConn.close();
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	
	}

}
