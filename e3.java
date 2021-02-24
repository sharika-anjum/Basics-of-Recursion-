package com.company;

public class e3 {
    public static void main(String args[]) {
        try {
            String s = "Sharika";
            System.out.println("Result = " + s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBound Exception");
        }
    }
}
