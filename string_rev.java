package com.company;
import java.util.Scanner;

public class string_rev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String n = sc.nextLine();
        String s="";
        for(int i = n.length()-1;i>=0;i--){
            s=s+n.charAt(i);
        }
        System.out.println("The reversed string is \n"+s);
    }
}
