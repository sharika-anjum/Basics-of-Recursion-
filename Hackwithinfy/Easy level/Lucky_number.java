package com.company;
import java.io.*;

public class Lucky_number {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            String inp = br.readLine();
            String inpnum[]=inp.split(" ");
            int L = Integer.parseInt(inpnum[0]);
            int R = Integer.parseInt(inpnum[1]);
            int c=0;
            for(int j=L;j<=R;j++){
                if(islucky(j)){
                    c++;
                }
            }
            System.out.println(c);
        }

    }
    public static boolean islucky(int num){
        if(num==1){
            return false;
        }
        int fact=2;
        while(fact<=num/2){
            if(num%(fact*fact)==0){
                return false;
            }
            fact++;
        }
        return true;
    }
}
