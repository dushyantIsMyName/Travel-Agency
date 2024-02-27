package org.example.src.Destinations;

import org.example.src.Activities.Activity;
import org.example.src.TravelPackage.TravelPackage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {

    @Mock
    TravelPackage travelPackage;

    @Test
    public void testGetName(){
        Destination destination = new Destination("Texas", new TravelPackage("USA", 30));
        Assert.assertEquals("Texas", destination.getName());
    }

    @Test
    public void testGetTravelPackage(){
        travelPackage = new TravelPackage("USA", 30);
        Destination destination = new Destination("Texas", travelPackage);
        Assert.assertEquals(travelPackage, destination.getTravelPackage());
    }


    @Test
    public void testGetActivities(){
        Destination destination = new Destination("Texas", new TravelPackage("USA", 30));
        Activity swimmingActivity = new Activity("Swimming", "Swimming", 15, 20, destination);
        Activity baseballActivity = new Activity("Baseball", "Baseball", 15, 20, destination);
        Activity rugbyActivity = new Activity("Rugby", "Rugby", 15, 20, destination);
        destination.addActivity(swimmingActivity);
        destination.addActivity(baseballActivity);
        destination.addActivity(rugbyActivity);
        List<Activity> expectedActivityList = new ArrayList<>();
        expectedActivityList.add(swimmingActivity);
        expectedActivityList.add(baseballActivity);
        expectedActivityList.add(rugbyActivity);
        List<Activity> actualActivityList = destination.getActivities();
        Assert.assertArrayEquals(expectedActivityList.toArray(), actualActivityList.toArray());
    }

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Texas", new TravelPackage("USA", 30));
        Activity swimmingActivity = new Activity("Swimming", "Swimming", 15, 20, destination);
        destination.addActivity(swimmingActivity);
        List<Activity> expectedActivityList = new ArrayList<>();
        expectedActivityList.add(swimmingActivity);
        Assert.assertArrayEquals(expectedActivityList.toArray(), destination.getActivities().toArray());
    }
}