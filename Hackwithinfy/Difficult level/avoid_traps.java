package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class avoid_traps {
    static int max = 100005;
    static boolean prime[] = new boolean[max];
    static int cumPrime[] = new int[max];

    public static void prime() {

        prime[0] = prime[1] = true;

        for (int i = 2; i * i < max; i++) {
            if (!prime[i]) {
                for (int j = i * i; j < max; j+=i)
                    prime[j] = true;
            }
        }

        for (int i = 1; i < max; i++)
        {
            //System.out.println(prime[i]);
            cumPrime[i] = cumPrime[i - 1] + (prime[i] ? 0 : 1);
        }

    }

    public static void solve(int r1, int r2, int n, char c[]) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        int ans[] = new int[n + 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        if(c[0]=='#')
            ans[1]=0;

        for (int i = 1; i <= n; i++) {

            if(ans[i]!=Integer.MAX_VALUE) {
                for (int j = 1; j <= 2; j++)
                    if ((i + j) <= n && c[i + j - 1] == '#' && ans[i + j] > ans[i] + 1)
                        ans[i + j] = ans[i] + 1;

                int a = cumPrime[i];
                //	System.out.println("a "+a);
                if ((a *r2) >= (r1 *i))
                    if ((i + a) <= n && c[i + a - 1] == '#' && ans[i + a] > ans[i] + 1)
                        ans[i + a] = ans[i] + 1;

                //System.out.println(ans[i]);
            }
        }

        System.out.println(ans[n]==Integer.MAX_VALUE?"No way!":ans[n]);

    }

    public static void main(String[] args) {
        FasScanner sc=new FasScanner();
        prime();
        int t=sc.nextInt();
        while(t-->0) {
            int r1=sc.nextInt(),r2=sc.nextInt();
            int n=sc.nextInt();
            char c[]=sc.next().toCharArray();
            solve(r1, r2, n, c);
        }

    }

    static class FasScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer("");

        String next() {
            while (!stringTokenizer.hasMoreTokens()) {
                try {
                    stringTokenizer = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            return stringTokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

    }

}
