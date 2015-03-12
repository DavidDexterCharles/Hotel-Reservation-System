/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel_reservation.controllers;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class CheckIn_ControllerTest {
   
    private Fake_CheckIn_Controller instance;
   
    public CheckIn_ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new Fake_CheckIn_Controller();
        
    }
    
    @After
    public void tearDown() {
        instance = null;
  
    }

    /**
     * Test of CreateConnection method, of class CheckIn_Controller.
     */
    @Test
    public void testCreateConnection() {
        boolean success;
        System.out.println("CreateConnection");
        success=instance.CreateConnection();
        assertEquals(true, success);
   
    }

    /**
     * Test of addClient method, of class CheckIn_Controller.
     */
    @Test
    public void testAddClient() {
        
        System.out.println("addClient");
        String FirstName = "David";
        String LastName = "Charles";
        String Contact = "639-1992";
        String Email = "david@hotmail.com";
        String Address = "Tobago";
        String CheckInDate ="0000-00-00 00:00:00";
        int RoomNumber = 300;
        String creditType = "Linx ";
        int creditNumber = 555;
        
        
       instance.addClient(FirstName, LastName, Contact, Email, Address, CheckInDate, RoomNumber, creditType, creditNumber);
     
     
         assertEquals("David",instance.getFirstName());
         assertEquals("Charles",instance.getLastName());
         assertEquals("639-1992",instance.getContact());
         assertEquals("david@hotmail.com",instance.getEmail());
         assertEquals("Tobago",instance.getAddress());
     
         assertEquals(CheckInDate,instance.getCheckInDate());
  
         assertEquals(300,instance.getRoomNumber());
         assertEquals("Linx ",instance.getcreditType());
         assertEquals(555,instance.getcreditNumber());

       
    }

    /**
     * Test of ListAvailableRooms method, of class CheckIn_Controller.
     */
    @Test
    public void testListAvailableRooms() {
        System.out.println("ListAvailableRooms");
        //CheckIn_Controller instance = new CheckIn_Controller();
        String expResult ="Room Number	       Room Type	         Room Rate\n\n 111	 	           Single	      $175\n333	 Single	 $175\n344	 	           Single	                     $175\n555	 	           Single	                     $175\n200	 	           Double	                     $300\n400	 Double	  $300\n424	 	           Double	                     $300\n700	 	           Double	                     $300";
        String result = instance.ListAvailableRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
