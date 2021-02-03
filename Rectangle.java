package com.company;
import java.util.*;

public class Rectangle
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter length: ");
        int l=scan.nextInt();

        System.out.println("Enter breadth: ");
        int b=scan.nextInt();
        Area_rect Rect = new Area_rect();
        Area_rect Rect1 = new Area_rect(l);
        Area_rect Rect2 = new Area_rect(l,b);
        System.out.println("Area of First Rectangle is : "+Rect.area());
        System.out.println("Area of Second Rectangle is : "+Rect1.area());
        System.out.println("Area of Third Rectangle is : "+Rect2.area());
    }
}

