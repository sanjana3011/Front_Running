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
    private String buySell;
    private double sharePrice;
    private double shareQuantity;
    private double totalPrice;
    private String traderId;
    private boolean tradePlaced;
    private Date timeStamp;
    private String scenario;

    public Order() {
        super();
    }

    public Order(String customerId, String buySell, double sharePrice, double shareQuantity, double totalPrice, String traderId, boolean tradePlaced, Date timeStamp, String scenario) {
        this.customerId = customerId;
        this.buySell = buySell;
        this.sharePrice = sharePrice;
        this.shareQuantity = shareQuantity;
        this.totalPrice = totalPrice;
        this.traderId = traderId;
        this.tradePlaced = tradePlaced;
        this.timeStamp = timeStamp;
        this.scenario = scenario;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

}
