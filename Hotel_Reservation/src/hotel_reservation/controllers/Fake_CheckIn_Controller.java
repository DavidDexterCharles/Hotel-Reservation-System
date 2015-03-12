/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel_reservation.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Fake_CheckIn_Controller implements ICheckIn_Controller{
    private Connection con;
    private  Statement st;
    private ResultSet rs;
    private String FirstName;
    private String LastName;
    private String Contact;
    private  String Email;
    private String Address;
    private String CheckInDate; 
    private int RoomNumber;
    private String creditType;
   private int creditNumber;
    
    @Override
    public boolean CreateConnection() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            st = con.createStatement();
            return true;
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex);
              JOptionPane.showMessageDialog(null,"Error occured in database connection");
            return false;
        }
    }

    @Override
    public void addClient(String FirstName, String LastName, String Contact, String Email, String Address, String CheckInDate, int RoomNumber, String creditType, int creditNumber) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Contact = Contact;
        this.Email = Email;
        this.Address = Address;
        this.CheckInDate =CheckInDate;
        this.RoomNumber = RoomNumber;
        this.creditType = creditType;
        this.creditNumber = creditNumber;
    }

    @Override
    public String ListAvailableRooms() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Room Number	       Room Type	         Room Rate\n\n 111	 	           Single	      $175\n333	 Single	 $175\n344	 	           Single	                     $175\n555	 	           Single	                     $175\n200	 	           Double	                     $300\n400	 Double	  $300\n424	 	           Double	                     $300\n700	 	           Double	                     $300";
    }
    public String getFirstName()
    {
        return FirstName;
    }
       
      
      public String getLastName()
      {
        return LastName;
      }
      public String getContact()
      {
        return Contact;
      }
      public String getEmail()
      {
         return Email;
      }
      public String getAddress()
      {
        return Address;
      }
      public String getCheckInDate()
      {
         return CheckInDate;
      }
    
      public int getRoomNumber()
      {
          return RoomNumber;
      }
      public String getcreditType()
      {
         return creditType;
      }
       public int getcreditNumber()
      {
          return creditNumber;
      }
     
}
