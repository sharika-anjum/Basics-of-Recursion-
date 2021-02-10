package com.company;

public class shapess {
    public static void main(String args[]){
        circle c = new circle();

        square s = new square();
        System.out.println("Area of the circle in integer is = "+c.area());
        System.out.println("Area of the square in integer is = "+s.area());
        s.Buzz();
        c.sleep();
        c.Buzz();
    }
}
