package org.example.src;

import org.example.src.Activities.Activity;
import org.example.src.Destinations.Destination;
import org.example.src.PassengerTypes.GoldPassenger;
import org.example.src.PassengerTypes.PremiumPassenger;
import org.example.src.PassengerTypes.StandardPassenger;
import org.example.src.Passengers.Passenger;
import org.example.src.TravelAgency.TravelAgency;
import org.example.src.TravelPackage.TravelPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();
        int passengerId = 1;
        while(true){
            System.out.println("-------------------------------------------------");
            System.out.println("MenuList:");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Add New Passenger");
            System.out.println("2. Add New Travel Package");
            System.out.println("3. Print Passenger Details");
            System.out.println("4. Itinerary of Travel Packages");
            System.out.println("5. Print Passenger List");
            System.out.println("6. Print Available Activities");
            System.out.println("7. Exit");
            System.out.println("-------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            boolean exitProgram = false;
            switch(choice){
                case 1:
                    Passenger passenger = addPassengerHelper(passengerId, travelAgency);
                    if (passenger.getPassengerType() instanceof StandardPassenger && ((StandardPassenger) passenger.getPassengerType()).getBalance()<0){
                        break;
                    }
                    if (passenger.getPassengerType() instanceof GoldPassenger && ((GoldPassenger) passenger.getPassengerType()).getBalance()<0){
                        break;
                    }
                    travelAgency.addPassenger(passenger);
                    passengerId++;
                    break;
                case 2:
                    TravelPackage travelPackageInstance = addTravelPackageHelper(travelAgency);
                    if(travelPackageInstance==null || travelPackageInstance.getPassengerCapacity()<0){
                        break;
                    }
                    travelAgency.addTravelPackage(travelPackageInstance);
                    break;
                case 3:
                    for(TravelPackage travelPackage : travelAgency.getTravelPackages()){
                        for(Passenger passengerItem : travelPackage.getPassengers()){
                            printPassengerDetails(passengerItem);
                        }
                    }
                    break;
                case 4:
                    for(TravelPackage travelPackage : travelAgency.getTravelPackages()){
                        printItineraryOfTravelPackages(travelPackage);
                    }
                    break;
                case 5:
                    for(TravelPackage travelPackage : travelAgency.getTravelPackages()){
                        printPassengerList(travelPackage);
                    }
                    break;
                case 6:
                    for(TravelPackage travelPackage : travelAgency.getTravelPackages()){
                        printAvailableActivities(travelPackage);
                    }
                    break;
                case 7:
                default:
                    exitProgram = true;
                    break;
            }
            if(exitProgram){
                break;
            }
        }
    }

    private static void printAvailableActivities(TravelPackage travelPackage) {
        System.out.println("-------------------------------------------------");
        System.out.println("Available Activities:");
        System.out.println("-------------------------------------------------");
        for (Destination destination : travelPackage.getDestinations()) {
            for (Activity activity : destination.getActivities()) {
                if(activity.getCapacity()>0){
                    System.out.println("Destination: " + destination.getName() + ", Activity: " + activity.getName() + ", Capacity: " + activity.getCapacity());
                }
            }
        }
    }

    private static void printPassengerList(TravelPackage travelPackage) {
        System.out.println("-------------------------------------------------");
        System.out.println("Travel Package: " + travelPackage.getName());
        System.out.println("-------------------------------------------------");
        System.out.println("Passenger Capacity: " + travelPackage.getPassengerCapacity());
        System.out.println("-------------------------------------------------");
        System.out.println("Number of Passengers Enrolled: " + travelPackage.getPassengers().size());
        System.out.println("-------------------------------------------------");
        System.out.println("Passenger List:");
        System.out.println("-------------------------------------------------");
        for (Passenger passenger : travelPackage.getPassengers()) {
            System.out.println("Name: " + passenger.getName() + ", Passenger Number: " + passenger.getPassengerNumber());
        }
        System.out.println("-------------------------------------------------");
    }

    private static void printItineraryOfTravelPackages(TravelPackage travelPackage) {
        System.out.println("Travel Package: " + travelPackage.getName());
        for (Destination destination : travelPackage.getDestinations()) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("-------------------------------------------------");
                System.out.println("Activity: " + activity.getName());
                System.out.println("-------------------------------------------------");
                System.out.println("Description: " + activity.getDescription());
                System.out.println("-------------------------------------------------");
                System.out.println("Cost: " + activity.getCost());
                System.out.println("-------------------------------------------------");
                System.out.println("Capacity: " + activity.getCapacity());
                System.out.println("-------------------------------------------------");
            }
        }
    }

    private static void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        if (passenger.getPassengerType() instanceof StandardPassenger) {
            System.out.println("-------------------------------------------------");
            System.out.println("Balance: " + ((StandardPassenger) passenger.getPassengerType()).getBalance());
            System.out.println("-------------------------------------------------");
        }
        else if (passenger.getPassengerType() instanceof GoldPassenger) {
            System.out.println("-------------------------------------------------");
            System.out.println("Balance: " + ((GoldPassenger) passenger.getPassengerType()).getBalance());
            System.out.println("-------------------------------------------------");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Activities:");
        System.out.println("-------------------------------------------------");
        for (Activity activity : passenger.getActivities()) {
            System.out.println("Destination: " + activity.getDestination().getName() + ", Activity: " + activity.getName() + ", Price Paid: " + activity.getCost());
        }
        System.out.println("-------------------------------------------------");
    }

    private static Passenger addPassengerHelper(int passengerId, TravelAgency travelAgency) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Enter Passenger Name");
        System.out.println("-------------------------------------------------");
        String name = sc.nextLine();
        System.out.println("Enter Passenger Type (1/2/3)");
        System.out.println("1. Standard Passenger");
        System.out.println("2. Gold Passenger");
        System.out.println("3. Premium Passenger");
        System.out.println("-------------------------------------------------");
        Passenger passenger = null;
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                try{
                    System.out.println("-------------------------------------------------");
                    System.out.println("Enter passenger balance");
                    System.out.println("-------------------------------------------------");
                    int standardPassengerBalance = sc.nextInt();
                    passenger = new Passenger(name, passengerId, new StandardPassenger(standardPassengerBalance));
                }
                catch (Exception e){
                    e.getMessage();
                    return passenger;
                }
                break;
            case 2:
                try{
                    System.out.println("-------------------------------------------------");
                    System.out.println("Enter passenger balance");
                    System.out.println("-------------------------------------------------");
                    int goldPassengerBalance = sc.nextInt();
                    passenger = new Passenger(name, passengerId, new GoldPassenger(goldPassengerBalance));
                }
                catch (Exception e){
                    e.getMessage();
                    return passenger;
                }
                break;
            case 3:
                passenger = new Passenger(name, passengerId, new PremiumPassenger());
                break;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Want to sign up for any activities (Y/N)");
        System.out.println("-------------------------------------------------");
        String activityChoice = sc.next();
        if(activityChoice.equals("Y")){
            System.out.println("-------------------------------------------------");
            System.out.println("Choose an activity out of the following: ");
            System.out.println("-------------------------------------------------");
            List<Activity> activityListOfPassenger = new ArrayList<>();
            for(TravelPackage travelPackage:travelAgency.getTravelPackages()){
                for(Destination destination:travelPackage.getDestinations()){
                    for(Activity activity:destination.getActivities()){
                        System.out.println("Want to sign up for "+activity.getName()+" (Y/N)");
                        String choseOrNot = sc.next();
                        if(choseOrNot.equals("Y")){
                            if(possibleToAddPassenger(activity, passenger)){
                                activityListOfPassenger.add(activity);
                                passenger.signUpForActivity(activity);
                                passenger.getPassengerType().updatePassengerWallet(activity.getCost());
                            }
                            else {
                                System.out.println("-------------------------------------------------");
                                System.out.println("Activity cant be added due to low balance or filled capacity");
                                System.out.println("-------------------------------------------------");
                            }
                        }
                    }
                }
            }
            for(Activity activity:activityListOfPassenger){
                if (!activity.getDestination().getTravelPackage().getPassengers().contains(passenger)){
                    activity.getDestination().getTravelPackage().addPassenger(passenger);
                    activity.getDestination().getTravelPackage().setPassengerCapacity(activity.getDestination().getTravelPackage().getPassengerCapacity()-1);
                }
                activity.setCapacity(activity.getCapacity()-1);
                activity.addPassenger(passenger);
            }
        }
        return passenger;
    }

    private static boolean possibleToAddPassenger(Activity activity, Passenger passenger){
        if(activity.getCapacity()<=0){
            System.out.println(activity.getName()+"'s capacity already full, Sorry cant enroll");
            return false;
        }
        if(activity.getDestination().getTravelPackage().getPassengerCapacity()<=0){
            System.out.println(activity.getDestination().getTravelPackage().getName()+"'s Travel Package capacity already full, Sorry cant enroll");
            return false;
        }
        if(passenger.getPassengerType() instanceof PremiumPassenger) return true;
        if(passenger.getPassengerType() instanceof StandardPassenger && ((StandardPassenger) passenger.getPassengerType()).getBalance()>=activity.getCost()) return true;
        if(passenger.getPassengerType() instanceof GoldPassenger && ((GoldPassenger) passenger.getPassengerType()).getBalance()>=0.9*activity.getCost()) return true;
        System.out.println(passenger.getName()+"'s balance not enough to enroll in activity, Sorry cant enroll");
        return false;
    }

    private static TravelPackage addTravelPackageHelper(TravelAgency travelAgency){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Enter Package Name");
        System.out.println("-------------------------------------------------");
        String packageName = sc.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.println("Enter Passenger Capacity");
        System.out.println("-------------------------------------------------");
        int passengerCapacity = sc.nextInt();
        TravelPackage travelPackage = null;
        try {
            travelPackage = new TravelPackage(packageName, passengerCapacity);
            while (true){
                System.out.println("-------------------------------------------------");
                System.out.println("Want to add destinations to " + packageName + " (Y/N)");
                System.out.println("-------------------------------------------------");
                String choice = sc.next();
                if(choice.equals("Y")){
                    System.out.println("-------------------------------------------------");
                    System.out.println("Enter destination name");
                    System.out.println("-------------------------------------------------");
                    String destinationName = sc.next();
                    Destination destination = new Destination(destinationName, travelPackage);
                    travelPackage.addDestination(destination);
                    while (true){
                        System.out.println("-------------------------------------------------");
                        System.out.println("Want to add activities to " + destinationName + " (Y/N)");
                        System.out.println("-------------------------------------------------");
                        String activityChoice = sc.next();
                        if(activityChoice.equals("Y")){
                            System.out.println("-------------------------------------------------");
                            System.out.println("Enter activity name");
                            System.out.println("-------------------------------------------------");
                            String activityName = sc.next();
                            if(travelAgency.getActivityList().contains(activityName)){
                                System.out.println("-------------------------------------------------");
                                System.out.println("Sorry, the activity already exists at some location");
                                System.out.println("-------------------------------------------------");
                                continue;
                            }
                            System.out.println("-------------------------------------------------");
                            System.out.println("Enter activity description");
                            System.out.println("-------------------------------------------------");
                            String activityDesc = sc.next();
                            System.out.println("-------------------------------------------------");
                            System.out.println("Enter activity cost");
                            System.out.println("-------------------------------------------------");
                            int activityCost = sc.nextInt();
                            System.out.println("-------------------------------------------------");
                            System.out.println("Enter activity capacity");
                            System.out.println("-------------------------------------------------");
                            int activityCapacity = sc.nextInt();
                            try {
                                Activity activityInstance = new Activity(activityName, activityDesc, activityCost, activityCapacity, destination);
                                travelAgency.addActivityToUniqueActivities(activityName);
                                destination.addActivity(activityInstance);
                            }
                            catch (Exception e){
                                System.out.println(e.getMessage());
                            }
                        }
                        else {
                            break;
                        }
                    }
                }
                else{
                    return travelPackage;
                }
            }
        } catch (Exception e) {
            e.getMessage();
            return travelPackage;
        }
    }
}