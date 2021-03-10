package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_integer_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer with commas in between ");
        String s = sc.nextLine();
        int c=0;
        StringTokenizer st = new StringTokenizer(s,",");
        while(st.hasMoreTokens()){
            String temp=st.nextToken();
            int n =Integer.parseInt(temp);
            System.out.println(n);
            c=c+n;

        }
        System.out.println("The sum of the integers in the string is "+c);
    }
}
