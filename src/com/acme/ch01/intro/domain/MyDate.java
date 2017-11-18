package com.acme.ch01.intro.domain;

public class MyDate {
    private int day;
    private int year;
    private int month;

    public MyDate(){}

    //use the parameters of m, d and y to set the three attributes
    public MyDate(int m, int d, int y){

        day = d;
        month = m;
        year = y;
    }

    //return a string with month/day/year like 01/20/1964
    public String toString(){
        String currentDate = day + "/" + month + "/" + year;
        return currentDate;
    }

    //set the MyDate attributes with m, d, and y values here!
    public void setDate(int m, int d, int y){
        day = d;
        month = m;
        year = y;
    }

}
