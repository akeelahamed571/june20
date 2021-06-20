package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



import com.mysql.jdbc.Statement;



public class DBConnect {
	private  static String url="jdbc:mysql://localhost:3306/hotel";
	private static String password="akeel123@";
	private static String userName="root";
	private static Connection con;
	
	public static Connection connecting() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, userName, password);
			
			
			
		} catch (Exception e) {
		
			System.out.println("DB connection failed");
		}
		
		return con;
	    
		
		
	}
	
	
	
	
	
}
