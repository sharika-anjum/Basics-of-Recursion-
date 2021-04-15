package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class special_set_bits {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())+1;
        int pow=2;
        int sum=n/2;
        int i = 1;
        while (pow <= n && isprime(i)){
            // Total count of pairs of 0s and 1s
            int totalPairs = n / pow;

            // totalPairs/2 gives the complete
            // count of the pairs of 1s
            // Multiplying it with the current power
            // of 2 will give the count of
            // 1s in the current bit
            sum += (totalPairs / 2) * pow;
            sum += (totalPairs % 2 == 1) ?
                    (n % pow) : 0;

            // Next power of 2
            pow <<= 1;
            i++;
        }
        System.out.println(sum);
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        if(n<=3){
            return true;
        }
        if(n%2==0 && n%3==0)
            return false;
        for(int i=5;i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
