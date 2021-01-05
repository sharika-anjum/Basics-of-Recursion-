package com.company;

import java.util.Stack;

public class Stackss_ {

    public static void main(String args[]){

        Stack stack = new Stack();   //Non generic
        stack.push(2);
        stack.push('a');
        stack.push("Hello");

        System.out.println(stack);
        System.out.println(stack.peek()); //Getting the topmost value

        Stack <Integer> stack1 = new Stack();   //generic
        stack1.push(2);
        stack1.push(3);
        stack1.push(10);

        System.out.println(stack1);
        System.out.println(stack1.peek()); //Getting the topmost value

        //poping
        System.out.println(stack.pop());

        //getting the size of the stack
        System.out.println(stack.size());

        //search the index location of the stack
        System.out.println(stack1.search(10));

        //is empty or not
        System.out.println(stack1.empty());

        //adding new element in stack
        stack.add(23);
        System.out.println(stack);

        //adding new element in a particular index
        stack.add(2,100);
        System.out.println(stack);

        //adding an entire stack in a new stack
        stack.addAll(stack1);
        System.out.println(stack);

        Stack <Integer> stack2 = new Stack();   //generic
        stack2.push(21);
        stack2.push(31);
        stack2.push(101);

        //adding an entire stack in a particular index
        stack.addAll(1,stack2);
        System.out.println(stack);

        //Like this there are several other functions to implement with stacks




    }

}
