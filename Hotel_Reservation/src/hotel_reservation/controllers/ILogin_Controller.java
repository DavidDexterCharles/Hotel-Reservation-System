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
public interface ILogin_Controller {
    
    public boolean CreateConnection();
    public  int getEmployee(String uname,String pword);
    
}
