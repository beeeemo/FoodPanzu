/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Reservation;
import java.util.List;

/**
 *
 * @author User
 */
public interface DReservation {
    public void insertReservation(Reservation r);
    public List<Reservation> getAllReservation();
    
}
