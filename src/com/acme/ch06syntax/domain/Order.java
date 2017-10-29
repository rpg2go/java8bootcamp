package com.acme.ch06syntax.domain;

import com.acme.ch04packaging.utils.MyDate;
/**
 * Order class is used to interact with customers;
 */
public class Order {
    static int staticCounter;
    int normalCounter;

    static int objCounter;

    public static double taxRate;
    MyDate orderDate;
    double orderAmount = 0.00;
    String customer;
    String product;
    int quantity;

    static {
        taxRate = 0.05;
    }

    static {
        System.out.println("Run code from static bloc") ;
        System.out.println("\n");
        staticCounter++;
    }

    {
        System.out.println("Run code from normal bloc") ;
        System.out.println("\n");
        normalCounter++;
    }

    public Order(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Order() {
        this.setObjCount();
    }

    /**
     * Create new Order command
     * @param d Order Date
     * @param amt Amount
     * @param c Customer
     * @param p Product
     * @param q Quantity
     */
    public Order(MyDate d, double amt, String c, String p, int q) {
        orderDate = d;
        orderAmount = amt;
        customer = c;
        product = p;
        quantity = q;
    }

    public String toString() {
        return quantity + " ea. " + product + " for " + customer;
    }

    void setObjCount(){
        objCounter++;
    }

    static int getObjCount() {
        return Order.objCounter;
    }

    public void printObjectsCounter(){
        int counter = Order.getObjCount();
        System.out.println("Order objects counter is " + counter);
    }

    public void printStaticCounter(){
        System.out.println("Static counter is " + Order.staticCounter);
    }

    public void printNormalCounter(){
        System.out.println("Normal counter is " + this.normalCounter);
    }

    public double getOrderAmount(){
        return this.orderAmount;
    }

    public static void setTaxRate(double newRate){
        taxRate = newRate;
    }

    public static void computeTaxOn(double anAmount){
        System.out.println("The tax for " + anAmount  + " is: " + anAmount*Order.taxRate);
    }

    public double computeTax(){
        System.out.println("The tax for this order is: " + this.orderAmount * Order.taxRate);
        return this.orderAmount * Order.taxRate;
    }
    /**
     * Return job size for an order
     * @return job size  
     */
    public char jobSize() {
    	if (quantity <= 25) {
    		return  'S';
    	}
    	else if (quantity <=75) {
    		return 'M';
    	}
    	else if (quantity <=150) {
    		return 'L';
    	}	
    	else {
    		return 'X';
    	}	
    }
    /**
     * Get Total Order Amount discount based on the Order Quantity
     * @param jobSize
     * @return  discount given
     */
    public double getDiscount() {
    	double discount = 0;
    	char jobSize = this.jobSize();
    	switch(jobSize) {
	    	case 'S': {
	    		discount = 0;
	    		break;
	    	}
			 case 'M': {
				discount = 1;
				break;
			}
			case 'L': {
					discount = 2;
					break;
				}
			default: {
				discount = 3;
				break;
			}
    	}
		return discount;
    }
       
    public double computeTotal() {
    	double amount;
    	amount = orderAmount  - getDiscount() + taxRate*orderAmount;
    	return amount;
    }
}
