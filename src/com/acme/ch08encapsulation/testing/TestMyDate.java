package com.acme.ch08encapsulation.testing;


import com.acme.ch08encapsulation.domain.MyDate;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(13, 11, 2017);
		System.out.println("Today is " + d1);
		
		MyDate d2 = new MyDate(32, 11, 2017);
		System.out.println("Next day is " + d2);
		
		MyDate d3 = new MyDate(12, 32, 2017);
		System.out.println("Next day is " + d3);
		
		
	}

}
