package com.company;

public class Area_rect {

    int length,breath;
    Area_rect(int x,int y)
    {
        length=x;
        breath=y;
    }
    Area_rect(int x)
    {
        length=x;
        breath=10;
    }
    Area_rect()
    {
        length=5;
        breath=10;
    }
    float area()
    {
        return(length*breath);
    }
}

