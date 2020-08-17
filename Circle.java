package com.demo;
import java.util.Scanner;
public class Circle {
    private double radius;
    private String color;
    Circle()
    {
        this.radius = 1.0;
        this.setColor("red");
    }
    Circle(double r, String c)
    {
        this.radius = r;
        this.setColor(c);
    }
    double getRadius()
    {
        return radius;
    }
    double getArea()
    {
        return (3.14 * radius * radius);
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
}

class Circlee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        Circle circleWithValue = new Circle(55, "Violet");
        System.out.println(circle.getArea());
        System.out.println(circleWithValue.getArea());
    }
}
