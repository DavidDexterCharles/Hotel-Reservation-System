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
public class CheckIn_Controller implements ICheckIn_Controller{
    private Connection con;
    private  Statement st;
    private ResultSet rs;
    //PreparedStatement pst = null;
     
   
     
    public CheckIn_Controller(){
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
    @SuppressWarnings("empty-statement")
     /* public String getFirstName()
      {
          
           String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select FirstName from guest";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("FirstName");
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      
    }
      
      public String getLastName()
      {
         String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select LastName from guest";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("LastName");
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      }
      public String getContact()
      {
         String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select Contact from guest";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("Contact");
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      }
      public String getEmail()
      {
          String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select Email from guest";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("Email");
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      }
      public String getAddress()
      {
         String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select Address from guest";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("Address");
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      }
      public String getCheckInDate()
      {
          String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select CheckInDate from guest";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("CheckInDate");
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      }
      /*
      public String getRoomNumber()
      {
          String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select RoomNumber from guest";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("RoomNumber");
                        //if(s.equals("300")) return "300";
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      }
      public String getcreditType()
      {
          String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select CreditCardType from guest" ;
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("CreditCardType");
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      }
       public String getcreditNumber()
      {
          String query;
           String s="" ;
        try
        {
          // query = "Select FirstName from guest  where FirstName = '"FirstName"'";
            query ="Select CreditCardNumber from guest";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			s =rs.getString("CreditCardNumber");
	    }
            return s;

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
      }
     */
     
     public  void addClient(String FirstName,String LastName, String Contact,String Email,String Address,String CheckInDate,int RoomNumber,String creditType,int creditNumber) {
        System.out.println("Let us see78");
        
        try
        {
            
           // String query = "insert into clients values(ReservationID,name,address,phone,email,roomtype,roomnumber,checkindate,other) ";
          //  String query = "INSERT INTO cllients(ReservationID,Name,Address,Phone,E-mail,RoomType,RoomNumber,CheckInDate,CheckOutDate,other)"+"VALUES('"+ReservationID+"','"+name+"','"+address+"','"+phone+"','"+email+"','"+roomtype+"','"+roomnumber+"','"+checkindate+"','"+other+"') ";
            //error //String query = "INSERT INTO `guest`(`FirstName`, `LastName`, `Contact`, `Email`, `Address`, `CheckInDate`,`CheckOutDate`,`BillingInfo`, `RoomNumber`) VALUES ('"+FirstName+"','"+LastName+"','"+Contact+"','"+Email+"','"+Address+"','"+CheckInDate+"'0000-00-00 00:00:00'"+"'0.00'"+RoomNumber+"') ";
             //if(CheckInDate.equals("0000-00-00 00:00:00"))return false;
            String  query = " INSERT INTO `guest`(`FirstName`, `LastName`, `Contact`, `Email`, `Address`, `CheckInDate`, `CheckOutDate`, `BillingInfo`, `RoomNumber`, `CreditCardType`, `CreditCardNumber`) VALUES ('"+FirstName+"','"+LastName+"','"+Contact+"','"+Email+"','"+Address+"','"+CheckInDate+"','"+"0000-00-00 00:00:00"+"','"+"0.00"+"','"+RoomNumber+"','"+creditType+"','"+creditNumber+"')";
             
             System.out.println("Query:" +query);   
                 
                    st.executeUpdate(query);
                     System.out.println(st+"Apples");
                         //return true;
         // System.out.println("Let us see");
            
        }
        catch(Exception ex)
        {
            //System.out.println("Let us see1000");
            System.out.println(ex+"Apples");
           //   return false;
            
        }
      
     // return false;
        
    }
    
    
     public String ListAvailableRooms(){
      String s="Room Number\t       Room Type\t         Room Rate\n\n";
        try
        {
            String query = "SELECT DISTINCT r.RoomNumber, rt.TypeName\n,rt.RoomRate\n" +
"From room r, roomtype rt, guest g\n" +
"Where r.roomNumber NOT IN (\n" +
"    \n" +
"    \n" +
"    SELECT r.RoomNumber\n" +
"From room r, guest g\n" +
"Where g.roomNumber = r.RoomNumber AND CheckOutDate = '0000-00-00 00:00:00'\n" +
"   	) AND rt.TypeID = r.TypeID;";
            rs = st.executeQuery(query);
          
            
	    while(rs.next())
            {

			 s = s + rs.getString("RoomNumber")+"\t \t           "+rs.getString("TypeName")+"\t                     $"+rs.getString("RoomRate")+"\n";
	    }

			
        }
        catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
       return s;
    }
}

