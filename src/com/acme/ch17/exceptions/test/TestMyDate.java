package com.acme.ch17.exceptions.test;

import com.acme.ch17.exceptions.domain.Liquid;
import com.acme.ch17.exceptions.domain.UnitOfMeasureType;
import com.acme.ch17.exceptions.util.InvalidDateException;
import com.acme.ch17.exceptions.domain.MyDate;

public class TestMyDate {

	public static void main(String[] args) throws InvalidDateException {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(11,01,2017);
		MyDate date2 = new MyDate(11,01,2017);
		MyDate date3 = new MyDate(12,11,2017);
	
		MyDate date4 = new MyDate(31,11,2017);
		MyDate date5 = new MyDate(32,11,2017);
		MyDate date6 = new MyDate(25,13,2017);
		
		System.out.println("Are the dates objects equals ? date 1 == date 2 ? " + date1.equals(date2));
		System.out.println("Are the dates objects equals ? date 1 == date 3 ? " + date1.equals(date3));
		
		date3 = date2;
		System.out.println("Are the dates objects equals ? date 2 == date 3 ? " + date2.equals(date3));
		
		Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER, false, 250, 6);
		System.out.println("Are the two objects equals ? date 1 == glue ? " + date1.equals(glue));
		
		
	}

}
