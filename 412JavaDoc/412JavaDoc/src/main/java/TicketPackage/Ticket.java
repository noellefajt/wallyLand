/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;

/**
 *
 * @author Dylan
 */
public class Ticket {
    private String time;
    private String ride;
    private int price;
    private int ID;
    /**
    *constructor for the ticket class creates a ticket object
    *@param time string for the time the ticket is purchased
    *@param ride String for the ride name the ticket is for
    *@param price Int for the price of the ticket
    *@param ID Int for the ticket's unique ID
    */
    public Ticket(String time, String ride, int price, int ID){
        this.time = time;
        this.ride = ride;
        this.price = price;
        this.ID = ID;
    }
    /**
    returns ticket price
    */
    public int getTicketPrice(){
        return this.price;
    }
    /**
    returns ticket id
    */
    public int getTicketID(){
        return this.ID;
    }
    /**
    returns the ride the ticket is for
    */
    public String getTicketRide(){
        return this.ride;
    }
    /**
    returns the ticket time
    */
    public String getTicketTime(){
        return this.time;
    }
}