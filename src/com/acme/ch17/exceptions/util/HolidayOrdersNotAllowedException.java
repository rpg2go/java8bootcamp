package com.acme.ch17.exceptions.util;

import com.acme.ch17.exceptions.domain.MyDate;

public class HolidayOrdersNotAllowedException extends Exception {
	
	public HolidayOrdersNotAllowedException(MyDate d) {
		super("Order are not allowed to be created on " + d);
		super.printStackTrace();
		System.out.println(super.getMessage());
	}

}
