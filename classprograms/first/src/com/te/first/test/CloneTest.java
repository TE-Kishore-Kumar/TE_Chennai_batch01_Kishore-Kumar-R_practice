package com.te.first.test;

public class CloneTest {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("Paul");
		employee.setRole("Developer");
		employee.setSalary(45000);
		
		System.out.println("Before Changes");
		
		Employee employee2 = null;
		try {
			System.out.println("Emp :"+ employee);
			employee2 = (Employee) employee.clone();
			System.out.println("Emp 2 :"+ employee2);
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("After Changes");
		employee.setEid(20);
		employee.setEname("Sharuk");
		employee.setRole("Manager");
		employee.setSalary(50000);
		
		System.out.println("Emp :"+ employee);
		System.out.println("Emp 2 :"+ employee2);
	}
}
