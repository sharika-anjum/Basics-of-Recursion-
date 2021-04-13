package com.company;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Distribute_the_weights {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp=br.readLine();
        String inpnum[]=inp.split(" ");
        int N = Integer.parseInt(inpnum[0]);
        int M = Integer.parseInt(inpnum[1]);
        int arr[] = new int[N];
        inp=br.readLine();
        inpnum=inp.split(" ");
        for(int i =0;i<N;i++){
            arr[i]=Integer.parseInt(inpnum[i]);
        }
        Arrays.sort(arr);
        int k = arr[N-1];
        while(k<=IntStream.of(arr).sum()){
            int curr_sub_array=arr[0];
            int subs = 1;
            boolean flag = true;
            for(int i = 1;i<N;i++){
                if(arr[i]+curr_sub_array>k){
                    curr_sub_array=arr[i];
                    subs++;
                }
                else{
                    curr_sub_array+=arr[i];
                }
                if(subs>M){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(k);
                break;
            }
            k++;
        }
    }
}
