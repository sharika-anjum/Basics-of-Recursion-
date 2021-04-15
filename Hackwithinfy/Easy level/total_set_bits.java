package com.company;
import java.io.*;

public class total_set_bits {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())+1;
        int pow=2;
        int sum=n/2;
        while (pow <= n){
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
        }
        System.out.println(sum);
    }
}
