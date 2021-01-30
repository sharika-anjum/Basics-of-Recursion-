package com.company;

public class reversestring {


    /* Function to reverse String from
     start to end*/
    static void rvereseArray(String s,
                             int start, int end)
    {
        char temp;
        int len = end+1;
        char[] s_rev = s.toCharArray();
        while (start < end)
        {
            temp = s_rev[start];
            s_rev[start] = s_rev[end];
            s_rev[end] = temp;
            start++;
            end--;
        }
        s = new String(s_rev);
        System.out.print("Reversed string is \n");
        printArray(s, len);
    }

    /* Utility that prints out an
    string on a line */
    static void printArray(String s,
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(s.charAt(i) + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        String str = "Sharika";
        int l = str.length();
        printArray(str, l);
        rvereseArray(str, 0, l-1);


    }
}

