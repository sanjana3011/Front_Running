package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.beans.RegistrationTable;
import com.connections.MyConnection;
import com.dao.RegistrationTableDao;

public class RegistrationTableDaoImpl implements RegistrationTableDao {

	@Override
	public int addUser(RegistrationTable register) {
		int usersAdded=0;
		String ADDUSER="Insert into RegistrationTable values(?,?,?,?)";
		
		Connection con=MyConnection.openConnection();
		
		try {
			PreparedStatement ps=con.prepareStatement(ADDUSER);
			ps.setInt(1, register.getUserId());
			ps.setString(2,register.getFullName());
			ps.setString(3,register.getEmailId());
			ps.setString(4,register.getPassword());
	
			
			usersAdded=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usersAdded;
		
	}

	@Override
	public boolean updateUser(int UserId, String newpassword) {
		// TODO Auto-generated method stub
		return false;
	}


}
