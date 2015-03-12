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
public interface IManager_Controller {
    
    
    public boolean CreateConnection();
    public void addEmp(String uname,String pword);
    
    public void DescriptionUpdate(String s);
    public void addRoom(int Room,String item);
    
    public void AddroomType(String RoomType,double RoomRate,String description);

    public int roomcheck(int r);
      
    public int roomcheckUpdate(int r);
}
