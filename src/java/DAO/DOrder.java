/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Menu;
import Model.Order;
import java.util.List;

/**
 *
 * @author User
 */
public interface DOrder {
    public void insertOrder(List<Order> o);
}
