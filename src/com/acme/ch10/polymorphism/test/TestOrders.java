package com.acme.ch10.polymorphism.test;
import com.acme.ch10.polymorphism.domain.Order;
import com.acme.ch10.polymorphism.domain.Solid;
import com.acme.ch10.polymorphism.domain.Liquid;
import com.acme.ch10.polymorphism.domain.UnitOfMeasureType;
import com.acme.ch10.polymorphism.domain.Good;
import com.acme.ch10.polymorphism.domain.MyDate;

public class TestOrders {

    public static void main(String[] args) {
    	    	
        Order o1 = new Order();
        System.out.println("Order amount is " + o1.getOrderAmount());
        System.out.println("Order size is " + o1.jobSize());
        System.out.println("Discount value is " + o1.getDiscount());
        System.out.println("Total amount " + o1.computeTotal());
        
        /***************************************************************/

        MyDate date2 = new MyDate(11,01,2017);
        Liquid l2 = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER, false, 250, 6);
        Order o2 = new Order(date2, 1750.00, " Wile E Coyote", l2, 2500);
        
        System.out.println("Order amount is " + o2.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.computeTaxOn(o2.getOrderAmount());
        o2.computeTax();
        System.out.println("Order size is " + o2.jobSize());
        System.out.println("Discount value is " + o2.getDiscount());
        System.out.println("Total amount " + o2.computeTotal());
        System.out.println("The total bill for: " + o2 + " is " + o2.computeTotal());

        
        /***************************************************************/
        MyDate date3 = new MyDate(11,02,2017);
        Solid l3 = new Solid("Acme Block", 2334, 4, UnitOfMeasureType.CUBIC_METER, false, 250, 15, 25);
        Order o3 = new Order(date3, 1000.00, "Bugs Bunny", l3, 270);
        System.out.println("Order amount is " + o3.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.computeTaxOn(o3.getOrderAmount());
        o2.computeTax();
        System.out.println("Order size is " + o3.jobSize());
        System.out.println("Discount value is " + o3.getDiscount());
        System.out.println("Total amount " + o3.computeTotal());
        System.out.println("The total bill for: " + o3 + " is " + o3.computeTotal());
        
        Solid l4 = new Solid("Acme Building", 2334, 4, UnitOfMeasureType.CUBIC_METER, false, 5700, 25, 125);
        Order o4 = new Order(date3, 1275.45, "Ionescu Ilie", l4, 245);
        System.out.println("Order amount is " + o3.getOrderAmount());
        System.out.println("Order size is " + o3.jobSize());
        System.out.println("Discount value is " + o3.getDiscount());
        System.out.println("Total amount " + o3.computeTotal());

    }

}
