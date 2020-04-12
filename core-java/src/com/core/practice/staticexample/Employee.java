package com.core.practice.staticexample;

import java.util.Date;

public class Employee {

	private String empId;
	private String empName;
	private String grade;
	private String salary;
	public static String company = "CTS";
	
	/*
	 * public static String changeCompanyName() { //salary= "5k"; return company =
	 * "Amazon"; }
	 */
	
	public static Date getCurrentDate() {
		return new Date();
	}

	public String getEmpId() {
		company = "Amazon2";
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
