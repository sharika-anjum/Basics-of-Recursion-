package com.company;

public class e6 {
    public static void main(String args[]) {
        try {
            int b = 0;
            int d[] = new int[5];
            d[6] = 10/b;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
        finally{
            System.out.println("XYZ");
        }
    }

}
