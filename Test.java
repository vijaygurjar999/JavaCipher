package com.demo;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    public void display() {
        System.out.println(width + " " + height);
    }
}
class RectangleArea extends Rectangle{
    void read_input(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    public void display(int width,int height){
        System.out.println(width*height);
    }
}
public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width= scanner.nextInt();
        int height= scanner.nextInt();
        RectangleArea area= new RectangleArea();
        area.read_input(width,height);
        area.display();
        area.display(width,height);


    }
}

