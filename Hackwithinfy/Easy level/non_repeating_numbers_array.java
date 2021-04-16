package com.company;
import java.io.*;
import java.util.*;

public class non_repeating_numbers_array {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp=br.readLine();
        String[] inpnum = inp.split(" ");
        int arr[]=new int[inpnum.length];
        for(int i=0;i<inpnum.length;i++){
            arr[i] = Integer.parseInt(inpnum[i]);
        }
        nonrepeating(arr);
    }
    public static void nonrepeating(int arr[]) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i]) == 1) {
                System.out.println(arr[i]);
                c++;
            }
        }
        if (c == 0)
            System.out.println("-1");
    }
}
