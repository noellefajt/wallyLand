package TestHarnessPackage;

import PlannerPackage.Planner;
import PlannerPackage.PlannerController;
import PlannerPackage.PlannerView;
import RestaurantReservation.restaurantRes;
import RestaurantReservation.restaurantResList;
import RidePackage.Ride;
import RidePackage.RideView;
import RidePackage.RideViewController;
import TicketPackage.TicketController;
import TicketPackage.TicketModel;

public class TestHarness {
    public static void main(String args[]){
        System.out.println("ticket package tests:");
        AddTickettests();
        showRides();
        System.out.println("restaurant package tests:");
        RestartableTests();
        System.out.println("planner package tests:");
        addSuccessfulEventTest();
        addInvalidEventTest();
        System.out.println("ride tests:");
        rideTest();
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
    public static void RestartableTests(){
        restaurantRes restaurantRes;
        restaurantResList restaurantResList;
        System.out.println("restaurant tests are running");
        

        //resInterface = new restaurantResUI();
        restaurantRes = new restaurantRes("Joe", "Smith", "1234567890", "diner", 3, "3:45");
        restaurantResList = new restaurantResList();
        
        String reservationInfo = restaurantRes.getInfo();
        System.out.println(reservationInfo);
        boolean isAvailable = restaurantResList.isAvailable("CFA", 10, "5:45");
        System.out.println(isAvailable);
    }
    public static void addSuccessfulEventTest(){
        Planner model = getData("", "");
        PlannerView view = new PlannerView();
        PlannerController controller = new PlannerController(model, view);
        
        System.out.println("");
        System.out.println("Trying to add log flume for 8:00am:");
        model.setTime("8:00am");
        model.setDescription("Log Flume");
        controller.displayEvents();
        
        System.out.println("");
        System.out.println("Trying to add roller coaster for 4:00pm:");
        model.setTime("4:00pm");
        model.setDescription("Roller Coaster");
        controller.displayEvents();
        
    }
    
    public static void addInvalidEventTest(){
        Planner model = getData("", "");
        PlannerView view = new PlannerView();
        PlannerController controller = new PlannerController(model, view);
        
        System.out.println("");
        System.out.println("Trying to add Merry-go-round (invalid ride at the park) for 4:00am (invalid time at the park):");
        model.setTime("4:00am");
        model.setDescription("Merry-go-round");
        controller.displayEvents();
    }
    
    private static Planner getData(String time, String description){
        Planner planner = new Planner("", "");
        planner.setTime(time);
        planner.setDescription(description);
        return planner;
    }
    public static void rideTest(){
        Ride tilt = new Ride(false, "Tilt-a-Whirl", 15, true, "The Tilt-a-whirl is a classic carnival ride.");
        Ride coaster = new Ride(false, "Lightning Bolt", 55, true, "The Lightning bolt is an inversion coaster.");
        Ride ferris = new Ride(false, "Ferris Wheel", 0, false, "The Ferris Wheel is a token attraction.");
        Ride parade = new Ride(true, "Afternoon Parade", 0, false, "The Afternoon Parade occurs daily at 1 PM.");
        RideViewController tester = new RideViewController(tilt);
        tester.addRide(coaster);
        tester.addRide(ferris);
        tester.addRide(parade);
        RideView view = new RideView(tester);
        
        view.displayWaitTime(tilt.getRideName());
        view.displayWaitTime(coaster.getRideName());
        view.displayWaitTime(ferris.getRideName());
        view.displayWaitTime("Not a real ride");
        view.displayWaitTime(parade.getRideName());
    }
}
