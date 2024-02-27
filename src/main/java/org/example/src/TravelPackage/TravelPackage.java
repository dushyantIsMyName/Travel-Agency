package org.example.src.TravelPackage;

import org.example.src.Passengers.Passenger;


import org.example.src.Destinations.Destination;
import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        if(passengerCapacity<0){
            throw new IllegalArgumentException("Passenger capacity cant be less than 0");
        }
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int newCapacity){
        passengerCapacity = newCapacity;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}

