package com.acme.ch13.datetime.domain;

public class MyDate {
	private int day;
	private int year;
	private int month;
	
	int numberOfDays;

	public MyDate() {
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (valid (day, this.month, this.year)) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (valid (this.day, month, this.year)) {
			this.month = month;
		}
	}

	public void setYear(int year) {
		if (valid (this.day, this.month, year)) {
			this.year = year;
		}
	}
	
	public int getYear() {
		return this.year;
	}

	// use the parameters of m, d and y to set the three attributes
	public MyDate(int d, int m, int y) {
		if (valid(d, m, y)) {
			day = d;
			month = m;
			year = y;
		}
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
}
