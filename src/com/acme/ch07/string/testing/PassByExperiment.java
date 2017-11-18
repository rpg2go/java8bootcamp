package com.acme.ch07.string.testing;

import com.acme.ch07.string.domain.MyDate;

public class PassByExperiment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Pass Object ");
		MyDate dmy = new MyDate(1, 11, 2017);
		System.out.println(dmy.toString());
		
		System.out.println("Test Pass Object after");
		passObject(dmy);
		System.out.println(dmy.toString());
		
		System.out.println("Test Pass Primitive before ");
		int crtYear = dmy.getYear();
		System.out.println(crtYear);
		
		System.out.println("Test Pass Primitive after");
		passPrimitive(crtYear);
		System.out.println(crtYear);
		
		String currentdate = dmy.toString();
		System.out.println("Test Pass Primitive before " + currentdate.toString());
		passString(currentdate);
		System.out.println("Test Pass Primitive after " + currentdate.toString());
		 
	}
	
	public static void passObject(MyDate d) {
		d.day = 15;
	}
	
	public static void passPrimitive(int nbr) {
		nbr = 2014;
	}
	
	public static void passString(String str) {
		System.out.println("Given string value " + str);
		
		int pos = str.lastIndexOf('/');
		
		if (pos >= 0) {
			str = str.substring(0, pos - 1) + "2015";
		}
		
		System.out.println("Change string value " + str);
		
	}
}
