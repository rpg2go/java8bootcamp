package com.acme.ch10.polymorphism.domain;

public class Good {
	private String name;
	private int modelNumber;
	private double height;
	private UnitOfMeasureType unitofMeasure;
	private boolean flammable;
	private double weightPerUoM;
	
	public static final String GOOD_SERIAL_NO = "123abc456def";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public UnitOfMeasureType getUnitofMeasure() {
		return unitofMeasure;
	}

	public void setUnitofMeasure(UnitOfMeasureType unitofMeasure) {
		this.unitofMeasure = unitofMeasure;
	}

	public boolean isFlammable() {
		return flammable;
	}

	public void setFlammable(boolean flammable) {
		this.flammable = flammable;
	}

	public double getWeightPerUoM() {
		return weightPerUoM;
	}

	public void setWeightPerUoM(double weightPerUoM) {
		this.weightPerUoM = weightPerUoM;
	}

	public Good(String name, int modelNumber, double height, UnitOfMeasureType uom, boolean flammable,
			double weightPerUom) {
		this.name = name;
		this.modelNumber = modelNumber;
		this.height = height;
		this.unitofMeasure = uom;
		this.flammable = flammable;
		this.weightPerUoM = weightPerUom;
	}

	@Override
	public String toString() {
		return name + "-" + modelNumber;
	}

	public double volum() {
		return 0.0;
	}

	public double weight() {
		return volum() * weightPerUoM;
	}
	
	public final String getSerialNo() {
		return GOOD_SERIAL_NO;
	}
	
	public static String printSerialNo() {
		return GOOD_SERIAL_NO;
	}
	
	public final boolean canShipViaPostOffice() {
		return this.isFlammable() && this.weightPerUoM < 200;
	}
}
