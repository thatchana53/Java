package com;

/**
 * @author Lenovo
 * We can write a class inside the main() but it would invoke when it is instantiated
 */
public class ClassInsideMainMethod {
	
	static final Integer i1 = 1;
    final Integer i2 = 1;
	Integer i3 = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Integer i4 = 4;
		Integer i5 = 5;
		class Inner {
			final Integer i6 = 6;
			Integer i7 = 7;			
			Inner() {
				System.out.println(i6 + i7);
			}
		}
		
		Inner i = new Inner();
	}
}
