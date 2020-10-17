package com.company;

import java.util.*;

public class arraylist{

    public static void main(String[] args){

        ArrayList mylist = new ArrayList();// resembles like a python list with many data-types
        mylist.add(1);
        mylist.add("hello");
        mylist.add(true);

        System.out.println(mylist);

        //Making a generic arraylist with having a particular datatype only
        ArrayList<String> mylist1 = new ArrayList();// resembles like a python list with many data-types
        mylist1.add("hello");
        mylist1.add("World");

        System.out.println(mylist1);

        //Directly creating arraylist from arrays.tolist()
        ArrayList<String> mylist2 = new ArrayList<>(Arrays.asList("Hello","World"));
        System.out.println(mylist2);
        
        //adding items using addall
        mylist1.addAll(mylist2);
        System.out.println(mylist1);
        
        //Access Items
        
        System.out.println(mylist.get(1)); //getting the second item in mylist

        for(int i=0;i<mylist.size();i++){ //accessing items using for loop
            System.out.println(mylist.get(i));
        }

        for(String item: mylist2){    //foreach loop : drawback is it will work with arraylist that has a single datatype values stored in it
            System.out.println(item);
        }

        //Editting
        mylist.set(1,"Sharika");
        System.out.println(mylist);

        //Remove

        mylist.remove(2); //using index no.
        mylist.remove("Sharika"); //using value
        System.out.println(mylist);

        mylist1.removeAll(mylist2);  //removing all the items of mylist2 at once that are present in mylist1
        System.out.println(mylist1);

        mylist2.clear(); //all items clear at once
        System.out.println(mylist2);

        //Clear is faster than remove or removeAll

        ArrayList<Integer> mylist3 = new ArrayList<>(Arrays.asList(2,8,54,6));
        System.out.println(mylist3);

        //Operations
        System.out.println(mylist3.size()); //size operation

        Collections.sort(mylist3); //sorting in ascending
        System.out.println(mylist3);
        Collections.sort(mylist3,Collections.reverseOrder()); //sorting in descending
        System.out.println(mylist3);

        //If the arraylist is in String or character then the sorting will happen alphabetically

        Integer[] arr = new Integer[mylist3.size()]; //arraylist to array
        mylist3.toArray(arr);

        System.out.println(mylist3.contains(100)); //returns boolean
        System.out.println(mylist3.contains(54));

        System.out.println(mylist3.indexOf(6)); //returns value

        System.out.println(mylist2.isEmpty()); //returns boolean
        System.out.println(mylist3.isEmpty());


    }
}
