package com.dao;

import com.pojo.Client;

public interface ClientDAO {
	
	public boolean addNewClient(Client client);
	public boolean updateClientPassword(String clientId,String newPassword);
	
}
