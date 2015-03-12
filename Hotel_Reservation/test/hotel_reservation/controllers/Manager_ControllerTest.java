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
public class Manager_ControllerTest {
    FakeManager_Controller instance;
    public Manager_ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new FakeManager_Controller();
    }
    
    @After
    public void tearDown() {
         instance = null;
    }

    /**
     * Test of CreateConnection method, of class Manager_Controller.
     */
    @Test
    public void testCreateConnection() {
        System.out.println("CreateConnection");
        
        boolean expResult = true;
        boolean result = instance.CreateConnection();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addEmp method, of class Manager_Controller.
     */
    @Test
    public void testAddEmp() {
        System.out.println("addEmp");
        String uname = "Gabriel";
        String pword = "8765";
        instance.addEmp(uname, pword);
        assertEquals("Gabriel",instance.getuname());
         assertEquals("8765",instance.getpword());
    }

    /**
     * Test of DescriptionUpdate method, of class Manager_Controller.
     */
    @Test
    public void testDescriptionUpdate() {
        System.out.println("DescriptionUpdate");
        String s = "Damaged bed";
        instance.DescriptionUpdate(s);
        assertEquals("Damaged bed",instance.getDescriptionUpdate());
        
    }

    /**
     * Test of addRoom method, of class Manager_Controller.
     */
    @Test
    public void testAddRoom() {
         System.out.println("Addroom");
        int Room = 100;
        String item = "Single";
        instance.addRoom(Room, item);
         assertEquals("Single",instance.getItem());
        
    }

    /**
     * Test of AddroomType method, of class Manager_Controller.
     */
    @Test
    public void testAddroomType() {
        System.out.println("AddroomType");
        String RoomType = "Presidential Suite";
        double RoomRate = 1000.00;
        String description = "Honoured Guests Only";
        
        instance.AddroomType(RoomType, RoomRate, description);
        double expected =1000.00;
        assertEquals("Presidential Suite",instance.getRoomType());
       assertTrue(expected==instance.getRoomRate());
        assertEquals("Honoured Guests Only",instance.getDescription());
    }

   
    @Test
    public void testRoomcheck() {
        System.out.println("roomcheck");
        int r = 500;
   
        int expResult = 1;
        int result = instance.roomcheck(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of roomcheckUpdate method, of class Manager_Controller.
     */
    @Test
    public void testRoomcheckUpdate() {
        System.out.println("roomcheckUpdate");
        int r = 110;
        int expResult = 1;
        int result = instance.roomcheckUpdate(r);
        assertEquals(expResult, result);
      
    }
    
}
