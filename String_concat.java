package com.company;
import java.util.*;

public class String_concat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        String n = sc.nextLine();
        System.out.println("Enter the 2nd string");
        String m = sc.nextLine();
        System.out.println("The concatenated string is "+n.concat(m));
    }
}
