package com.company;

public class exceptions {
    public static void main(String args[]){
        try {
            int a = 5, b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }

    }
}
