package com.company;

public class Intersection_Union {
    public static void main(String args[])
    {
        Union ob = new Union();
        Intersection ob1 = new Intersection();
        int arr1[] = { 1, 2, 2, 2, 3 };
        int arr2[] = { 2, 3, 4, 5 };

        ob.printUnion(arr1, arr2,arr1.length,arr2.length);
        System.out.println("\n");
        ob1.printIntersection(arr1,arr2,arr1.length,arr2.length);
    }

}
