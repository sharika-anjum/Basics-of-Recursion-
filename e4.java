package com.company;
import java.io.*;

public class e4 {
    public static void main(String args[])
    {
        try {
            File f = new File("C:// file.txt");

            FileReader fr = new FileReader(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}
