package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class selection_of_kits {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String inp = br.readLine();
        String inpnum[] = inp.split(" ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(inpnum[i]);
        }
        Arrays.sort(arr);
        int sum = IntStream.of(arr).sum();
        int BOB=arr[n-1]; int c=1;
        for(int i=n-2;i>0;i--){
           if(BOB>sum/2){
               break;
           }
           BOB += arr[i];
           c++;
        }
        System.out.println(c);
    }
}
