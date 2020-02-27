package com.xworkz.java;

public class GCD {
	public static void main(String[] args) {
		int a = 33;
		int b = 15;
		int answer = gcd(a,b);
		System.out.println("Gcd of " + a + " and "+ b + " is " + answer);
	}
	private static int gcd(int a,int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}

