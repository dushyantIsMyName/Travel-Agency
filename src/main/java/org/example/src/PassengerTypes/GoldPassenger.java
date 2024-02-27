package org.example.src.PassengerTypes;


import org.example.src.Interfaces.PassengerType;

public class GoldPassenger implements PassengerType {
    private double balance;

    public GoldPassenger(double balance) {
        if(balance<0){
            throw new IllegalArgumentException("Balance cant be below 0");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void updatePassengerWallet(double cost) {
        balance -= cost * 0.9;
    }
}
