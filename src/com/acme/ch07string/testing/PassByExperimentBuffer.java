package com.acme.ch07string.testing;

import com.acme.ch07string.domain.MyDate;

public class PassByExperimentBuffer {
	
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
		
		StringBuffer currentdate = new StringBuffer(dmy.toString());
		System.out.println("Test Pass Primitive before " + currentdate);
		passString(currentdate);
		System.out.println("Test Pass Primitive after" + currentdate );
		
	}
	
	public static void passObject(MyDate d) {
		d.day = 15;
	}
	
	public static void passPrimitive(int nbr) {
		nbr = 2014;
	}
	
	public static void passString(StringBuffer str) {
		System.out.println("Given string value " + str);
		
		int pos = str.lastIndexOf("/");
		
		if (pos >= 0) {
			str = str.append(str.substring(0, pos - 1));
		}
		
		str = str.append("2014");
		
		System.out.println("Change string value " + str);
		
	}
}
