package com.acme.ch04.packaging.utils;

public class MyDate {
    public int day;
    private int year;
    protected int month;
    int numberOfDays;

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
