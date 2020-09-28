package com.company;

public class fibonacci {
    public static void main(String[] args)
    {
        int pairs = fib(12);
        System.out.println(pairs);

    }
    public static int fib(int n){

        if(n==0 || n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
