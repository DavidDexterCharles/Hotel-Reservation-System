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
public class Login_ControllerTest {
       FakeLogin_Controller instance;
    public Login_ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new FakeLogin_Controller();
    }
    
    @After
    public void tearDown() {
        instance =null;
    }

    /**
     * Test of CreateConnection method, of class Login_Controller.
     */
    @Test
    public void testCreateConnection() {
        System.out.println("CreateConnection");
     
        boolean expResult = true;
        boolean result = instance.CreateConnection();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEmployee method, of class Login_Controller.
     */
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        String uname = "123456";
        String pword = "123456";
       
        int expResult = 1;
        
        int result = instance.getEmployee(uname, pword);
        assertEquals(expResult, result);
        
    }
    
}
