package com.acme.ch17.exceptions.util;

public class InvalidDateException extends Exception {
	public InvalidDateException(int day, int month, int year) {
		super("Attempting to create a non-valid date: " + day + "/" + month + "/" + year);
		super.printStackTrace();
		//System.out.println(super.getMessage());
	}

}
