package com.pojo;

import java.util.ArrayList;
import java.util.List;

import com.businessLogic.Order;

public class ProprietaryTraders {

	private String traderName,traderId,traderPassword,traderDematAccountNumber;
	private List<Order> ordersForFirm;
	
	public ProprietaryTraders() {
		traderName = "";
		traderId = "";
		traderPassword = "";
		traderDematAccountNumber="";
		ordersForFirm = new ArrayList<Order>();
	}

	public ProprietaryTraders(String traderName, String traderId, String traderPassword,
			String traderDematAccountNumber) {
		super();
		this.traderName = traderName;
		this.traderId = traderId;
		this.traderPassword = traderPassword;
		this.traderDematAccountNumber = traderDematAccountNumber;
	}

	public ProprietaryTraders(String traderName, String traderId, String traderPassword,
			String traderDematAccountNumber, List<Order> ordersForFirm) {
		super();
		this.traderName = traderName;
		this.traderId = traderId;
		this.traderPassword = traderPassword;
		this.traderDematAccountNumber = traderDematAccountNumber;
		this.ordersForFirm = ordersForFirm;
	}

	public String getTraderName() {
		return traderName;
	}

	public void setTraderName(String traderName) {
		this.traderName = traderName;
	}

	public String getTraderId() {
		return traderId;
	}

	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}

	public String getTraderPassword() {
		return traderPassword;
	}

	public void setTraderPassword(String traderPassword) {
		this.traderPassword = traderPassword;
	}

	public String getTraderDematAccountNumber() {
		return traderDematAccountNumber;
	}

	public void setTraderDematAccountNumber(String traderDematAccountNumber) {
		this.traderDematAccountNumber = traderDematAccountNumber;
	}

	public List<Order> getOrdersForFirm() {
		return ordersForFirm;
	}

	public void setOrdersForFirm(List<Order> ordersForFirm) {
		this.ordersForFirm = ordersForFirm;
	}
	
}
