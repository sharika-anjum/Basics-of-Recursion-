package com.company;
import java.lang.*;
public class shape_area {
    void area(int r){
        System.out.println("Area of the circle"+(22/7)*Math.pow(r,2));
    }
    void area(int a,int b){
        System.out.println("Area of the rectangle"+a*b);
    }
    void area(double s){
        System.out.println("Area of the square"+s*s);
    }
}
