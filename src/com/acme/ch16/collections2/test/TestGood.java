package com.acme.ch16.collections2.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.acme.ch16.collections2.domain.Good;
import com.acme.ch16.collections2.domain.Liquid;
import com.acme.ch16.collections2.domain.UnitOfMeasureType;

public class TestGood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Good.getCatalog());
		
		Good.getCatalog().remove(1);
		System.out.println(Good.getCatalog());
		
		Liquid water = new Liquid("Acme water", 470, 1.0, UnitOfMeasureType.CUBIC_METER, false, 1.5, 0.25);
		Good.getCatalog().add(1, water);
		System.out.println(Good.getCatalog());
		
		Good.getCatalog().add(water);
		System.out.println(Good.getCatalog());
			
		System.out.println("Before sorting:");
		printCatalog();
		
		Collections.sort( (List<Good>) Good.getCatalog());
		System.out.println("After sorting:");
		printCatalog();
		
		Collections.reverse((List<Good>)Good.getCatalog());
		System.out.println("Reverse sorting:");
		printCatalog();
				
		System.out.println("------------------------------------------");
		Set<Good> flamableHashSet = Good.getFlammableList();
		System.out.println(flamableHashSet);
		
		addObject((Good)Good.getCatalog().get(6), flamableHashSet);
		
		addObject(water, flamableHashSet);
		addObject(water, flamableHashSet);
		
		removeObject(water, flamableHashSet);
		removeObject(water, flamableHashSet);
		
		System.out.println(Collections.binarySearch((List<Good>) Good.getCatalog(),Good.getCatalog().get(2)));
		System.out.println(Collections.binarySearch((List<Good>) Good.getCatalog(), water));
	
	}

	/**
	 * 
	 */
	private static void printCatalog() {
		System.out.println("------------------------------------------");
		Iterator<Good> it = Good.getCatalog().iterator();
		int i = 0;
		while (it.hasNext()){
			System.out.println("Good[" + ++i + "] = " +  it.next());
		}
	}

	/**
	 * Remove an object from a hash set
	 * @param water
	 * @param hashSet
	 */
	private static void removeObject(Good good, Set<Good> hashSet) {
		if (!hashSet.contains(good)) {
			System.out.println("Try to remove an inexisting object....");
			System.out.println("Nothing will be removed from set....");
			System.out.println("Set size is " + hashSet.size());
		}
		else {
			System.out.println("Try to remove an existing object....");
			hashSet.remove(good);
			System.out.println("New set size is " + hashSet.size());
		}
		System.out.println(hashSet);
	}

	/**
	 * Add a new object to a hash set 
	 * @param good
	 * @param hashSet
	 */
	private static void addObject(Good good, Set<Good> hashSet) {
		if (!hashSet.contains(good)) {
			System.out.println("Try to add a new object....");
			hashSet.add(good);
			System.out.println("New set size is " + hashSet.size());
		}
		else {
			System.out.println("Try to add the same object....");
			System.out.println("Nothing will be add to set....");
			System.out.println("Set size is " + hashSet.size());
		}
		System.out.println(hashSet);
	}

}
