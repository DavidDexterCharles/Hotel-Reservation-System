/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel_reservation.controllers;



/**
 *
 * @author David
 */
public interface IReservation_Controller {
    
    public boolean CreateConnection(); 
        
     public int roomcheck(int r);

    /**
     *
     * @param c
     * @param r
     * @return
     */
    public int CardCheck(int c,int r);
    
}
