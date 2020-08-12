package com;



 class MyThread extends Thread {
	MyThread() {
		System.out.println("MyThread");
	}
	
	public void run() {
		System.out.println("Bar");
	}
	
	public void run(String s) {
		System.out.println("Baz");
	}
	
	public void Say() {
		System.out.println("Hi");
	}
}

/**
 * @author Lenovo
 * Inline method would be effective than its actual method
 */
public class ThreadTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new MyThread() {
			public void run() {
				System.out.println("Foo");
			}
		};
		t.start();
	}

}
