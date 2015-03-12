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

    
public class Login_Controller implements ILogin_Controller
{
    private Connection con;
    private  Statement st;
    private ResultSet rs;
    public Login_Controller()
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
    public  int getEmployee(String uname,String pword)
    {
        System.out.println("It begins");
       
        try 
        {
     
            String query;
            query ="Select Username,Password from employee where Username='"+uname+"' and Password ='"+pword+"' ";
            
            rs = st.executeQuery(query);

            
          

            
            while(rs.next())
            {
         
               
                 if( rs.getString("Username").equals(uname))return 1;
            }
            
          
            

        } catch (Exception e) {
           
             System.out.println(e);
            return -1;
        }
       
        
        return -1;
    }
}
