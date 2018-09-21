package com.dao;

import com.beans.RegistrationTable;

public interface RegistrationTableDao {

		int addUser(RegistrationTable register);
		boolean updateUser(int UserId, String newpassword);
		
	}
