package com.core.practice.staticexample;

import com.core.practice.singleton.MySingleton;

public class StaticMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpName("Nirmal");
		e1.setEmpId("1");
		e1.setGrade("PA");
		e1.setSalary("5LPA");
		e1.getEmpId();
		System.out.println("Employee:"+ e1.getEmpId() + " " + e1.getEmpName() + " "+Employee.company);
		
		Employee e2 = new Employee();
		e2.setEmpName("Kumar");
		e2.setEmpId("1");
		e2.setGrade("A");
		e2.setSalary("6LPA");
		
		System.out.println("Employee:"+ e2.getEmpId() + " " + e2.getEmpName()+" "+Employee.company);
		
		
		System.out.println("Date:"+Employee.getCurrentDate());
		
		MySingleton st2 = MySingleton.getInstance();
		System.out.println(st2.getName());
	}

}
