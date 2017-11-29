package com.acme.ch17.exceptions.domain;

import java.time.LocalDate;

import com.acme.ch17.exceptions.domain.MyDate;
import com.acme.ch17.exceptions.util.HolidayOrdersNotAllowedException;
/**
 * Order class is used to interact with customers;
 */
public class Order {
    static int staticCounter;
    int normalCounter;

    static int objCounter;

    public static double taxRate;
    private MyDate orderDate;
    private double orderAmount = 0.00;
    private String customer;
    private Product product;
    private int quantity;
    
    private static Rushable rushable;
    
    static {
        taxRate = 0.05;
    }

    static {
        System.out.println("Run code from static bloc") ;
        staticCounter++;
    }
    
    {
    	System.out.println("\nBuild new Order object\n");
    }
    
    {
        System.out.println("Run code from normal bloc") ;
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
    public Order(MyDate d, double amt, String c, Product p, int q) {
    	try {
    		setOrderDate(d);
    	}
    	catch (HolidayOrdersNotAllowedException e) {
    		System.out.println("The order date for an order cannot be a holiday date! Application is closing");
    		System.exit(0);
    	}
        orderAmount = amt;
        customer = c;
        product = p;
        quantity = q;
    }
    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

    public double l3(){
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
		return discount / 100;
    }
       
    public double computeTotal() {
    	double amount;

    	amount = orderAmount  - orderAmount * getDiscount();
    	if  (amount <= 1500) {
    		 amount = amount + computeTax();
    	}
    	return amount;
    }

	public int getNormalCounter() {
		return normalCounter;
	}

	public void setNormalCounter(int normalCounter) {
		this.normalCounter = normalCounter;
	}

	public MyDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(MyDate orderDate) throws HolidayOrdersNotAllowedException {
		if (isHoliday(orderDate)) {
			System.out.println("Order date, " + orderDate + ", cannot be set to a holiday!");
			throw new HolidayOrdersNotAllowedException(orderDate);
		}
		else { 
			this.orderDate = orderDate;
		}
	}
	
	public boolean isHoliday(MyDate orderDate) {
		int crtYear = LocalDate.now().getYear();
		
		if (orderDate.equals(new MyDate(31,12,crtYear))) {
			return true;
		}
		else if (orderDate.equals(new MyDate(01,01,crtYear))) {
			return true;
		}
		else if (orderDate.equals(new MyDate(25,12,crtYear))) {
			return true;
		}
		else {
			return false;
		}
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static Rushable getRushable() {
		return rushable;
	}

	public static void setRushable(Rushable rushable) {
		Order.rushable = rushable;
	}
	
	public boolean isPriorityOrder() {
		boolean priorityOrder = false;
		if (rushable != null) {
			priorityOrder = rushable.isRushable(orderDate, orderAmount);
		}
		return priorityOrder;
	}
	
 
}
