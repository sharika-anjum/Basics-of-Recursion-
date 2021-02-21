package com.company;

public class Clockwise {
    public void clock_rotate(int arr[],int n){
        System.out.print(arr[n-1]+" ");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        Clockwise ob = new Clockwise();
        ob.clock_rotate(arr,arr.length);
    }
}
