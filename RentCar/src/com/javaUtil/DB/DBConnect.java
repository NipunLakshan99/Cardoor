package com.javaUtil.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/car";
	private static String username = "root";
	private static String password = "2226";
	private static Connection con;
	
	public static Connection getConnection( ) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			System.out.println("Database connection is not Work!!!");
		}
		
		return con;
	}
}
