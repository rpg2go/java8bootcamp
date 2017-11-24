package com.acme.ch15.collections.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class Good implements Product {
	private String name;
	private int modelNumber;
	private double height;
	private UnitOfMeasureType unitofMeasure;
	private boolean flammable;
	private double weightPerUoM;
	
	public static final String GOOD_SERIAL_NO = "123abc456def";
	
	public static List catalog;
	
	static {
		Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER,false, 15, 6);
		Liquid paint = new Liquid("Acme Invisible Paint", 2490, 0.65,UnitOfMeasureType.GALLON, true, 0.70, 12);
		Solid anvil = new Solid("Acme Anvil", 1668, 0.3,UnitOfMeasureType.CUBIC_METER, false, 500, 0.25, 0.3);
		Solid safe = new Solid("Acme Safe", 1672, 1.0,UnitOfMeasureType.CUBIC_METER, false, 300, 0.5, 0.5);
		Solid balloon = new Solid("Acme Balloon", 1401, 15,UnitOfMeasureType.CUBIC_FEET, false, 10, 5, 5);
		Solid pistol = new Solid("Acme Disintegrating Pistol", 1587, 0.1,UnitOfMeasureType.CUBIC_FEET, false, 1, 0.5, 2);
		Liquid nitro = new Liquid("Acme Nitroglycerin", 4289, 1.0,UnitOfMeasureType.CUBIC_METER, true, 1.5, 0.25);
		Liquid oil = new Liquid("Acme Oil", 4275, 1.0,UnitOfMeasureType.CUBIC_METER, true, 1.5, 0.25);
		
		catalog = new ArrayList();
		catalog.add(glue);
		catalog.add(paint);
		catalog.add(anvil);
		catalog.add(safe);
		catalog.add(balloon);
		catalog.add(pistol);
		catalog.add(nitro);
		catalog.add(oil);
	}
	
	public static Set getFlammableList() {
		Set flammable = new HashSet();
		
		Iterator it = catalog.iterator();
		
		while (it.hasNext()) {
			Good g = (Good)it.next();
			if (g.isFlammable()) {
				flammable.add(g);
			}
		}
		return flammable;
	}
	
	public static List getCatalog() {
		return catalog;
	}

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
	
	public String getSerialNo() {
		return GOOD_SERIAL_NO;
	}
	
	public static String printSerialNo() {
		return GOOD_SERIAL_NO;
	}
	
	public final boolean canShipViaPostOffice() {
		return this.isFlammable() && this.weightPerUoM < 200;
	}
}
