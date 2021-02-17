package com.company;

public class client implements callback{
    public void fun(){
        System.out.println("Interface function is being used");
    }
    void noninterfun(){
        System.out.println("Not an interface function");
    }
    public static void main(String args[]){
        client c = new client();
        c.fun();
        c.noninterfun();
    }
}
