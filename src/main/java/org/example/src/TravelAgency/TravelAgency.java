package org.example.src.TravelAgency;

import org.example.src.Activities.Activity;
import org.example.src.PassengerTypes.GoldPassenger;
import org.example.src.PassengerTypes.StandardPassenger;
import org.example.src.Passengers.Passenger;
import org.example.src.TravelPackage.TravelPackage;

import org.example.src.Destinations.Destination;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TravelAgency {
    private List<TravelPackage> travelPackages;
    private List<Passenger> passengerList;
    private HashSet<String> activityList = new HashSet<String>();

    public TravelAgency() {
        this.travelPackages = new ArrayList<>();
        this.passengerList = new ArrayList<>();
    }

    public List<TravelPackage> getTravelPackages() {
        return travelPackages;
    }

    public HashSet<String> getActivityList() {
        return activityList;
    }

    public void addActivityToUniqueActivities(String activityName){
        activityList.add(activityName);
    }

    public void addTravelPackage(TravelPackage travelPackage) {
        travelPackages.add(travelPackage);
    }

    List<Passenger> getPassengerList(){
        return passengerList;
    }

    public void addPassenger(Passenger passenger){
        passengerList.add(passenger);
    }

}
