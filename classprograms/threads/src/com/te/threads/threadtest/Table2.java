package com.te.threads.threadtest;

public class Table2 {

	public void tableInfo(int a) {
		System.out.println("Table Starts "+a);
		for (int i = 1; i < 11; i++) {
			System.out.println(i * a);
		}
		System.out.println("Table Completed "+a);
		System.out.println();
	}
}
