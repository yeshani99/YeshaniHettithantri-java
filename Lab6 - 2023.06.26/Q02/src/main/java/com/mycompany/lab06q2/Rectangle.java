package com.mycompany.lab06q2;
public class Rectangle implements Shape 
{
    private double length;
    private double width;
    public Rectangle(double length,double width)
    {
        this.length = length;
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public void setWigth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public double getWigth()
    {
        return width;
    }
    @Override
    public double calculateArea()
    {
        return length * width;
    }
    @Override
    public double calculatePerimeter()
    {
        return 2 * (length + width);
    }
}
