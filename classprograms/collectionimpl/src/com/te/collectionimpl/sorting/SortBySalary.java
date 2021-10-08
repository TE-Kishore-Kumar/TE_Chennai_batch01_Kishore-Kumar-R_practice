package com.te.collectionimpl.sorting;

import java.util.Comparator;

import com.te.collectionimpl.setimpl.Employee;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)( o1.getSalary() - o2.getSalary());
	}
}
