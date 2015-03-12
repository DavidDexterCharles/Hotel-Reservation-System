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
public class Reservation_ControllerTest {
    private Fake_Reservation_Controller instance;
    public Reservation_ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new Fake_Reservation_Controller();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CreateConnection method, of class Reservation_Controller.
     */
    @Test
    public void testCreateConnection() {
        System.out.println("CreateConnection");
         boolean success;
        success = instance.CreateConnection();
        assertEquals(true, success);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    
    @Test
    public void testRoomcheck() {
        System.out.println("roomcheck");
        int r = 0;
        int expResult = 1;
        int result = instance.roomcheck(r);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of CardCheck method, of class Reservation_Controller.
     */
    @Test
    public void testCardCheck() {
        System.out.println("CardCheck");
        int c = 5;
        int r = 0;
        int expResult = 5;
        int result = instance.CardCheck(c, r);
        assertEquals(expResult, result);
        
    }
    
}
