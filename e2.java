package com.company;

public class e2 {
    public static void main(String args[]) {
        try {
            String s = null;
            System.out.println("Result = " + s.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
}
