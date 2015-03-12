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
public interface ICheckOut_Controller {
     
    public boolean CreateConnection() ;

     public String bill(int room, int card,String CoutDate,Double extra,String extrainfo);
}
