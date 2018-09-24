/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Order;
import java.util.List;

/**
 *
 * @author Grad57
 */
public interface OrderDAO {
    
    public List<Order[]> detectingFrontRunning(List <Order> orderBook);
    
}
