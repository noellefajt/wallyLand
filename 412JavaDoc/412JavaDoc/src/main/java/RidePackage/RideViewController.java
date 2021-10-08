/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RidePackage;

/**
 *
 * @author cjm6757
 */
public class RideViewController {
    
    private Ride ride;

    public RideViewController(Ride ride) {
        this.ride = ride;
    }
    
    public int getRideWait(String rideName){
        if(ride.getIsWait()){
            return ride.getWaitTime();
        } else {
            return 0;
        }
    }
    
    //This is just to facilitate basic function
    //It will be more complex, however more development is needed to know what must be added
    
}