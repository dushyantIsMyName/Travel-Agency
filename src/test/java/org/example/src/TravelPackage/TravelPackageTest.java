package org.example.src.TravelPackage;

import org.example.src.Destinations.Destination;
import org.example.src.PassengerTypes.GoldPassenger;
import org.example.src.PassengerTypes.PremiumPassenger;
import org.example.src.PassengerTypes.StandardPassenger;
import org.example.src.Passengers.Passenger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TravelPackageTest {
    @Test
    public void testGetName(){
        TravelPackage travelPackage = new TravelPackage("India", 550);
        Assert.assertEquals("India", travelPackage.getName());
    }

    @Test
    public void testGetPassengerCapacity(){
        TravelPackage travelPackage = new TravelPackage("USA", 400);
        Assert.assertEquals(400, travelPackage.getPassengerCapacity());
    }

    @Test
    public void testGetDestinations(){
        TravelPackage travelPackage = new TravelPackage("India", 430);
        Destination destinationUdaipur = new Destination("Udaipur", travelPackage);
        Destination destinationJaipur = new Destination("Jaipur", travelPackage);
        Destination destinationKota = new Destination("Kota", travelPackage);
        travelPackage.addDestination(destinationUdaipur);
        travelPackage.addDestination(destinationJaipur);
        travelPackage.addDestination(destinationKota);
        List<Destination> expectedDestinationList = new ArrayList<>();
        expectedDestinationList.add(destinationUdaipur);
        expectedDestinationList.add(destinationJaipur);
        expectedDestinationList.add(destinationKota);
        Assert.assertEquals(expectedDestinationList.toArray(), travelPackage.getDestinations().toArray());
    }

    @Test
    public void testAddDestinations(){
        TravelPackage travelPackage = new TravelPackage("India", 430);
        Destination destinationUdaipur = new Destination("Udaipur", travelPackage);
        Destination destinationJaipur = new Destination("Jaipur", travelPackage);
        Destination destinationKota = new Destination("Kota", travelPackage);
        travelPackage.addDestination(destinationUdaipur);
        travelPackage.addDestination(destinationJaipur);
        travelPackage.addDestination(destinationKota);
        List<Destination> expectedDestinationList = new ArrayList<>();
        expectedDestinationList.add(destinationUdaipur);
        expectedDestinationList.add(destinationJaipur);
        expectedDestinationList.add(destinationKota);
        Assert.assertEquals(expectedDestinationList.toArray(), travelPackage.getDestinations().toArray());
    }

    @Test
    public void testAddPassenger_standardPassenger(){
        StandardPassenger standardPassenger = new StandardPassenger(50);
        Passenger passenger = new Passenger("Ravi", 782, standardPassenger);
        TravelPackage travelPackage = new TravelPackage("Japan", 25);
        travelPackage.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        Assert.assertEquals(expectedPassengerList.toArray(), travelPackage.getPassengers().toArray());
    }

    @Test
    public void testAddPassenger_goldPassenger(){
        GoldPassenger goldPassenger = new GoldPassenger(50);
        Passenger passenger = new Passenger("Ravi", 782, goldPassenger);
        TravelPackage travelPackage = new TravelPackage("Japan", 25);
        travelPackage.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        Assert.assertEquals(expectedPassengerList.toArray(), travelPackage.getPassengers().toArray());
    }

    @Test
    public void testAddPassenger_premiumPassenger(){
        PremiumPassenger premiumPassenger = new PremiumPassenger();
        Passenger passenger = new Passenger("Ravi", 782, premiumPassenger);
        TravelPackage travelPackage = new TravelPackage("Japan", 25);
        travelPackage.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        Assert.assertEquals(expectedPassengerList.toArray(), travelPackage.getPassengers().toArray());
    }



    @Test
    public void testAddPassenger_differentTypesOfPassengers(){
        StandardPassenger standardPassenger = new StandardPassenger(50);
        GoldPassenger goldPassenger = new GoldPassenger(50);
        PremiumPassenger premiumPassenger = new PremiumPassenger();
        Passenger passenger1 = new Passenger("Ravi", 782, standardPassenger);
        Passenger passenger2 = new Passenger("Ravi", 782, goldPassenger);
        Passenger passenger3 = new Passenger("Ravi", 782, premiumPassenger);
        TravelPackage travelPackage = new TravelPackage("Japan", 25);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        expectedPassengerList.add(passenger3);
        Assert.assertEquals(expectedPassengerList.toArray(), travelPackage.getPassengers().toArray());
    }

    @Test
    public void testGetPassengers_standardPassenger(){
        StandardPassenger standardPassenger = new StandardPassenger(50);
        Passenger passenger = new Passenger("Ravi", 782, standardPassenger);
        TravelPackage travelPackage = new TravelPackage("Japan", 25);
        travelPackage.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        Assert.assertEquals(expectedPassengerList.toArray(), travelPackage.getPassengers().toArray());
    }

    @Test
    public void testGetPassengers_goldPassenger(){
        GoldPassenger goldPassenger = new GoldPassenger(50);
        Passenger passenger = new Passenger("Ravi", 782, goldPassenger);
        TravelPackage travelPackage = new TravelPackage("Japan", 25);
        travelPackage.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        Assert.assertEquals(expectedPassengerList.toArray(), travelPackage.getPassengers().toArray());
    }

    @Test
    public void testGetPassengers_premiumPassenger(){
        PremiumPassenger premiumPassenger = new PremiumPassenger();
        Passenger passenger = new Passenger("Ravi", 782, premiumPassenger);
        TravelPackage travelPackage = new TravelPackage("Japan", 25);
        travelPackage.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        Assert.assertEquals(expectedPassengerList.toArray(), travelPackage.getPassengers().toArray());
    }



    @Test
    public void testGetPassengers_differentTypesOfPassengers(){
        StandardPassenger standardPassenger = new StandardPassenger(50);
        GoldPassenger goldPassenger = new GoldPassenger(50);
        PremiumPassenger premiumPassenger = new PremiumPassenger();
        Passenger passenger1 = new Passenger("Ravi", 782, standardPassenger);
        Passenger passenger2 = new Passenger("Ravi", 782, goldPassenger);
        Passenger passenger3 = new Passenger("Ravi", 782, premiumPassenger);
        TravelPackage travelPackage = new TravelPackage("Japan", 25);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        expectedPassengerList.add(passenger3);
        Assert.assertEquals(expectedPassengerList.toArray(), travelPackage.getPassengers().toArray());
    }

    @Test
    public void testSetPassengerCapacity(){
        TravelPackage travelPackage = new TravelPackage("France", 780);
        travelPackage.setPassengerCapacity(550);
        Assert.assertEquals(550, travelPackage.getPassengerCapacity());
    }
}