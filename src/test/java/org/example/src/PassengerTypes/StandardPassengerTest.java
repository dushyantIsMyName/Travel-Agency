package org.example.src.PassengerTypes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardPassengerTest {

    @Test
    public void testGetBalance(){
        StandardPassenger standardPassenger = new StandardPassenger(500);
        Assert.assertEquals(500, standardPassenger.getBalance(), 0.1);
    }

    @Test
    public void testUpdatePassengerWallet(){
        StandardPassenger standardPassenger = new StandardPassenger(560);
        standardPassenger.updatePassengerWallet(120);
        Assert.assertEquals(440, standardPassenger.getBalance(), 0.1);
    }
}