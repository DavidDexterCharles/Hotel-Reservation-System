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
class FakeCheckOut_Controller implements ICheckOut_Controller{

    @Override
    public boolean CreateConnection() {
        return true;
    }

    @Override
    public String bill(int room, int card, String CoutDate, Double extra, String extrainfo) {
       String s = "Name: David	Charles\n" +
"Room Number: 300\n" +
"Card Type: Linx \n" +
"Card Number:  555\n" +
"Total Cost: $ 175";
           return s;    
    }
    
}
