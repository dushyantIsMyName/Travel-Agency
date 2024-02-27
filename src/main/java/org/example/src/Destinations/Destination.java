package org.example.src.Destinations;

import org.example.src.Activities.Activity;
import org.example.src.TravelPackage.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;
    private TravelPackage travelPackage;


    public Destination(String name, TravelPackage travelPackage) {
        this.name = name;
        this.activities = new ArrayList<>();
        this.travelPackage = travelPackage;
    }

    public String getName() {
        return name;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public TravelPackage getTravelPackage(){
        return travelPackage;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
