package com.acme.ch17.exceptions.domain;

import com.acme.ch17.exceptions.util.InvalidDateException;

public class MyDate implements Comparable<MyDate>{
	private int day;
	private int year;
	private int month;
	
	int numberOfDays;

	public MyDate() {
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) throws InvalidDateException {
		valid2 (day, this.month, this.year);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) throws InvalidDateException {
		valid2 (this.day, month, this.year);
	}

	public void setYear(int year) throws InvalidDateException {
		valid2 (this.day, this.month, year);
	}
	
	public int getYear() {
		return this.year;
	}

	// use the parameters of m, d and y to set the three attributes
	public MyDate(int d, int m, int y) throws InvalidDateException {
		valid2 (this.day, month, this.year);
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public static void leapYears() {

		for (int i = 1752; i <= 2020; i++) {
			if (i % 4 == 0) {
				if (i % 100 != 0) {
					System.out.println("The year " + i + " is a leap year");
				} else if (i % 400 == 0 && i % 100 == 0) {
					System.out.println("The year " + i + " is a leap year");
				}
			}
		}
	}

	public boolean valid(int day, int month, int year) {
		if (day < 1 || day > 31 || month < 1 || month > 12) {
			System.out.println("Attempting to create a non-valid date: " + day + "/" + month + "/" + year);
			return false;
		}
		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				return day <= 30;
			case 2: {
				if (day <= 28) {
					return true;
				} else if (day == 29 && year % 4 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public void valid2(int day, int month, int year) throws InvalidDateException {
		if (day < 1 || day > 31 || month < 1 || month > 12) {
			throw new InvalidDateException(day,month,year);
		}
		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				if (!(day <= 30)) {
					throw new InvalidDateException(day,month,year);
				}
			case 2: {
				if (day <= 28) {
					;
				} else if (day == 29 && year % 4 == 0) {
					;
				}
				else {
					throw new InvalidDateException(day,month,year);
				}
			}
		}
	}
	@Override
	public boolean equals(Object newDate) {
		//avoid java.lang.ClassCastException 
		if (newDate instanceof MyDate) {
			MyDate d = (MyDate)newDate;
			if (d.day == this.day && d.month == this.month && d.year == this.year) {
				return true;
			}
		}
		return false;
	}
	
	public int compareTo(MyDate d) {
		if (d.getYear() != this.year) {
			return d.getYear() - this.year;
		}
		else if (d.getMonth() != this.month) {
			return d.getMonth() - this.month;
		}
		else if (d.getDay() != this.day) {
			return d.getDay() - this.day;
		}
		else {
			return 0;
		}
	}
}
