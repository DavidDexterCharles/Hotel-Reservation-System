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
public class Fake_Reservation_Controller implements IReservation_Controller{
    private Connection con; 
    private  Statement st;
    private ResultSet rs;
    private int r;
    @Override
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

    @Override
    public int roomcheck(int r) {
        return 1;
    }

    @Override
    public int CardCheck(int c, int r) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return c;
    }
    
    
}
