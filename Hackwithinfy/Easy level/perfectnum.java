package com.company;
import java.io.*;

public class perfectnum {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            int N = Integer.parseInt(br.readLine());
            if(N==1){
                System.out.println("NO");
                continue;
            }
            int sum=1;
            int c = 2;
            while(c*c<=N){
                if(N%c==0){
                  sum+=c+(int)(N/c);
                }
                c++;
            }
            if(sum==N){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

}
