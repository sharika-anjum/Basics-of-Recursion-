package com.company;

public class MyChildClass extends MyParentClass {

    @Override
    public void just_a_Method() {
        System.out.println("Child class method");
    }
    @Deprecated
    public void anyMethodHere(){
        System.out.println("Deprecated func");
    }
    @SuppressWarnings("deprecation")
    public void useanyMethodHere() {
        anyMethodHere();
        System.out.println("Suppress Warnings");
    }
    public static void main(String[] args){
        MyChildClass ob = new MyChildClass();
        ob.just_a_Method();
        ob.useanyMethodHere();
    }
}

