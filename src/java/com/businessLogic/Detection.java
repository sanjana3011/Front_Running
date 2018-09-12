/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.businessLogic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grad57
 */
public class Detection {

    public final static double basePrice = 10000000;

    public static void main(String[] args) {

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

            if (t1.equals(t2) && t2.equals(t3)) {

                String c1, c2, c3;
//             Here c1,c2,c3 are the customer Ids
                c1 = past.getCustomerId();
                c2 = present.getCustomerId();
                c3 = future.getCustomerId();

                boolean b1, b2, b3;
//             Here b1,b2,b3 are to denote whether the trade has taken place or not
                b1 = past.isTradePlaced();
                b2 = present.isTradePlaced();
                b3 = future.isTradePlaced();

                if (c1.equals(c3) && !(c1.equals(c2)) && b1 && b2 && b3) {
                    String bs1, bs2, bs3;
//                 Here bs1,bs2,bs3 say whether it is a buy or sell option
                    bs1 = past.getBuySell();
                    bs2 = present.getBuySell();
                    bs3 = future.getBuySell();

                    double tS2;
//                  Here tS2 is the total share price of the middle customer
                    tS2 = present.getTotalPrice();

                    if (bs1.equals(bs2) && !(bs2.equals(b3)) && tS2 >=basePrice)
                    {
                        Order[] tempBatch = new Order[3];
                        tempBatch[0] = past;
                        tempBatch[1] = present;
                        tempBatch[2] = future;
                        
                        possibleFrontRunning.add(tempBatch);
                    }
                }

            }

        }

    }

}
