package com.company;

class One extends Thread{
    synchronized public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                System.out.println("Good Morning");
            }
        }catch(Exception e){}
    }
}

class Two extends Thread{
    synchronized public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                sleep(2000);
                System.out.println("hello");
            }
        }catch(Exception e){}
    }
}

class three extends Thread{
    synchronized public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                sleep(3000);
                System.out.println("Welcome");
            }
        }catch(Exception e){}
    }
}

public class All{
    public static void main(String args[]){
        One gm = new One();
        Two h = new Two();
        three w = new three();
        gm.start();
        h.start();
        w.start();
    }


}