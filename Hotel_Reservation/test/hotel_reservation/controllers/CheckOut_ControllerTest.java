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
public class CheckOut_ControllerTest {
     FakeCheckOut_Controller instance;
    public CheckOut_ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new FakeCheckOut_Controller();
    }
    
    @After
    public void tearDown() {
        instance= null;
    }

    /**
     * Test of CreateConnection method, of class CheckOut_Controller.
     */
    @Test
    public void testCreateConnection() {
        System.out.println("CreateConnection");
         
        boolean expResult = true;
        boolean result = instance.CreateConnection();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of bill method, of class CheckOut_Controller.
     */
    @Test
    public void testBill() {
        System.out.println("bill");
        int room = 300;
        int card = 555;
        String CoutDate = "2014-04-13 16:51:59";
        Double extra = 0.00;
        String extrainfo = "";
        
        String expResult = "Name: David	Charles\n" +
"Room Number: 300\n" +
"Card Type: Linx \n" +
"Card Number:  555\n" +
"Total Cost: $ 175";
        String result = instance.bill(room, card, CoutDate, extra, extrainfo);
        assertEquals(expResult, result);
       
    }
    
}
