package com.demo;
interface Addition{
    int add(int a, int b);
}
interface Subtract{
    int sub(int a, int b);
}
interface Product{
    int mul(int a, int b );
}
interface Division{
    double div(double a, double b);

}
public class Calculator {
    public static void main(String[] args) {
        Addition ad=(int a, int b)->{
            return (a+b);
        };
        System.out.println(ad.add(5,10));
        Subtract sb=(int a, int b)->{
            return (a-b);
        };
        System.out.println(sb.sub(5,10));
        Product pd =(int a, int b)->{
            return (a*b);
        };
        System.out.println(pd.mul(5,10));

        Division dv =(double a, double b)->{
            if(b==0){
                return 0;
            }
            else{
                return a/b;
            }
        };
        System.out.println(dv.div(5,10));
    }
}
