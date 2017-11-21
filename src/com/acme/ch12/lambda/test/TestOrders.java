package com.acme.ch12.lambda.test;
import com.acme.ch12.lamda.domain.Order;
import com.acme.ch12.lamda.domain.Service;
import com.acme.ch12.lamda.domain.Solid;
import com.acme.ch12.lamda.domain.Liquid;
import com.acme.ch12.lamda.domain.UnitOfMeasureType;
import com.acme.ch12.lamda.domain.MyDate;

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
        
	    System.out.println(l2);   
        System.out.println("Order amount is " + o2.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.computeTaxOn(o2.getOrderAmount());
        o2.computeTax();
        System.out.println("Order size is " + o2.jobSize());
        System.out.println("Discount value is " + o2.getDiscount());
        System.out.println("Total amount " + o2.computeTotal());
        System.out.println("The total bill for: " + o2 + " is " + o2.computeTotal());
        System.out.println("Serial #No is " + l2.getSerialNo());
        
        //set Rushable property
        Order.setRushable((MyDate orderDate, double orderAmount) -> {return orderAmount > 2000;} );
        System.out.println("Order o2 isPriorityOrder: " + o2.isPriorityOrder());
        
        /***************************************************************/
        MyDate date3 = new MyDate(11,02,2017);
        Solid l3 = new Solid("Acme Block", 2334, 4, UnitOfMeasureType.CUBIC_METER, false, 250, 15, 25);
        Order o3 = new Order(date3, 1000.00, "Bugs Bunny", l3, 270);
        Order.setRushable((orderDate, orderAmount) -> (orderAmount <=1000) );
        
        System.out.println(l3);
        System.out.println("Order amount is " + o3.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        Order.computeTaxOn(o3.getOrderAmount());
        o2.computeTax();
        System.out.println("Order size is " + o3.jobSize());
        System.out.println("Discount value is " + o3.getDiscount());
        System.out.println("Total amount " + o3.computeTotal());
        System.out.println("The total bill for: " + o3 + " is " + o3.computeTotal());
        System.out.println("Serial #No is " + l3.getSerialNo());
        System.out.println("Order o3 isPriorityOrder: " + o3.isPriorityOrder());
        
        Solid l4 = new Solid("Acme Building", 2334, 4, UnitOfMeasureType.CUBIC_METER, false, 5700, 25, 125);
        Order o4 = new Order(date3, 1275.45, "Ionescu Ilie", l4, 245);
        System.out.println(l4);
        System.out.println("Order amount is " + o4.getOrderAmount());
        System.out.println("Order size is " + o4.jobSize());
        System.out.println("Discount value is " + o4.getDiscount());
        System.out.println("Total amount " + o4.computeTotal());
        System.out.println("Serial #No is " + l4.getSerialNo());
        
        
        MyDate date5 = new MyDate(4,10,2008);
        Service s5 = new Service("Road Runner Eradication", 14, false);
        Order birdEradication = new Order(date5, 20000, "Daffy Duck", s5, 1);
        
        System.out.println(birdEradication);
        System.out.println(s5);
        System.out.println("The total bill for: " + birdEradication + " is " + birdEradication.computeTotal());
        System.out.println("Serial #No is " + s5.getSerialNo());
        
        Order.setRushable( (MyDate orderDate, double orderAmount)->{return orderAmount > 1500;}) ;
        System.out.println("Order birdEradication isPriorityOrder: " + birdEradication.isPriorityOrder());
 
    }

}
