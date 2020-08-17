package com.demo;

public class QuestionSix {
    String name;
    String address;
    int year;
    public QuestionSix(String n, int y, String a)
    {
        name = n;
        year = y;
        address = a;
    }

    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
    public String getAddress()
    {
        return address;
    }

    public static void main(String[] args)
    {
        QuestionSix Q1 = new QuestionSix("Robert", 1994, "64C- WallStreet");
        QuestionSix Q2 = new QuestionSix("Sam", 2000, "68D- WallStreet");
        QuestionSix Q3 = new QuestionSix("John", 1999, "28B- WallStreet");
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        System.out.println(Q1.getName()+"\t\t"+Q1.getYear()+"\t\t\t\t"+Q1.getAddress());
        System.out.println(Q2.getName()+"\t\t\t"+Q2.getYear()+"\t\t\t\t"+Q2.getAddress());
        System.out.println(Q3.getName()+"\t\t"+Q3.getYear()+"\t\t\t\t"+Q3.getAddress());
    }
}
