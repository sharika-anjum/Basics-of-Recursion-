package com.company;
import java.util.*;
import java.lang.*;
public class Quadratic {


    public static void main(String args[]) {
        double a, b, c = 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("\nEnter the values of a ,b ,c : ");
        a = scr.nextDouble();
        b = scr.nextDouble();
        c = scr.nextDouble();
        roots(a, b, c);
    }
    public static void roots(double a,double b,double c){
        double d=(b*b)-(4*a*c);
        double r1,r2 =0.0;
        if(d==0)
        {
            System.out.println("Roots are real and Equal");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.format("Root 1=%.2f and Root 2=%.2f",r1,r2);
        }
        else if(d>0)
        {
            System.out.println("Roots are real and Un-equal");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.format("Root 1=%.2f and Root 2=%.2f",r1,r2);
        }
        else {
            System.out.println("Roots are imaginary");
            double real = -b / (2 * a);
            double img = Math.sqrt(-d) / (2 * a);
            System.out.format("Root 1 is :%.2f+%.2fi",real,img);
            System.out.format("Root 1 is :%.2f-%.2fi",real,img);
        }
    }
}

