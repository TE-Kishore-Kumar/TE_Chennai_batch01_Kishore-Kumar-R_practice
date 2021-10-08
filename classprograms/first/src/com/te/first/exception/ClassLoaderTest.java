package com.te.first.exception;

import com.te.first.test.Employee;

public class ClassLoaderTest {

	public static void main(String[] args) {
		
		try {
			Employee employee = (Employee) Class.forName("com.te.exceptions.Employee").newInstance();
			System.out.println(employee);
			System.out.println("Loaded Successfully");
		} catch (Exception e) {
			System.out.println("Class Exception");
			e.printStackTrace();
		}
	}
}
