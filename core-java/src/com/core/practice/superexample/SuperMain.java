package com.core.practice.superexample;

public class SuperMain {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.getChildClassName());
		System.out.println(c.getParentClassName());
		System.out.println(c.callParentMethod());
	}

}
