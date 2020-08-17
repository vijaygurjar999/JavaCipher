package com.demo;

public class Complex {
    double real, img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }
    public static Complex sum(Complex N1, Complex N2){
        Complex temp = new Complex(0,0);
        temp.real= N1.real+ N2.real;
        temp.img= N1.img+ N2.img;

        return temp;
    }
    public static Complex differ(Complex N1, Complex N2){
        Complex temp = new Complex(0,0);
        temp.real= N1.real- N2.real;
        temp.img= N1.img- N2.img;

        return temp;
    }
    public static Complex product(Complex a, Complex b)
    {
        return new Complex(((a.real * b.real) - (a.img * b.img)),((a.real * b.img) + (a.img * b.real)));
    }

    public static void main(String[] args) {
        Complex N1 = new Complex(10,7);
        Complex N2 = new Complex(4,6);
        Complex temp=sum(N1,N2);
        Complex temp2=product(N1,N2);
        Complex temp3=differ(N1,N2);
        System.out.println("Sum is "+temp.real+"+"+temp.img+"i");
        System.out.println("Product is "+temp2.real+"+"+temp2.img+"i");
        System.out.println("Product is "+temp3.real+"+"+temp3.img+"i");

    }

}
