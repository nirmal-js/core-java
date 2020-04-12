package com.core.practice.interfaceabstract;

public class EmployeeExtend extends Employee {

	@Override
	String getStudentName() {
		return "Name";
	}

	@Override
	String getStudentGrade() {
		return "grade";
	}
	
	public static void main(String[] args) {
		EmployeeExtend obj = new EmployeeExtend();
		obj.getStudentGrade();
		obj.getStudentSchool();
	}


}
