package TicketPackage;

public class app{
    public static void main(String args[]){
        AddTickettests();
        showRides();
    }
    public static void AddTickettests(){
        TicketModel md = new TicketModel();
        TicketController ct = new TicketController(md);
        ct.ticketSelection(1);
        System.out.println("printing ticket array for ticket 1: "+md.getTickets().toString());
        ct.ticketSelection(2);
        System.out.println("printing ticket array for ticket 1 and 2: "+md.getTickets().toString());
        ct.ticketSelection(3);
        System.out.println("printing ticket array for ticket 1,2, and 3: "+md.getTickets().toString());
        System.out.println("attempting to add unexpected input 6");
        ct.ticketSelection(6);
    }
    public static void showRides(){
        TicketModel md = new TicketModel();
        System.out.println("attempting to print ride list from model: "+md.getRides().toString());
    }

} 
    

