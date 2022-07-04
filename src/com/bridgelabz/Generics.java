package com.bridgelabz;

public class Generics {
	private static void checkMax(Integer x1, Integer x2, Integer x3) {
		Integer max = x1;
		if (x2.compareTo(max) > 0)
			max = x2;
		if (x3.compareTo(max) > 0)
			max = x3;
		System.out.println("Max value is :" + max);
	}

	private static void checkMax(Float y1, Float y2, Float y3) {
		Float max = y1;
		if (y2.compareTo(max) > 0)
			max = y2;
		if (y2.compareTo(max) > 0)
			max = y3;
		System.out.println("Max value is :" + max);
	}

	private static void checkMax(String z1, String z2, String z3) {
		String max = z1;
		if (z2.compareTo(max) > 0)
			max = z2;
		if (z3.compareTo(max) > 0)
			max = z3;
		System.out.println("Max value is :" + max);
	}

	public static void main(String[] args) {
		Integer x1 = 25, x2 = 30, x3 = 42;
		Float y1 = 25.23f, y2 = 30.56f, y3 = 42.89f;
		String z1 = "google", z2 = "bing", z3 = "yahoo";
		checkMax(x1, x2, x3);
		checkMax(y1, y2, y3);
		checkMax(z1, z2, z3);
	}
}
