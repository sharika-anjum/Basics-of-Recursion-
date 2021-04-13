package com.company;
import java.io.*;

//The idea is a can be paired with (K — a%K) % K. Now we have to find the same for each a present in the given array.

public class division_sum_pair {
    static int countKdivPairs(int A[], int n, int K)
    {
        // Create a frequency array to count
        // occurrences of all remainders when
        // divided by K
        int []freq = new int[K];

        // To store count of pairs.
        int ans = 0;

        // Traverse the array, compute the remainder
        // and add k-remainder value hash count to ans
        for (int i = 0; i < n; i++)
        {
            int rem = A[i] % K;

            // Count number of ( A[i], (K - rem)%K ) pairs
            ans += freq[(K - rem) % K];

            // Increment count of remainder in hash map
            freq[rem]++;
        }

        return ans;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String inpnum[]=input.split(",");
        int num[] = new int[inpnum.length];
        for(int i=0;i<inpnum.length;i++){
            num[i]=Integer.parseInt(inpnum[i]);
        }
        int K = Integer.parseInt(br.readLine());
        System.out.println(countKdivPairs(num, num.length, K));
    }
}
