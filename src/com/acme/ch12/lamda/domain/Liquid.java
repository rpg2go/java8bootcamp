package com.acme.ch12.lamda.domain;

import java.util.Calendar;

public class Liquid extends Good {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Liquid(String name, int modelNumber, double height, UnitOfMeasureType uom, boolean flammable,
			double weightPerUom, double radius) {
		super(name, modelNumber, height, uom, flammable, weightPerUom);
		this.radius = radius;
	}
	
	public double volum() {
		return Math.PI * radius * radius * getHeight();
	}
	
	@Override
	public String toString() {
		return super.toString() + " (liquid) " + volum() + " " + getUnitofMeasure();
	}
	
	public String getSerialNo() {
		return new String(super.getSerialNo() + Calendar.getInstance().getTimeInMillis());
	}
	
//	public String printSerialNo() {
//		return new String("Liquid serial#no");
//	}

}
