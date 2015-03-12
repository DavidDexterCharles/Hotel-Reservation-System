/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel_reservation.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class CheckOut_Controller
{
    private Connection con;
    private  Statement st;
    private ResultSet rs;
    //PreparedStatement pst = null;
    
   public CheckOut_Controller(){
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

    
    
     public String bill(int room, int card,String CoutDate,Double extra,String extrainfo){
       
        try
        {
            String s=" ";
            String query;
            query = "Update guest\n" +
"Set Extras = '"+extra+"'\n" +
"Where RoomNumber = '"+room+"' AND CheckOutDate = '0000-00-00 00:00:00'"; 
            st.executeUpdate(query);
            query = "Update guest\n" +
"Set ExtrasInfo = '"+extrainfo+"'\n" +
"Where RoomNumber = '"+room+"' AND CheckOutDate = '0000-00-00 00:00:00'"; 
            st.executeUpdate(query);

              query = "Update guest\n" +
"Set CheckOutDate = '"+CoutDate+"'\n" +
"Where RoomNumber = '"+room+"'AND CreditCardNumber = '"+card+"'"; 
            st.executeUpdate(query);      
             query = "UPDATE guest g SET BillingInfo = ( SELECT (\n" +
"DATEDIFF( DATE( `CheckOutDate` ) , DATE( `CheckInDate` ) ) * rt.RoomRate )\n" +
"FROM room r, roomtype rt\n" +
"WHERE g.roomNumber = r.RoomNumber\n" +
"AND rt.TypeID = r.TypeID\n" +
") + Extras; ";
             st.executeUpdate(query);
           /* while(rs.next())
            {
                int v=rs.getInt("CreditCardNumber");
              // if( v==c)return v;
            }
        }*/
   
           String query2 = "Select FirstName, LastName, RoomNumber, CreditCardType, CreditCardNumber,BillingInfo \n" +
"From guest g \n" +
"Where CheckOutDate = '"+CoutDate+"'" +
"AND roomNumber = '"+room+"'" +
"AND CreditCardNumber = '"+card+"'";
           
            rs = st.executeQuery(query2);
            while(rs.next())
            {
               s = s + "Name: "+rs.getString("FirstName")+"\t"+rs.getString("LastName") +"\n"+"Room Number: "+rs.getString("RoomNumber")+"\n"+"Card Type: "+rs.getString("CreditCardType")+"\n"+"Card Number:  "+rs.getString("CreditCardNumber")+"\n"+"Total Cost: $ "+rs.getString("BillingInfo");
            }
            System.out.println(s); 
            return s;
            
        }
            catch(Exception ex)
            {
                     System.out.println(ex);  
                    }
        //return s;
        return null;
    }
    
}
    

