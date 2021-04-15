package com.company;
import java.io.*;

public class bits_flipping_count {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp=br.readLine();
        String num[]=inp.split(" ");
        int arr[] = new int[2];
        arr[0]=Integer.parseInt(num[0]);
        arr[1]=Integer.parseInt(num[1]);
        int count=0;
        while (arr[0] > 0 || arr[1] > 0)
        {

            // Store the last bits in a
            // as well as b
            int last_bit_1 = arr[0] & 1;
            int last_bit_2 = arr[1] & 1;

            // If the current bit is not same
            // in both the integers
            if (last_bit_1 != last_bit_2)
                count++;

            // Right shift both the integers by 1
            arr[0] = arr[0] >> 1;
            arr[1] = arr[1] >> 1;
        }
        System.out.println(count);
    }
}
