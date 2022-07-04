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

	public static void main(String[] args) {
		Integer x1 = 25, x2 = 50, x3 = 42;
		checkMax(x1, x2, x3);
	}
}
