package com.company;

import java.util.Stack;
public class BalancedPara {
    public static void main(String args[]){
        String expression = "{(a+b) (+ (c+d)}[";

        balanced(expression);
    }

    public static void balanced(String expression){
        Stack <Character> stack = new Stack<>();

        for(int i = 0;i<expression.length();i++){
            char ch = expression.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.size()==0){
                    System.out.println("Not Balanced");
                    return;
                }else{
                    if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        System.out.println("Not Balanced");
                        return;
                    }
                }
            }else if(ch=='}') {
                if (stack.size() == 0) {
                    System.out.println("Not Balanced");
                    return;
                } else {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        System.out.println("Not Balanced");
                        return;
                    }
                }
            }else if(ch==']') {
                if (stack.size() == 0) {
                    System.out.println("Not Balanced");
                    return;
                } else {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        System.out.println("Not Balanced");
                        return;
                    }
                }
            }
        }

        if(stack.size()==0){
            System.out.println("Balanced");
            return;
        }else{
            System.out.println("Not Balanced");
            return;
        }
    }
}
