package com.acme.ch03.statics.domain;

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
}
