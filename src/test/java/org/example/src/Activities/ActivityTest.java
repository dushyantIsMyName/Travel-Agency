package org.example.src.Activities;

import org.example.src.Destinations.Destination;
import org.example.src.PassengerTypes.GoldPassenger;
import org.example.src.PassengerTypes.PremiumPassenger;
import org.example.src.PassengerTypes.StandardPassenger;
import org.example.src.Passengers.Passenger;
import org.example.src.TravelPackage.TravelPackage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    @Mock
    Passenger passenger;
    @Mock
    TravelPackage travelPackage;
    @Mock
    Destination destination;

    @Test
    public void testAddPassenger_standardPassenger() {
        Activity activity = new Activity("Cricket", "Cricket", 10, 3, new Destination("Delhi", new TravelPackage("India", 10)));
        Passenger passenger = new Passenger("Raghav", 12, new StandardPassenger(20));
        activity.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        assertArrayEquals(expectedPassengerList.toArray(), activity.getPassengerList().toArray());
    }

    @Test
    public void testAddPassenger_goldPassenger() {
        Activity activity = new Activity("Cricket", "Cricket", 10, 3, new Destination("Delhi", new TravelPackage("India", 10)));
        Passenger passenger = new Passenger("Raghav", 12, new GoldPassenger(20));
        activity.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        assertArrayEquals(expectedPassengerList.toArray(), activity.getPassengerList().toArray());
    }

    @Test
    public void testAddPassenger_premiumPassenger() {
        Activity activity = new Activity("Cricket", "Cricket", 10, 3, new Destination("Delhi", new TravelPackage("India", 10)));
        Passenger passenger = new Passenger("Raghav", 12, new PremiumPassenger());
        activity.addPassenger(passenger);
        List<Passenger> expectedPassengerList = new ArrayList<>();
        expectedPassengerList.add(passenger);
        assertArrayEquals(expectedPassengerList.toArray(), activity.getPassengerList().toArray());
    }
}