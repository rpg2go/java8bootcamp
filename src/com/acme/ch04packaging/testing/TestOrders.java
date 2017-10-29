package com.acme.ch04packaging.testing;

import com.acme.ch04packaging.utils.MyDate;
import com.acme.ch04packaging.domain.Order;

public class TestOrders {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(1,20,2008);
        System.out.println("date1 = " + date1.toString());
//		Order anvil = new Order(date1, 2000.00, "Wile E Coyote", "Anvil", 10);

        MyDate date2 = new MyDate(4,10,2008);
        System.out.println("date2 = " + date2.toString());
//		Order balloons = new Order(date2, 1000.00, "Bugs Bunny", "Balloon", 125);

//		System.out.println(anvil);
//		System.out.println(balloons);

        Order o1 = new Order();
        o1.printObjectsCounter();
        o1.printStaticCounter();
        o1.printNormalCounter();
        System.out.println("Order amount is " + o1.getOrderAmount());


        Order o2 = new Order(1750.50);
        o2.printObjectsCounter();
        o1.printStaticCounter();
        o1.printNormalCounter();

        System.out.println("Order amount is " + o2.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.computeTaxOn(o2.getOrderAmount());
        o2.computeTax();

        MyDate myDate = new MyDate(10,27,2017);

        Order o3 = new Order(myDate,15700,"Popescu","phone",175);
        o3.printObjectsCounter();
        o3.printStaticCounter();
        o3.printNormalCounter();

        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.setTaxRate(0.16);
        System.out.println("The Tax Rate was set to: " + Order.taxRate);
        System.out.println("Order amount is " + o3.getOrderAmount());
        Order.computeTaxOn(o3.getOrderAmount());
        o2.computeTax();
    }

}
