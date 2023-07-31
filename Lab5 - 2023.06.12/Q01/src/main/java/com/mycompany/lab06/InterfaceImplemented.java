package com.mycompany.lab06;

public class InterfaceImplemented implements MyFirstInterface 
{
    @Override
    public void display()
    {
        x++;
        //The value x cannot be changed, because it is declared in an interface. 
        //The variable which initialize inside the interface,it's value cannot be changed.
        System.out.println("value "+x);
    }
}

