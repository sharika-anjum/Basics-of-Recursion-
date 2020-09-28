package com.company;

public class powerof2 {
    public static void main(String[] args)
    {
        int result = powerof(21);
        System.out.println(result);
    }
    public static int powerof(int n){

        if(n==0){
            return 0;
        }else if(n==1){
            System.out.println(1);
            return 1;
        }
        else{
            int ret=powerof(n/2);
            int current = ret*2;
            System.out.println(current);
            return current;
        }
    }
}
