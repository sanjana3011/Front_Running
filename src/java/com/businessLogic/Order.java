/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.businessLogic;

/**
 *
 * @author Ashish
 */
import java.util.Date;

public class Order {

    private String customerId;
    private String shareName;
    private String shareId;
    private String buySell;
    private double sharePrice;
    private double shareQuantity;
    private double totalPrice;
    private String traderId;
    private boolean tradePlaced;
    private Date timeStamp;
    private String scenario;
    private String customerTrade;

    public Order() {
        super();
    }

    public Order(String customerId, String shareName, String shareId, String buySell, double sharePrice, double shareQuantity, double totalPrice, String traderId, boolean tradePlaced, Date timeStamp, String scenario, String customerTrade) {
        this.customerId = customerId;
        this.shareName = shareName;
        this.shareId = shareId;
        this.buySell = buySell;
        this.sharePrice = sharePrice;
        this.shareQuantity = shareQuantity;
        this.totalPrice = totalPrice;
        this.traderId = traderId;
        this.tradePlaced = tradePlaced;
        this.timeStamp = timeStamp;
        this.scenario = scenario;
        this.customerTrade = customerTrade;
    }

    

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getShareQuantity() {
        return shareQuantity;
    }

    public void setShareQuantity(double shareQuantity) {
        this.shareQuantity = shareQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTraderId() {
        return traderId;
    }

    public void setTraderId(String traderId) {
        this.traderId = traderId;
    }

    public boolean isTradePlaced() {
        return tradePlaced;
    }

    public void setTradePlaced(boolean tradePlaced) {
        this.tradePlaced = tradePlaced;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public String getCustomerTrade() {
        return customerTrade;
    }

    public void setCustomerTrade(String customerTrade) {
        this.customerTrade = customerTrade;
    }
    
    
    

}
