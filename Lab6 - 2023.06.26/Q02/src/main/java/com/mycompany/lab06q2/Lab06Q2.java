package com.mycompany.lab06q2;
public class Lab06Q2 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(5);
        System.out.println("Circle radius "+c.getRadius());
        System.out.println("Circle area "+c.calculateArea());
        System.out.println("Circle perimeter "+c.calculatePerimeter());
        
        Rectangle r = new Rectangle(4,2); 
        System.out.println("Rectangle length "+r.getLength());
        System.out.println("Rectangle wigth "+r.getWigth());
        System.out.println("Rectangle area "+r.calculateArea());
        System.out.println("Rectangle perimeter "+r.calculatePerimeter());
        
        Triangle t = new Triangle(3,4,5);
        System.out.println("Triangle side1 "+t.getSide1());
        System.out.println("Triangle side2 "+t.getSide2());
        System.out.println("Triangle side3 "+t.getSide3());
        System.out.println("Triangle area "+t.calculateArea());
        System.out.println("Triangle perimeter "+t.calculatePerimeter());      
    }
}
