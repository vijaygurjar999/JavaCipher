package com.demo;
import java.util.Scanner;
public class AreaTriangle {
    public static double Area(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        return (double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Side: ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Side: ");
        double b = sc.nextDouble();
        System.out.println("Enter Third Side: ");
        double c = sc.nextDouble();
        System.out.println("Area is " + Area(a, b, c));
    }
}
