package com.te.collectionimpl.sorting;

import java.util.Scanner;
import java.util.TreeSet;

import com.te.collectionimpl.setimpl.Employee;

public class TreeSortEmployeeDetails {

	public static void main(String[] args) {

		System.out.println("Sort By \n 1.Id \n 2.Name \n 3.Salary \n 4.Client");
		System.out.println("Choose Your Option");
		Scanner scn = new Scanner(System.in);
		int optn = scn.nextInt();

		TreeSet<Employee> employees = null;

		switch (optn) {
		case 1:
			employees = new TreeSet<Employee>();
			break;
		case 2:
			employees = new TreeSet<Employee>(new SortByName());
			break;
		case 3:
			employees = new TreeSet<Employee>(new SortBySalary());
			break;
		case 4:
			employees = new TreeSet<Employee>(new SortByClient());
			break;
		default:
			System.out.println("Wrong Option");
			break;
		}

		if (employees != null) {
			Employee employee1 = new Employee(90, "Praveen", "Developer", 90000.9, "Bosh");
			Employee employee2 = new Employee(70, "Hulk", "Destructor", 100000.9, "Marvel");
			Employee employee3 = new Employee(80, "Thor", "Thunder", 20900.9, "Asgard");
			Employee employee4 = new Employee(20, "Lucifer", "Monster", 70090.9, "AnyWhere");
			Employee employee5 = new Employee(10, "SuperMan", "Reporter", 90000.9, "Dc");

			employees.add(employee1);
			employees.add(employee2);
			employees.add(employee3);
			employees.add(employee4);
			employees.add(employee5);

			for (Employee employee : employees) {
				System.out.println(employee);
			}
			scn.close();
		}
	}
}
