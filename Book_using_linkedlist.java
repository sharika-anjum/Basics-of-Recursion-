package com.company;

import java.util.Iterator;
import java.util.LinkedList;


public class Book_using_linkedlist {
    public static void main(String[] args){
        LinkedList<Book> list = new LinkedList<Book>();

        Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2 = new Book(102,"abc","xyz","tyk",8);
        Book b3 = new Book(103,"Ramiz","Shamsuddin","Mafuza",10);
        list.add(b1);
        list.add(b2);
        list.add(b3);

        //Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}
