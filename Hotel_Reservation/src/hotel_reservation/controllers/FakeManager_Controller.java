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
public class FakeManager_Controller implements IManager_Controller{
      private Connection con;
    private  Statement st;
    private ResultSet rs;
    private String uname;
    private String pword;
    private int Room;
    private String item;
    private String RoomType;
    private double RoomRate;
    private String description;
    private String s;
    
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
         this.uname=uname;
         this.pword=pword;
        
    }
    public String getuname()
    {
        return uname;
    }
    public String getpword()
    {
        return pword;
    }
    public int getRoom()
    {
        return Room;
    }
    public String getItem()
    {
        return item;
    }
    
    public void addRoom(int Room,String item)
    {
        this.Room=Room;
         this.item=item;
        
    }
    
    public void AddroomType(String RoomType,double RoomRate,String description)
    {
        this.RoomType=RoomType;
        this.RoomRate=RoomRate;
        this.description=description;
        
    }
    public String getRoomType()
    {
        return RoomType;
    }
    public double getRoomRate()
    {
        return RoomRate;
    }
    public String getDescription()
    {
        return description;
    }

    
    public int roomcheck(int r){
     
       
     return 1;
    }
    public int roomcheckUpdate(int r){
     
       
     return 1;
    
    }
    public void DescriptionUpdate(String s)
    {
        this.s = s;
    }
    public String getDescriptionUpdate(){
     
       
     return s;
    }
 
}
