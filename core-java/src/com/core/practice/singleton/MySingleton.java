package com.core.practice.singleton;

public class MySingleton {
	
	private static MySingleton myObj;

	/**
	 * Create private constructor
	 */
	private MySingleton() {

	}

	/**
	 * Create a static method to get instance.
	 */
	public static MySingleton getInstance() {
		if (myObj == null) {
			myObj = new MySingleton();
		}
		return myObj;
	}

	public void getSomeThing() {
		System.out.println("first time new instance");
	}
	
	public void callAgain() {
		System.out.println("second time same instance");
	}

	public String getName() {
		int c = 5 + 3;
		return String.valueOf(c);
	}
	
}
