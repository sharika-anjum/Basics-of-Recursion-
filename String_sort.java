package com.company;

import java.util.Scanner;

public class String_sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum no. of names you want to enter");
        int l = sc.nextInt();
        String n[] = new String[l];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter all the strings string");
        for (int i = 0; i < l; i++) {
            n[i] = scan.nextLine();
        }
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (n[i].compareTo(n[j]) > 0) {
                    String temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.println("Sorted string lists are:");
        for (int i = 0; i < l; i++) {
            System.out.println(n[i]);
        }
    }
}
