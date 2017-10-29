package com.acme.ch06syntax.testing;
import com.acme.ch04packaging.utils.MyDate;
import com.acme.ch06syntax.domain.Order;

public class TestOrders {

    public static void main(String[] args) {
    	
    	
        Order o1 = new Order();
        o1.printObjectsCounter();
        o1.printStaticCounter();
        o1.printNormalCounter();
        System.out.println("Order amount is " + o1.getOrderAmount());
        
        System.out.println("Order size is " + o1.jobSize());
        System.out.println("Discount value is " + o1.getDiscount());
        System.out.println("Total amount " + o1.computeTotal());
        
        /***************************************************************/
        Order o2 = new Order(1750.50);
        o2.printObjectsCounter();
        o1.printStaticCounter();
        o1.printNormalCounter();

        System.out.println("Order amount is " + o2.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.computeTaxOn(o2.getOrderAmount());
        o2.computeTax();
        
        System.out.println("Order size is " + o2.jobSize());
        System.out.println("Discount value is " + o2.getDiscount());
        System.out.println("Total amount " + o2.computeTotal());
        
      
        
        /***************************************************************/
        MyDate date1 = new MyDate(11,02,2017);
        Order o3 = new Order(date1, 1000.00, "Bugs Bunny", "Balloon", 270);
        o3.printObjectsCounter();
        o3.printStaticCounter();
        o3.printNormalCounter();
        System.out.println("Order amount is " + o3.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.computeTaxOn(o3.getOrderAmount());
        o2.computeTax();
        
        System.out.println("Order size is " + o3.jobSize());
        System.out.println("Discount value is " + o3.getDiscount());
        System.out.println("Total amount " + o2.computeTotal());

    }

}
