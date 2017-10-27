package com.acme.ch01intro.testing;

import com.acme.ch01intro.domain.MyDate;

public class TestOrders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDate date1 = new MyDate(1,20,2008);
		System.out.println("date1 = " + date1.toString());
//		Order anvil = new Order(date1, 2000.00, "Wile E Coyote", "Anvil", 10);

		MyDate date2 = new MyDate(4,10,2008);
		System.out.println("date2 = " + date2.toString());
//		Order balloons = new Order(date2, 1000.00, "Bugs Bunny", "Balloon", 125);

//		System.out.println(anvil);
//		System.out.println(balloons);

	}

}
