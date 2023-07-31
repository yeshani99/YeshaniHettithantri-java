package com.mycompany.practical02;
public class Practical02 
{
    public static void main(String[] args)
    {
        Speaker speaker1 = new Priest();
        speaker1.speak("Bless You!");
        
        Speaker speaker2 = new Politician();
        speaker2.speak("Vote me!");
        
        Speaker speaker3 = new Lecturer();
        speaker3.speak("Today we are going to learn Java!");
    }
}
