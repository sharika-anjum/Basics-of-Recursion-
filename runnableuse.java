package com.company;

class Ab implements Runnable{
public void run(){
    try{
        for(int i = 0;i<10;i++)
        {
            Thread.sleep(1000);
            System.out.println("Good Morning");
        }
        } catch(Exception e){
        System.out.println(e);}
    }
}

class Bc implements Runnable{
public void run(){
    try{
        for(int i = 0;i<10;i++){
            Thread.sleep(2000);
            System.out.println("Hello");}
        } catch(Exception e){
            System.out.println(e);}
    }
}

class Cd implements Runnable{
public void run(){
    try{
        for(int i = 0;i<10;i++){
            Thread.sleep(3000);
            System.out.println("Welcome");}
        } catch(Exception e){
        System.out.println(e);}
    }
}

public class runnableuse {
    public static void main(String args[]){
        Ab a = new Ab();
        Bc b = new Bc();
        Cd c = new Cd();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        Thread t3=new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }

}
