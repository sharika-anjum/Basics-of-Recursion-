package com.company;

public class e1 {
    public static void main(String args[]) {
        try {
            int d[] = new int[5];
            d[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
    }

}
