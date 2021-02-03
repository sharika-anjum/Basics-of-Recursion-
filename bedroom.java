package com.company;

public class bedroom extends Room {
    int height;
    bedroom(int a,int b,int h){
        super(a,b);
        height = h;
    }
    void volume(){
        System.out.println("Volume"+length*breadth*height);
    }
}
