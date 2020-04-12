package com.core.practice.singleton;

public class SingletonMain {
	
	public static void main(String a[]) {
		
		MySingleton st = MySingleton.getInstance();
		st.getSomeThing();
		
		
		
		
		
		// will thorow error
		//MySingleton obj = new MySingleton();
	}

}
