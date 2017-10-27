package com.acme.ch02objects.objects;

public class TestMyDate {
    public static void main(String[] args){
        MyDate date1 = new MyDate(11,30,1918);
        MyDate date2 = new MyDate();
        date2.day = 25;
        date2.month = 12;
        date2.year = 2017;
        MyDate date3 = new MyDate();
        date3.setDate(4,21,1968);
        String str1 = date1.toString();
        String str2 = date2.toString();
        String str3 = date3.toString();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
