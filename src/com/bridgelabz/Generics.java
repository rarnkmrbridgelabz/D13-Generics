package com.bridgelabz;

public class Generics {
	private static void checkMax(Float x1, Float x2, Float x3) {
		Float max = x1;
		if (x2.compareTo(max) > 0)
			max = x2;
		if (x3.compareTo(max) > 0)
			max = x3;
		System.out.println("Max value is :" + max);
	}

	public static void main(String[] args) {
		Float x1 = 25.23f, x2 = 30.56f, x3 = 42.89f;
		checkMax(x1, x2, x3);
	}
}
