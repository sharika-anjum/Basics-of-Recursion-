package com.company;

import java.util.Stack;

public class texteditor {

    public static void main(String args[]){

        String input = "Hello";
        String ops = "uuur";

        String result = editor(input,ops);
        System.out.println(result);
    }

    public static String editor(String input, String ops){

        Stack <Character> undo = new Stack();
        Stack <Character> redo = new Stack();

        //stroing the entire string in a stack
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            undo.push(ch);
        }

        for(int j =0;j<ops.length();j++){
            char curr = ops.charAt(j);
            if(curr == 'u'){  //undoing
                char temp = undo.pop();
                redo.push(temp);
            }
            else{  //redoing
                char temp = redo.pop();
                undo.push(temp);
            }
        }

        //Now we gotta reverse the string

        String result  = "";
        while(!undo.isEmpty()){
            result = undo.pop() + result;
        }

        return result;

    }

    //Time complexity - o(n)
    //Memory complexity - o(n)


}
