package com.acme.ch12.lambda.test;

import com.acme.ch12.lamda.domain.Liquid;
import com.acme.ch12.lamda.domain.UnitOfMeasureType;
import com.acme.ch12.lamda.domain.MyDate;

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(11,01,2017);
		MyDate date2 = new MyDate(11,01,2017);
		MyDate date3 = new MyDate(12,11,2017);
	
		System.out.println("Are the dates objects equals ? date 1 == date 3 ? " + date1.equals(date3));
		
		date3 = date2;
		System.out.println("Are the dates objects equals ? date 2 == date 3 ? " + date2.equals(date3));
		
		Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER, false, 250, 6);
		System.out.println("Are the two objects equals ? date 1 == glue ? " + date1.equals(glue));
		
		
	}

}
