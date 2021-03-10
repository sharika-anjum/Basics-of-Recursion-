package com.company;
import java.util.*;

public class String_extract {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println("Enter a position of extracting a character from the string between 0 to "+s.length());
        int n = sc.nextInt();
        System.out.println("The character at that position is "+s.charAt(n));
    }

}
