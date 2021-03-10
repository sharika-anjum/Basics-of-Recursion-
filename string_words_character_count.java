package com.company;

import java.util.Scanner;

public class string_words_character_count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line of text");
        String n = sc.nextLine();
        n = n.trim();
        int c = 0;
        System.out.println("No. of charcaters present is : " + n.length());
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == ' ') {
                c++;
            }
        }
        System.out.println("No. of words present is : " + (c+1));
    }
}
