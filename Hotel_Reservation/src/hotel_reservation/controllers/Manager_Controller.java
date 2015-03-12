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

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Manager_Controller implements IManager_Controller{
    
    private Connection con;
    private  Statement st;
    private ResultSet rs;
    
    public Manager_Controller()
    {
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
    public void addEmp(String uname,String pword)
    {
         
        try 
        {
            String query = " INSERT INTO `employee`(`Username`, `Password`) VALUES ('"+uname+"','"+pword+"')";
            st.executeUpdate(query);
        } catch (Exception e) 
        {
            System.out.println(e);
        }
        
    }
    public void DescriptionUpdate(String s)
    {
        try 
        {
            String query = " update roomtype     set Description = '"+s+"' ";
            st.executeUpdate(query);
        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    public void addRoom(int Room,String item)
    {
        try {
            int name=0 ;    
                    String sql = "select rt.TypeID from roomtype rt  where TypeName ='"+item+"'  ";
                    ///st = con.prepareStatement(sql); 
                    rs = st.executeQuery(sql);
                   while(rs.next()){
                          name =Integer.parseInt(rs.getString("TypeID"));
                       
                    }
                     sql = " INSERT INTO `room`(`RoomNumber`, `TypeID`) VALUES ('"+Room+"','"+name+"')";
                    //st = conn.prepareStatement(sql); 
                    st.executeUpdate(sql);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
        
        
    }
    
    public void AddroomType(String RoomType,double RoomRate,String description)
    {
        try {
            String query;// = " INSERT INTO `room`(`RoomNumber`, `TypeID`) VALUES ('"+Room+"','"+TypeID+"')";
//            st.executeUpdate(query);
            query = " INSERT INTO `roomtype`(`TypeName`,`Description`,`RoomRate`) VALUES ('"+RoomType+"','"+description+"','"+RoomRate+"')";
            st.executeUpdate(query);
        } catch (Exception e) {
        }
        
        
    }
//    public int typeCheck(int typeID)
//    {
//        try
//        {
//            String query = "SELECT rt.TypeID From roomtype rt";
//                            
//            rs = st.executeQuery(query);
//            while(rs.next())
//            {
//                int v=rs.getInt("RoomNumber");
//               if( v==r)return v;
//            }
//            return -1;
//
//        }
//      catch(Exception ex)
//        {
//            System.out.println(ex);                                                                                                
//        }
//        return -1;
//    }
//    }
    
    public int roomcheck(int r){
     
       
     try
        {
            String query = "SELECT r.RoomNumber From room r";
                            
            rs = st.executeQuery(query);
            while(rs.next())
            {
                int v=rs.getInt("RoomNumber");
               if( v==r)return v;
            }
            return -1;
//             query = "SELECT RoomNumber From room r\n" +
//                        "Where roomNumber = '"+r+"'";
//            rs = st.executeQuery(query);
//            while(rs.next())
//            {
//               if( rs.getInt("RoomNumber")==r)return 1;
//            }
           
            
        }
      catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return -1;
    }
    public int roomcheckUpdate(int r){
     
       
     try
        {
            String query = "Select RoomNumber  FROM `guest` WHERE `RoomNumber`='"+r+"' AND CheckOutDate = '0000-00-00 00:00:00'";
                            
            rs = st.executeQuery(query);
            while(rs.next())
            {
                int v=rs.getInt("RoomNumber");
               if( v==r)return v;
            }
            return -1;

        }
      catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return -1;
    }
    
    
}
