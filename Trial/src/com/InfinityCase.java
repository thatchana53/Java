package com;

public class InfinityCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 10.0 / -0;
		if (d == Double.POSITIVE_INFINITY) {
			System.out.println("Positive Infinity");
		} else {
			System.out.println("Negative Infinity");
		}
		
		d = -10.0 / 0;
		if (d == Double.POSITIVE_INFINITY) {
			System.out.println("Positive Infinity");
		} else {
			System.out.println("Negative Infinity");
		}
	}

}
