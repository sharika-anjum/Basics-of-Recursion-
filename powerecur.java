package com.company;

public class powerecur {
    public static void main(String[] args)
    {
        int result = power(2,4);
        System.out.println(result);
    }
    public static int power(int a, int b){
        if(b==1){
            return a;
        }else{
            return a*power(a,b-1);
        }
    }
}
