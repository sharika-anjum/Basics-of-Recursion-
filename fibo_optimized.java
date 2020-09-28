package com.company;

//optimized code with increased space complexity and reduced time complexity
public class fibo_optimized {
    public static void main(String[] args)
    {
        int pairs = fib(10,new int[49]);
        System.out.println(pairs);

    }
    public static int fib(int n, int[] memo){

        if(n==0 || n==1){
            return 1;
        }else{
            if(memo[n]==0) {
                memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
            }

            return memo[n];
        }
    }
}
