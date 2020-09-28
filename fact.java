package com.company;

public class fact {
    public static void main(String[] args)
    {
        int result = fact(5);
        System.out.println(result);
    }
    public static int fact(int a){
        if(a==1){
            return a;
        }else{
            return a*fact(a-1);
        }
    }
}
