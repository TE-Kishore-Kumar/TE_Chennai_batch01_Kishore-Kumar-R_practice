package com.te.collectionimpl.listimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(10, "Kevin"));
		list.add(new Student(80, "Vignesh"));
		list.add(new Student(20, "Paul"));
		list.add(new Student(7, "Stark"));

		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("After sort");
		Collections.sort(list);

		for (Student student : list) {
			System.out.println(student);
		}
	}
}
