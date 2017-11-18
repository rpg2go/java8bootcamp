package com.acme.ch04.packaging.testing;

import com.acme.ch04.packaging.utils.MyDate;

public class TestMyDate {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(11, 11, 1918);
        //date1.day = 31;
        //date1.month = 4;
        System.out.println(date1.toString());

        MyDate date2 = new MyDate(12, 25, 1985);

        MyDate date3 = new MyDate();
        date3.setDate(4, 21, 1968);

        String str1 = date1.toString();
        String str2 = date2.toString();
        String str3 = date3.toString();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}