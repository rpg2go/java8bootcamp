package com.acme.ch06.syntax.testing;
import com.acme.ch04.packaging.utils.MyDate;
import com.acme.ch06.syntax.domain.Order;

public class TestOrders {

    public static void main(String[] args) {
    	
    	
        Order o1 = new Order();
        System.out.println("Order amount is " + o1.getOrderAmount());
        System.out.println("Order size is " + o1.jobSize());
        System.out.println("Discount value is " + o1.getDiscount());
        System.out.println("Total amount " + o1.computeTotal());
        
        /***************************************************************/

        MyDate date2 = new MyDate(11,01,2017);
        Order o2 = new Order(date2, 1750.00, " Wile E Coyote", "Anvil", 270);
        
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
        Order o3 = new Order(date3, 1000.00, "Bugs Bunny", "Balloon", 270);
        System.out.println("Order amount is " + o3.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.computeTaxOn(o3.getOrderAmount());
        o2.computeTax();
        System.out.println("Order size is " + o3.jobSize());
        System.out.println("Discount value is " + o3.getDiscount());
        System.out.println("Total amount " + o3.computeTotal());
        System.out.println("The total bill for: " + o3 + " is " + o3.computeTotal());

    }

}
