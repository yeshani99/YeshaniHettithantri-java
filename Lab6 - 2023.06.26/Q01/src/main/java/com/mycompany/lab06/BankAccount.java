package com.mycompany.lab06;
public abstract class BankAccount 
{
    private String accountNumber;
    private double balance;
    
    public void setaccountNumber(String a)
    {
        accountNumber = a;
    }
    public void setbalance(double b)
    {
        balance = b;
    }
    public String getaccountNumber()
    {
        return accountNumber;
    }
    public double getbalance()
    {
        return balance;
    }
    public abstract void calculateInterest();
}
