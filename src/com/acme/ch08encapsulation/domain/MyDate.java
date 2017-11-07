package com.acme.ch08encapsulation.domain;

public class MyDate {
    private int day;
    private int year;
    private int month;
    int numberOfDays;

    public MyDate(){}
    

    public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public void setYear(int year) {
		this.year = year;
	}



	//use the parameters of m, d and y to set the three attributes
    public MyDate(int m, int d, int y){

        day = d;
        month = m;
        year = y;
    }

    //return a string with month/day/year like 01/20/1964
    public String crtYear(){
        String currentDate = day + "/" + month + "/" + year;
        return currentDate;
    }

    //set the MyDate attributes with m, d, and y values here!
    public void setDate(int m, int d, int y){
        day = d;
        month = m;
        year = y;
    }
    
    public int getYear() {
    	return this.year;
    }

    public static void leapYears() {
    	
    	for (int i = 1752; i <= 2020; i ++) {
    		if (i % 4 == 0) {
    			if (i % 100 != 0) {
    				System.out.println("The year "+ i + " is a leap year");
    			}
    			else if (i % 400 == 0 && i % 100 == 0) {
    				System.out.println("The year "+ i + " is a leap year");
    			}
			}
		}
    }
}
