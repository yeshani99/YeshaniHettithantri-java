package com.mycompany.practical02;
public class Priest implements Speaker 
{
   @Override
   public void speak(String phrase)
    {
        System.out.println("Priest: "+phrase);
    }
}
