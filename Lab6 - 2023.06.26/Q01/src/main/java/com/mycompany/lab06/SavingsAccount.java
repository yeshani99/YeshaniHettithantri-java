package com.mycompany.lab06;
public class SavingsAccount extends BankAccount
{
    private static final double SAVINGS_INTEREST_RATE = 0.12;
    
    @Override
    public void calculateInterest()
    {
        double interest = getbalance() * SAVINGS_INTEREST_RATE;
        System.out.println("The interest for the savings account is "+interest);
    }
}
