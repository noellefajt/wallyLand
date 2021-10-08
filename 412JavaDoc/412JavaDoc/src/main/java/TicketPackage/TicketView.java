/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;
import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class TicketView {
    private TicketController cntl;
    /**
    *constructor for the ticket view class
    *takes a ticket controller object
    *@param contr ticketController object
    */
    public TicketView(TicketController contr){
        this.cntl = contr;
    }
    /**
    prompts the user for a ticket they'd like to purhcase (from a displayed list)
    then calls the ticketSelection methods from the ticketController object to add the specified ticket to the ticket array in ticketModel
    */
    public void TicketPrompt(){
        System.out.println("Which ticket do you want to buy:");
        System.out.println("Ticket 1: ride 1, 12:00, $30");
        System.out.println("Ticket 2: ride 2, 12:30, $30");
        System.out.println("Ticket 3: ride 3, 12:45, $30");
        Scanner input = new Scanner(System.in);
        int selection = Integer.parseInt(input.nextLine());
        this.cntl.ticketSelection(selection);
        input.close();
        
    }
}
