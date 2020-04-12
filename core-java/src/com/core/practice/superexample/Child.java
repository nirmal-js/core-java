package com.core.practice.superexample;

public class Child extends Parent {

	private String className = "Child";
	
	public Child() {
		super();
		className = "Child";
	}

	public String getChildClassName() {
		return className;
	}

	public String getParentClassName() {
		return super.className;
	}

	public String callParentMethod() {
		return super.getClassName();
	}
	
	

}
