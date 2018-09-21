package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

			private static Connection con;
			
			static public Connection openConnection()
			{
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					System.out.println("DRIVER LOADED SUCCESSFULLY\n");
					con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI","sa","sa123");
					System.out.println("Connection Successful");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
			}
			
			static public void closeConnection() {
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
	
