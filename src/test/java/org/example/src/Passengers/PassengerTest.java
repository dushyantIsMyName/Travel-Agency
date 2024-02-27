package org.example.src.Passengers;

import org.example.src.Activities.Activity;
import org.example.src.Destinations.Destination;
import org.example.src.PassengerTypes.GoldPassenger;
import org.example.src.PassengerTypes.PremiumPassenger;
import org.example.src.PassengerTypes.StandardPassenger;
import org.example.src.TravelPackage.TravelPackage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Mock
    GoldPassenger goldPassenger;
    @Mock
    StandardPassenger standardPassenger;
    @Mock
    PremiumPassenger premiumPassenger;
    @Mock
    Activity activity;

    @Test
    public void testGetName(){
        Passenger passenger = new Passenger("Vineet", 83, goldPassenger);
        Assert.assertEquals("Vineet", passenger.getName());
    }

    @Test
    public void testGetPassengerNumber(){
        Passenger passenger = new Passenger("Ram", 433, standardPassenger);
        Assert.assertEquals(433, passenger.getPassengerNumber());
    }

    @Test
    public void testGetPassengerType_StandardPassenger(){
        Passenger passenger = new Passenger("Ram", 433, standardPassenger);
        Assert.assertEquals(standardPassenger, passenger.getPassengerType());
    }

    @Test
    public void testGetPassengerType_GoldPassenger(){
        Passenger passenger = new Passenger("Preeti", 91, goldPassenger);
        Assert.assertEquals(goldPassenger, passenger.getPassengerType());
    }

    @Test
    public void testGetPassengerType_PremiumPassenger(){
        Passenger passenger = new Passenger("Rashmi", 135, premiumPassenger);
        Assert.assertEquals(premiumPassenger, passenger.getPassengerType());
    }

    @Test
    public void testSignUpForActivity_GoldPassenger(){
        TravelPackage travelPackage = new TravelPackage("India", 450);
        Destination destination = new Destination("Delhi", travelPackage);
        Activity activity = new Activity("Cricket", "Cricket", 20, 300, destination);
        Passenger passenger = new Passenger("Piyush", 750, goldPassenger);
        passenger.signUpForActivity(activity);
        List<Activity> expectedActivityList = new ArrayList<>();
        expectedActivityList.add(activity);
        Assert.assertEquals(expectedActivityList.toArray(), passenger.getActivities().toArray());
    }

    @Test
    public void testSignUpForActivity_StandardPassenger(){
        TravelPackage travelPackage = new TravelPackage("India", 450);
        Destination destination = new Destination("Delhi", travelPackage);
        Activity activity = new Activity("Cricket", "Cricket", 20, 300, destination);
        Passenger passenger = new Passenger("Piyush", 750, standardPassenger);
        passenger.signUpForActivity(activity);
        List<Activity> expectedActivityList = new ArrayList<>();
        expectedActivityList.add(activity);
        Assert.assertEquals(expectedActivityList.toArray(), passenger.getActivities().toArray());
    }

    @Test
    public void testSignUpForActivity_PremiumPassenger(){
        TravelPackage travelPackage = new TravelPackage("India", 450);
        Destination destination = new Destination("Delhi", travelPackage);
        Activity activity = new Activity("Cricket", "Cricket", 20, 300, destination);
        Passenger passenger = new Passenger("Piyush", 750, premiumPassenger);
        passenger.signUpForActivity(activity);
        List<Activity> expectedActivityList = new ArrayList<>();
        expectedActivityList.add(activity);
        Assert.assertEquals(expectedActivityList.toArray(), passenger.getActivities().toArray());
    }



    @Test
    public void testGetActivities_GoldPassenger(){
        TravelPackage travelPackage = new TravelPackage("India", 450);
        Destination destination = new Destination("Delhi", travelPackage);
        Activity activity = new Activity("Cricket", "Cricket", 20, 300, destination);
        Passenger passenger = new Passenger("Piyush", 750, goldPassenger);
        passenger.signUpForActivity(activity);
        List<Activity> expectedActivityList = new ArrayList<>();
        expectedActivityList.add(activity);
        Assert.assertEquals(expectedActivityList.toArray(), passenger.getActivities().toArray());
    }

    @Test
    public void testGetActivities_StandardPassenger(){
        TravelPackage travelPackage = new TravelPackage("India", 450);
        Destination destination = new Destination("Delhi", travelPackage);
        Activity activity = new Activity("Cricket", "Cricket", 20, 300, destination);
        Passenger passenger = new Passenger("Piyush", 750, standardPassenger);
        passenger.signUpForActivity(activity);
        List<Activity> expectedActivityList = new ArrayList<>();
        expectedActivityList.add(activity);
        Assert.assertEquals(expectedActivityList.toArray(), passenger.getActivities().toArray());
    }

    @Test
    public void testGetActivities_PremiumPassenger(){
        TravelPackage travelPackage = new TravelPackage("India", 450);
        Destination destination = new Destination("Delhi", travelPackage);
        Activity activity = new Activity("Cricket", "Cricket", 20, 300, destination);
        Passenger passenger = new Passenger("Piyush", 750, premiumPassenger);
        passenger.signUpForActivity(activity);
        List<Activity> expectedActivityList = new ArrayList<>();
        expectedActivityList.add(activity);
        Assert.assertEquals(expectedActivityList.toArray(), passenger.getActivities().toArray());
    }
}