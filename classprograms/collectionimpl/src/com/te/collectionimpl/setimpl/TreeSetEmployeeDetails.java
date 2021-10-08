package com.te.collectionimpl.setimpl;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEmployeeDetails {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(90, "Praveen", "Developer", 90000.9, "Bosh");
		Employee employee2 = new Employee(70, "Hulk", "Destructor", 100000.9, "Marvel");
		Employee employee3 = new Employee(80, "Thor", "Thunder", 20900.9, "Asgard");
		Employee employee4 = new Employee(20, "Lucifer", "Monster", 70090.9, "AnyWhere");
		Employee employee5 = new Employee(10, "SuperMan", "Reporter", 90000.9, "Dc");
		
		TreeSet<Employee> employees = new TreeSet<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		Iterator<Employee> iterator = employees.iterator();
		
		while(iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
		System.out.println();
		
		for (Employee employee : employees) {
			System.out.println(employee);
			System.out.println();
		}
	}
}
