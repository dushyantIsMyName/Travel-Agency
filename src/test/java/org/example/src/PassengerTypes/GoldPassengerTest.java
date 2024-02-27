package org.example.src.PassengerTypes;

import org.example.src.Passengers.Passenger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldPassengerTest {

    @Test
    public void testGetBalance(){
        GoldPassenger goldPassenger = new GoldPassenger(40);
        Assert.assertEquals(40.0, goldPassenger.getBalance(), 0.1);
    }

    @Test
    public void testUpdatePassengerWallet(){
        GoldPassenger goldPassenger = new GoldPassenger(400);
        goldPassenger.updatePassengerWallet(300);
        Assert.assertEquals(130, goldPassenger.getBalance(), 0.1);
    }
}