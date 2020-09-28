package com.company;

public class multiplyrecur {
    public static void main(String[] args)
    {
        int result = multiply(5,4);
        System.out.println(result);
    }
    public static int multiply(int a, int b){
        if(b==1){
            return a;
        }else{
            return a+multiply(a,b-1);
        }
    }
}


//time complexity is o(n)
//space complexity is o(n)