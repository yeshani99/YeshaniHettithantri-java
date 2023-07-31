package com.mycompany.exception04;
import java.util.Scanner;
public class Exception04 
{
    public static void main(String[] args) 
    {
        int n1=10,n2=2,ans;
        //Array in Java
        int arr[] = new int[5];
        try
        {
            ans = n1/n2;
            System.out.println("Answer is: "+ans);
            arr[5] = 25;
            System.out.println("Last element is: "+arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number divide by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index error");
        }
        /*
        finally
        {
            System.out.println("Finally block is here");
        }
        */
    }
}
