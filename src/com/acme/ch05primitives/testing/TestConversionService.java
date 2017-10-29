package com.acme.ch05primitives.testing;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.acme.ch05primitives.utils.ConversionService;

public class TestConversionService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ConversionService.fluidOunces(1.1f));
		System.out.println(ConversionService.gallons(2.2f));
		System.out.println(ConversionService.grams(BigInteger.valueOf(30)));
		System.out.println(ConversionService.milliliters(40));
		System.out.println(ConversionService.ounces(new BigDecimal(50)));
		System.out.println(ConversionService.pints(6.6f));
		System.out.println(ConversionService.pounds(new BigDecimal(7.7)));

		// can you figure out why these do not compile
		ConversionService.fluidOunces((float)1.1);
		ConversionService.grams(new BigInteger("30"));
		ConversionService.milliliters((int)4.0);
		short grams = (short)ConversionService.grams(new BigInteger("30")).intValue();
		System.out.println("30kg = " + grams + " in short");
		byte byteGrams = (byte)ConversionService.grams(new BigInteger("30")).intValue();
		System.out.println("30kg = " + byteGrams + " in byte");

		// why do these still work even though the types are different
	
		System.out.println("------------------------------------");
		double ounces = ConversionService.fluidOunces(1.1f);
		System.out.println(ounces);
		long milliliters = ConversionService.milliliters(40);
		System.out.println(milliliters);
		double decimalmilliliters = ConversionService.milliliters(40);
		System.out.println(decimalmilliliters);
		short s = 30;
		System.out.println(ConversionService.grams(BigInteger.valueOf(s)));
		byte b = 4;
		System.out.println(ConversionService.milliliters((byte)b));
		char z = 'z';
		System.out.println(ConversionService.milliliters(z));
		System.out.println(ConversionService.gallons(200));
		System.out.println(ConversionService.ounces(new BigDecimal(50.5f)));
		System.out.println(ConversionService.pints(6L));
		System.out.println(ConversionService.pounds(new BigDecimal(70l)));
	
		// compare these results.  Can you tell why they are different?

		System.out.println("------------------------------------");
		float bigGallons = ConversionService.gallons(123456789123456789L);
		System.out.println(bigGallons);
		double bigGallons2 = 123456789123456789L * 0.2642;
		System.out.println(bigGallons2);


		System.out.println("------------------------------------");
		int bigGrams = ConversionService.grams(BigInteger.valueOf(1234567890)).intValue();
		System.out.println(bigGrams);
		long bigGrams2 = 1234567890L * 1000L;
		System.out.println(bigGrams2);
	
	}

}
