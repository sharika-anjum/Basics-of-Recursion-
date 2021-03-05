package com.company;

class Myyexception extends Exception {
    String s;
    Myyexception(String ss){
        s=ss;
    }
    public String toString(){
        return("Exception Occurred. Work properly");
    }
}

public class Myexception{
    public static void main(String args[]){
        try{
            throw new Myyexception("My type of error");
        }
        catch(Myyexception exp){
            System.out.println(exp);
        }
    }
}

