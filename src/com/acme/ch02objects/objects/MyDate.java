package com.acme.ch02objects.objects;

public class MyDate {
    int day;
    int year;
    int month;

    {
        System.out.println("inside initialisation block...");
        day = 1;
        month = 1;
        year = 2000;
    }

    public MyDate(){}

    // use the parameters of m, d and y to set the three attributes
    public MyDate(int m, int d, int y){
        System.out.println("inside construction block \n");
        day = d;
        month = m;
        year = y;
    }

    {
        System.out.println("inside another initialisation block...");
        day = 31;
        month = 12;
        year = 2099;
    }

    // return a string with month/day/year like 01/20/1964
    public String toString(){
        return new String(day + "/" + month + "/" + year);
    }

    // set the MyDate attributes with m, d, and y values here!
    public void setDate(int m, int d, int y){
        day = d;
        month = m;
        year = y;
    }

}
