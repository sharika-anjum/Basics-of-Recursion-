package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
public class duplicate_characters {
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        duplichar(S);
    }
    public static void duplichar(String S){
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<S.length();i++){
            if (m.containsKey(S.charAt(i))) {
                m.put(S.charAt(i), m.get(S.charAt(i)) + 1);
            } else {
                m.put(S.charAt(i), 1);
            }
        }
        int c = 0;
        for(Map.Entry<Character,Integer> p:m.entrySet()){
            if (p.getValue() > 1) {
                System.out.println(p.getKey()+" "+p.getValue());
                c++;
            }
        }
        if (c == 0)
            System.out.println("No such characters");
    }
}
