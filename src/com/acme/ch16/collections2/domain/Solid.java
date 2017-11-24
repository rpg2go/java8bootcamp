package com.acme.ch16.collections2.domain;

public class Solid extends Good{
	private double width;
	private double length;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public Solid(String name, int modelNumber, double height, UnitOfMeasureType uom, boolean flammable,
			double weightPerUom, double width, double length) {
		super(name, modelNumber, height, uom, flammable, weightPerUom);
		this.width = width;
		this.length = length;
	}
	
	public double volum() {
		return width * length * getHeight();
	}
	
	public String toString() {
		return super.toString() + " that is " + volum() + " " + getUnitofMeasure() + " in size";
	}

}
