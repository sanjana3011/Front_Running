package com.pojo;

import java.util.ArrayList;
import java.util.List;

import com.businessLogic.Order;


public class Client {

	private String clientName,clientId,clientPassword,clientDematAccountNumber;
	private List<Order> ordersOfClient;
	
	public Client(){
		clientName = "";
		clientId = "";
		clientPassword = "";
		clientDematAccountNumber = "";
		ordersOfClient = new ArrayList<Order>();
	}

	public Client(String clientName, String clientId, String clientPassword, String dematAccountNumber) {
		super();
		this.clientName = clientName;
		this.clientId = clientId;
		this.clientPassword = clientPassword;
		this.clientDematAccountNumber = dematAccountNumber;
	}

	public Client(String clientName, String clientId, String clientPassword, String dematAccountNumber,
			List<Order> ordersOfClient) {
		super();
		this.clientName = clientName;
		this.clientId = clientId;
		this.clientPassword = clientPassword;
		this.clientDematAccountNumber = dematAccountNumber;
		this.ordersOfClient = ordersOfClient;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientPassword() {
		return clientPassword;
	}

	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}

	public String getDematAccountNumber() {
		return clientDematAccountNumber;
	}

	public void setDematAccountNumber(String dematAccountNumber) {
		this.clientDematAccountNumber = dematAccountNumber;
	}

	public List<Order> getOrdersOfClient() {
		return ordersOfClient;
	}

	public void setOrdersOfClient(List<Order> ordersOfClient) {
		this.ordersOfClient = ordersOfClient;
	}
	
}
