package com.te.practice.test;

public class EmployeeTest1 {
	
	public static void main(String[] args) {
		
		Employee1 emp1 = new Employee1();
		emp1.setEid(10);
		emp1.setEname("Kishore");
		emp1.setRole("Developer");
		emp1.setSalary(20000);
		
		System.out.println(emp1);
		System.out.println(emp1.hashCode());
		
		Employee1 emp2 = new Employee1();
		emp2.setEid(11);
		emp2.setEname("Kumar");
		emp2.setRole("Senior Developer");
		emp2.setSalary(50000);
		
		System.out.println(emp2);
		System.out.println(emp2.hashCode());
		
		Employee1 emp3 = new Employee1();
		emp3.setEid(12);
		emp3.setEname("Kishore Kumar");
		emp3.setRole("Software Architect");
		emp3.setSalary(100000);
		
		Employee1 emp4 = new Employee1();
		emp4.setEid(12);
		emp4.setEname("Kishore Kumar");
		emp4.setRole("Software Architect");
		emp4.setSalary(100000);
		
		System.out.println(emp4.equals(emp3));
		System.out.println(emp1.equals(emp2));
		
		Object[] emp = new Object[4];
		emp[0] = emp1;
		emp[1] = emp2;
		emp[2] = emp3;
		emp[3] = emp4;
		
		for(Object emp0 : emp) {
			Employee1 e1 = (Employee1) emp0;
			System.out.println(e1.getEid());
			System.out.println(e1.getEname());
			System.out.println(e1.getRole());
			System.out.println(e1.getSalary());
			System.out.println("============================");
		}
	}
}
