package com.te.collectionimpl.sorting;

import java.util.Comparator;

import com.te.collectionimpl.setimpl.Employee;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
