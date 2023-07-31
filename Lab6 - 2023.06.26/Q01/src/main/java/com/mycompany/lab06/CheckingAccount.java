package com.mycompany.lab06;
public class CheckingAccount extends BankAccount
{
    private static final double SAVINGS_INTEREST_RATE = 0.02;
    
    @Override
    public void calculateInterest()
    {
        double interest = getbalance() * SAVINGS_INTEREST_RATE;
        System.out.println("The interest for the checking account is "+interest);
    }
}
