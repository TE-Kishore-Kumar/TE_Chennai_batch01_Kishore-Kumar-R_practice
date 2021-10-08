package com.te.first.test;

import java.util.Scanner;

public class ScannerTest {
	
	static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		Employee employee1 = new Employee();
		System.out.println("Enter the Employee one Details");
		
		System.out.println("Enter the Employee ID : ");
		int eid = Integer.parseInt(scanner.next());
		employee1.setEid(eid);
		
		System.out.println("Enter the Employee Name : ");
		String name = scanner.next();
		employee1.setEname(name);
		
		System.out.println("Enter the Employee Role : ");
		String role = scanner.next();
		employee1.setRole(role);
		
		System.out.println("Enter the Employee Salary : ");
		double sal = Double.parseDouble(scanner.next());
		employee1.setSalary(sal);
	}
}
