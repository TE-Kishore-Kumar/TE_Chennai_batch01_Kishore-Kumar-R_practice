package com.te.first.test;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEid(10);
		employee1.setEname("Kishore");
		employee1.setRole("Developer");
		employee1.setSalary(15000);
		
		System.out.println(employee1.hashCode());
		System.out.println(employee1);
		
		Employee employee2 = new Employee();
		employee2.setEid(11);
		employee2.setEname("Kumar");
		employee2.setRole("Senior Developer");
		employee2.setSalary(20000);
		
		Employee employee3 = new Employee();
		employee3.setEid(12);
		employee3.setEname("Benita");
		employee3.setRole("Manager");
		employee3.setSalary(200000);
		
		Employee employee4 = new Employee();
		employee4.setEid(13);
		employee4.setEname("Blessy");
		employee4.setRole("CEO");
		employee4.setSalary(2000000);
		
		System.out.println(employee2.equals(employee1));
		System.out.println(employee2.equals(employee3));
		
		Object[] employees = new Object[4];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		
		for(Object emp : employees) {
			Employee employee = (Employee) emp;
			System.out.println(employee.getEid());
			System.out.println(employee.getEname());
			System.out.println("=======================");
		}
		
		Employee[] employees1 = new Employee[4];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		
		for(Employee employee : employees1) {
			System.out.println(employee.getEid());
			System.out.println(employee.getEname());
			System.out.println(employee.getRole());
			System.out.println(employee.getSalary());
			System.out.println("========================");
		}
	}
}
