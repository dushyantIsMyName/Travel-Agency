package org.example.src.Activities;

import org.example.src.Destinations.Destination;
import org.example.src.PassengerTypes.GoldPassenger;
import org.example.src.PassengerTypes.PremiumPassenger;
import org.example.src.PassengerTypes.StandardPassenger;
import org.example.src.Passengers.Passenger;
import org.example.src.TravelPackage.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> passengerList;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        if(cost<0){
            throw new IllegalArgumentException("Cost cant be smaller than 0");
        }
        this.cost = cost;
        if(capacity<0){
            throw new IllegalArgumentException("Capacity cant be smaller than 0");
        }
        this.capacity = capacity;
        this.destination = destination;
        this.passengerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int newCapacity){
        capacity = newCapacity;
    }
    public List<Passenger> getPassengerList(){
        return passengerList;
    }

    public Destination getDestination() {
        return destination;
    }

    public void addPassenger(Passenger passenger){
        passengerList.add(passenger);
    }
}
