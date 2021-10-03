package com.te.program14;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeDetails empdetails = new EmployeeDetails();

		// Access the static members
		System.out.println(EmployeeDetails.empname);
		EmployeeDetails.salary();

		// Access non static members
		System.out.println(empdetails.empno);
		empdetails.position();
	}
}
