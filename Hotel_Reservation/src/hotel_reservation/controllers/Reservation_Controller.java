/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel_reservation.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Reservation_Controller implements IReservation_Controller{
     private Connection con; 
    private  Statement st;
    private ResultSet rs;
    PreparedStatement pst = null;
     
     
    
    public Reservation_Controller(){ 
        CreateConnection();
    }
   public boolean CreateConnection() {
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
     public int roomcheck(int r){
     
       
     try
        {
            String query = "SELECT r.RoomNumber From room r, guest g\n" +
                            "Where g.roomNumber = '"+r+"' AND CheckOutDate = '0000-00-00 00:00:00'";
            rs = st.executeQuery(query);
            while(rs.next())
            {
                int v=rs.getInt("RoomNumber");
               if( v==r)return v;
            }
            
             query = "SELECT RoomNumber From room r\n" +
                        "Where roomNumber = '"+r+"'";
            rs = st.executeQuery(query);
            while(rs.next())
            {
               if( rs.getInt("RoomNumber")==r)return 1;
            }
           
            
        }
      catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return -1;
    }

    /**
     *
     * @param c
     * @param r
     * @return
     */
    public int CardCheck(int c,int r){
     
       
     try
        {
            String query = "SELECT CreditCardNumber From guest g Where g.CreditCardNumber ='"+c+"'AND g.roomNumber = '"+r+"'AND CheckOutDate = '0000-00-00 00:00:00'";
          
            
            rs = st.executeQuery(query);
            while(rs.next())
            {
                int v=rs.getInt("CreditCardNumber");
               if( v==c)return v;
            }
            
            /* query = "SELECT RoomNumber From room r\n" +
                        "Where roomNumber = '"+c+"'";
            rs = st.executeQuery(query);
            while(rs.next())
            {
               if( rs.getInt("RoomNumber")==r)return 1;
            }*/
            
        }
      catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
     return -1;
        
    }
    
    
   
    
}
