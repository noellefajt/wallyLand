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
public class TicketController {
    private TicketModel md;
    /**
    *Constructor for ticket controller, takes in a ticket model object
    *@param model TicketModel object
    */
    public TicketController(TicketModel model){
        this.md = model;
    }
    /**
    *depending on the input from ticketPrompt method in ticket view
    *creates a ticket and passes it to the addTicketMethdo in model to be added to the ticket array
    *@param selection the specific selection integer returned from ticketView.ticketPrompt
    */
    public void ticketSelection(int selection){
        if(selection == 1){
            md.addTicket(new Ticket("12:00","ride 1",30,1));
        }else if(selection == 2){
            md.addTicket(new Ticket("12:30","ride 2",30,2));
        }else if(selection == 3){
            md.addTicket(new Ticket("12:45","ride 3",30,3));
        }else{
            System.out.println("not a ticket");
        }
    }
}
