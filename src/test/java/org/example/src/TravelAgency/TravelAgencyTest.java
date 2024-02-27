package org.example.src.TravelAgency;

import org.example.src.PassengerTypes.GoldPassenger;
import org.example.src.PassengerTypes.PremiumPassenger;
import org.example.src.PassengerTypes.StandardPassenger;
import org.example.src.Passengers.Passenger;
import org.example.src.TravelPackage.TravelPackage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TravelAgencyTest {

    @Test
    public void testAddTravelPackages(){
        TravelPackage travelPackageIndia = new TravelPackage("India", 348);
        TravelPackage travelPackageUSA = new TravelPackage("India", 348);
        TravelPackage travelPackageUK = new TravelPackage("India", 348);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addTravelPackage(travelPackageIndia);
        travelAgency.addTravelPackage(travelPackageUSA);
        travelAgency.addTravelPackage(travelPackageUK);
        List<TravelPackage> expectedTravelPackageList = new ArrayList<>();
        expectedTravelPackageList.add(travelPackageIndia);
        expectedTravelPackageList.add(travelPackageUSA);
        expectedTravelPackageList.add(travelPackageUK);
        Assert.assertEquals(expectedTravelPackageList.toArray(), travelAgency.getTravelPackages().toArray());
    }

    @Test
    public void testGetTravelPackages(){
        TravelPackage travelPackageIndia = new TravelPackage("India", 348);
        TravelPackage travelPackageUSA = new TravelPackage("India", 348);
        TravelPackage travelPackageUK = new TravelPackage("India", 348);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addTravelPackage(travelPackageIndia);
        travelAgency.addTravelPackage(travelPackageUSA);
        travelAgency.addTravelPackage(travelPackageUK);
        List<TravelPackage> expectedTravelPackageList = new ArrayList<>();
        expectedTravelPackageList.add(travelPackageIndia);
        expectedTravelPackageList.add(travelPackageUSA);
        expectedTravelPackageList.add(travelPackageUK);
        Assert.assertEquals(expectedTravelPackageList.toArray(), travelAgency.getTravelPackages().toArray());
    }

    @Test
    public void testAddPassenger_StandardPassenger(){
        StandardPassenger standardPassenger = new StandardPassenger(50);
        Passenger passenger1 = new Passenger("Raman", 426, standardPassenger);
        Passenger passenger2 = new Passenger("Vicky", 426, standardPassenger);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPassenger(passenger1);
        travelAgency.addPassenger(passenger2);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        Assert.assertEquals(expectedPassengerList.toArray(), travelAgency.getPassengerList().toArray());
    }

    @Test
    public void testAddPassenger_GoldPassenger(){
        GoldPassenger goldPassenger = new GoldPassenger(50);
        Passenger passenger1 = new Passenger("Raman", 426, goldPassenger);
        Passenger passenger2 = new Passenger("Vicky", 426, goldPassenger);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPassenger(passenger1);
        travelAgency.addPassenger(passenger2);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        Assert.assertEquals(expectedPassengerList.toArray(), travelAgency.getPassengerList().toArray());
    }

    @Test
    public void testAddPassenger_PremiumPassenger(){
        PremiumPassenger premiumPassenger = new PremiumPassenger();
        Passenger passenger1 = new Passenger("Raman", 426, premiumPassenger);
        Passenger passenger2 = new Passenger("Vicky", 426, premiumPassenger);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPassenger(passenger1);
        travelAgency.addPassenger(passenger2);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        Assert.assertEquals(expectedPassengerList.toArray(), travelAgency.getPassengerList().toArray());
    }

    @Test
    public void testAddPassenger_DifferentPassengerTypes(){
        PremiumPassenger premiumPassenger = new PremiumPassenger();
        GoldPassenger goldPassenger = new GoldPassenger(50);
        StandardPassenger standardPassenger = new StandardPassenger(200);
        Passenger passenger1 = new Passenger("Raman", 441, premiumPassenger);
        Passenger passenger2 = new Passenger("Vicky", 426, goldPassenger);
        Passenger passenger3 = new Passenger("Shivani", 79, standardPassenger);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPassenger(passenger1);
        travelAgency.addPassenger(passenger2);
        travelAgency.addPassenger(passenger3);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        expectedPassengerList.add(passenger3);
        Assert.assertEquals(expectedPassengerList.toArray(), travelAgency.getPassengerList().toArray());
    }

    @Test
    public void testGetPassengerList_StandardPassenger(){
        StandardPassenger standardPassenger = new StandardPassenger(50);
        Passenger passenger1 = new Passenger("Raman", 426, standardPassenger);
        Passenger passenger2 = new Passenger("Vicky", 426, standardPassenger);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPassenger(passenger1);
        travelAgency.addPassenger(passenger2);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        Assert.assertEquals(expectedPassengerList.toArray(), travelAgency.getPassengerList().toArray());
    }

    @Test
    public void testGetPassengerList_GoldPassenger(){
        GoldPassenger goldPassenger = new GoldPassenger(50);
        Passenger passenger1 = new Passenger("Raman", 426, goldPassenger);
        Passenger passenger2 = new Passenger("Vicky", 426, goldPassenger);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPassenger(passenger1);
        travelAgency.addPassenger(passenger2);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        Assert.assertEquals(expectedPassengerList.toArray(), travelAgency.getPassengerList().toArray());
    }

    @Test
    public void testGetPassengerList_PremiumPassenger(){
        PremiumPassenger premiumPassenger = new PremiumPassenger();
        Passenger passenger1 = new Passenger("Raman", 426, premiumPassenger);
        Passenger passenger2 = new Passenger("Vicky", 426, premiumPassenger);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPassenger(passenger1);
        travelAgency.addPassenger(passenger2);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        Assert.assertEquals(expectedPassengerList.toArray(), travelAgency.getPassengerList().toArray());
    }


    @Test
    public void testGetPassengerList_DifferentPassengerTypes(){
        PremiumPassenger premiumPassenger = new PremiumPassenger();
        GoldPassenger goldPassenger = new GoldPassenger(50);
        StandardPassenger standardPassenger = new StandardPassenger(200);
        Passenger passenger1 = new Passenger("Raman", 441, premiumPassenger);
        Passenger passenger2 = new Passenger("Vicky", 426, goldPassenger);
        Passenger passenger3 = new Passenger("Shivani", 79, standardPassenger);
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addPassenger(passenger1);
        travelAgency.addPassenger(passenger2);
        travelAgency.addPassenger(passenger3);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger1);
        expectedPassengerList.add(passenger2);
        expectedPassengerList.add(passenger3);
        Assert.assertEquals(expectedPassengerList.toArray(), travelAgency.getPassengerList().toArray());
    }
}