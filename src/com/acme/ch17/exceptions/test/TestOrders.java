package com.acme.ch17.exceptions.test;
import com.acme.ch17.exceptions.domain.Order;
import com.acme.ch17.exceptions.domain.Solid;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import com.acme.ch17.exceptions.domain.Liquid;
import com.acme.ch17.exceptions.domain.UnitOfMeasureType;
<<<<<<< HEAD
import com.acme.ch17.exceptions.util.InvalidDateException;
=======
>>>>>>> fe512f5f80547992c15809337a099f63c97dc165
import com.acme.ch17.exceptions.domain.MyDate;

public class TestOrders {

<<<<<<< HEAD
    public static void main(String[] args) throws InvalidDateException {
=======
    public static void main(String[] args) {
>>>>>>> fe512f5f80547992c15809337a099f63c97dc165
    	    	
    	LocalDate crtDate = LocalDate.now();
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm:ss");
    	System.out.println("Current time: " + crtDate);
        MyDate today = new MyDate(crtDate.getDayOfMonth(), crtDate.getMonthValue(), crtDate.getYear());
        System.out.println("Current date : " + today);
        
        MyDate glueDate = new MyDate(10,11,2017);
        Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER, false, 250, 6);
        Order glueOrder = new Order(glueDate, 1750.00, " Wile E Coyote", glue, 2500);
//        Order.setRushable((orderDate, orderAmount) -> {
//			LocalDate ldo = LocalDate.of(orderDate.getYear(),orderDate.getMonth(), orderDate.getDay());
//			LocalDate ldc = LocalDate.of(today.getYear(), today.getMonth(), today.getDay());
//			return Period.between(ldo, ldc).getDays() >= 15;
//		});
        Order.computeTaxOn(glueOrder.getOrderAmount());
        glueOrder.computeTax();
        
	    System.out.println(glue);   
        System.out.println("Order amount is " + glueOrder.getOrderAmount());
        System.out.println("The Tax Rate is currently: " + Order.taxRate);
        System.out.println("Order size is " + glueOrder.jobSize());
        System.out.println("Discount value is " + glueOrder.getDiscount());
        System.out.println("Total amount " + glueOrder.computeTotal());
        System.out.println("The total bill for: " + glueOrder + " is " + glueOrder.computeTotal());
        System.out.println("Serial #No is " + glue.getSerialNo());
 
        
        MyDate hammerDate = new MyDate(02, 01, 2017 );
        Solid hammerType = new Solid( "Acme Hammer", 281, 0.3, UnitOfMeasureType.CUBIC_METER, false, 100, 0.25, 0.3 );
        Order hammer = new Order( hammerDate, 10.00, "Wile E Coyote", hammerType, 10 );
//		Order.setRushable((orderDate, orderAmount) -> {
//			LocalDate now = LocalDate.now();
//			LocalDate ldo = LocalDate.of(orderDate.getYear(), orderDate.getMonth(), orderDate.getDay());
//			LocalDate ldoPlus30 = ldo.plusMonths(1);
//			return now.isAfter(ldoPlus30);
//		});
        
        MyDate bookDate = new MyDate(25, 12, 2017 );
        Solid bookType = new Solid( "Acme Book", 125, 0.3, UnitOfMeasureType.CUBIC_METER, true, 100, 0.25, 0.3 );
        Order book = new Order( bookDate, 15.00,  "Java Date & Time Lab Practice", bookType, 5);
		Order.setRushable((orderDate, orderAmount) -> {
			LocalDate now = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
			System.out.println("Current date is " + now.format(formatter));
			
			LocalDate bod = LocalDate.of(orderDate.getYear(), orderDate.getMonth(), orderDate.getDay());
			System.out.println("Order date is " + bod.format(formatter));
			System.out.println("Period between : " + Period.between(bod, now).getMonths() + " months " + Period.between(bod, now).getDays() + " days");

			LocalDate bodPlus30 = bod.plusMonths(1);
			return now.isAfter(bodPlus30);
		});		
		
		System.out.println("\n");
		System.out.println(">>>> isPriorityOrder Method Testing<<<<");
		System.out.println("\n");
		
        System.out.println("Glue isPriorityOrder: " + glueOrder.isPriorityOrder());
        System.out.println("Hammer isPriorityOrder: " + hammer.isPriorityOrder());
        System.out.println("Book isPriorityOrder: " + book.isPriorityOrder());
    }

}
