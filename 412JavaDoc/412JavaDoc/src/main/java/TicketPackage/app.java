package TicketPackage;

public class app {
    public static void main(String[] args)
    {

        TicketModel model = new TicketModel();
        TicketView view = new TicketView();
        TicketController controller = new TicketController(model, view);
    }
}
