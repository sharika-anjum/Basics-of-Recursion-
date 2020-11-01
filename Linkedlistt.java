package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistt {
    public static void main(String[] args)
    {
        LinkedList l =  new LinkedList(); //for no restriction of datatype in the linkedlist
        LinkedList<Integer> list =  new LinkedList(); //for storing only interger type of data in our linkedlist

        //insertion elements in the linkedlist
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        System.out.println(list);
        //insert at a specific index
        list.add(1,100);
        list.add(3,4); //can have same value
        System.out.println(list);

        int a = 9;

        //deletion
        list.remove(4); //removing from a specific index
        System.out.println(list);
        list.removeFirstOccurrence(4);//removes the first occurrence of the object
        System.out.println(list);
        list.removeFirst();//removes the first element
        System.out.println(list);
        list.removeLastOccurrence(4);//removes the last occurrence of the object
        System.out.println(list);

        //count
        System.out.println(list.size());

        //copying one linkedlist to another
        l.addAll(list);
        System.out.println(list);

        //removing an entire linkedlist
        list.clear();
        System.out.println(list);

        //reverse a linkedlist
        Iterator i = l.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }

}
