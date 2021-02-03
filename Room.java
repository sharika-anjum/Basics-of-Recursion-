package com.company;

public class Room {
    int length,breadth;
    Room(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        int area=length*breadth;
        System.out.println("Area="+area);
    }
}
