package org.example.src.PassengerTypes;


import org.example.src.Interfaces.PassengerType;

public class StandardPassenger implements PassengerType {
    private double balance;

    public StandardPassenger(double balance) {
        if(balance<0){
            throw new IllegalArgumentException("Balance cant be below 0");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    @Override
    public void updatePassengerWallet(double cost) {
        balance-=cost;
    }
}