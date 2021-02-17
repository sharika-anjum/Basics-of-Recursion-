package com.company;

public class Dynamic_method_dispatch {
    public static void main(String args[]){
        Figure f = new Rrectangle();
        f.area();

        Figure f2 = new Ccircle();
        f2.area();

        Figure f3 = new TRiangle();
        f3.area();

    }
}
