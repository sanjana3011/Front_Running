/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.OrderDAO;
import com.pojo.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grad57
 */
public class OrderDAOImpl implements OrderDAO {

    public final double basePrice = 10000000;

    @Override
    public List<Order[]> detectingFrontRunning(List<Order> orderBook) {

        List<Order> orderList = new ArrayList<>();

        int totalOrders = orderList.size();

        List<Order[]> possibleFrontRunning = new ArrayList<>();

//        pattern.add(e)
        Order past, present, future;
        for (int i = 0; i < totalOrders - 2; i++) {
            past = orderList.get(i);
            present = orderList.get(i + 1);
            future = orderList.get(i + 2);
            String t1, t2, t3;

//         Here t1,t2,t3 are the trade IDS  
            t1 = past.getTraderId();
            t2 = present.getTraderId();
            t3 = future.getTraderId();

            String c1, c2, c3;
//             Here c1,c2,c3 are to know whether they are firm orders or cutomer orders
            c1 = past.getCustomerTrade();
            c2 = present.getCustomerTrade();
            c3 = future.getCustomerTrade();

            boolean b1, b2, b3;
//             Here b1,b2,b3 are to denote whether the trade has taken place or not
            b1 = past.isTradePlaced();
            b2 = present.isTradePlaced();
            b3 = future.isTradePlaced();

            if (c1.equals("F") && c2.equals("C") && c3.equals("F") && b1 && b2 && b3) {
                String bs1, bs2, bs3;
//                  Here bs1,bs2,bs3 say whether it is a buy or sell option
                bs1 = past.getBuySell();
                bs2 = present.getBuySell();
                bs3 = future.getBuySell();

                double tP1, tP2, tP3;
//                  Here tP2 is the total share price of the middle customer
                tP2 = present.getTotalPrice();
//                  Scenario 1     
                if (bs1.equals("B") && bs2.equals("B") && bs3.equals("S") && tP2 >= basePrice) {
                    Order[] tempBatch = new Order[3];

                    past.setScenario("1");
                    present.setScenario("1");
                    future.setScenario("1");
                    tempBatch[0] = past;
                    tempBatch[1] = present;
                    tempBatch[2] = future;

                    possibleFrontRunning.add(tempBatch);
                }

//                  Scenario 2
                if (c1.equals("S") && c2.equals("S") && b1 && b2 && tP2 >= basePrice) {
                    Order[] tempBatch = new Order[3];

                    past.setScenario("2");
                    present.setScenario("2");
                    future.setScenario("2");
                    tempBatch[0] = past;
                    tempBatch[1] = present;
                    tempBatch[2] = future;

                    possibleFrontRunning.add(tempBatch);
                }

            }

            if (c1.equals("F") && c2.equals("F") && c3.equals("C") && b1 && b2 && b3) {
                String bs1, bs2, bs3;
//                  Here bs1,bs2,bs3 say whether it is a buy or sell option
                bs1 = past.getBuySell();
                bs2 = present.getBuySell();
                bs3 = future.getBuySell();

                double tS1, tS2, tS3;
//                  Here tS1,tS2,tS3 is the total shares in all the trades

                tS1 = past.getTotalPrice();
                tS2 = present.getTotalPrice();
                tS3 = future.getTotalPrice();

                double tP1, tP2, tP3;
//                  Here tP2 is the total share price of the middle customer
                tP2 = present.getTotalPrice();

                if (bs1.equals("B") && bs2.equals("S") && bs3.equals("B") && (tS1 == tS2) && (tS2 == tS3) && tP2 >= basePrice) {
                    Order[] tempBatch = new Order[3];

                    past.setScenario("3");
                    present.setScenario("3");
                    future.setScenario("3");
                    tempBatch[0] = past;
                    tempBatch[1] = present;
                    tempBatch[2] = future;

                    possibleFrontRunning.add(tempBatch);
                }

            }

        }

        return possibleFrontRunning;

    }

}
