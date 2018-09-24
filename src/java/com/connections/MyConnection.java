package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static Connection con;
	
	static public Connection openConnection()
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //Registration process
			System.out.println("driver loaded successfully");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI", "sa","sa123");
			
			System.out.println("connection successfully done");
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	static public void  closeConnection()
	{
		try {
			con.close();
			System.out.println("connnection closed successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
