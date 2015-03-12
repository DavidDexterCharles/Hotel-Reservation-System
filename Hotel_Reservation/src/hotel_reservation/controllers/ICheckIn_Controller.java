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
public interface ICheckIn_Controller 
{

    
    public boolean CreateConnection();

    public  void addClient(String FirstName,String LastName, String Contact,String Email,String Address,String CheckInDate,int RoomNumber,String creditType,int creditNumber);
     
    public String ListAvailableRooms();



    
}
