package com.mycompany.exception03;
import java.util.Scanner;
public class Exception03 
{
    public static void main(String[] args) 
    {
        int n1,n2,ans;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Enter first number: ");
            n1 = sc.nextInt();
            System.out.print("Enter second number: ");
            n2 = sc.nextInt();
            ans = n1/n2;
            System.out.println("Answer is "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number divide by zero error");
        }
    }
}
