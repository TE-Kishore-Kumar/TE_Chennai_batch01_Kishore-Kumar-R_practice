package com.te.mapinterface.hashmapimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TreeMapImpls {

	public static void main(String[] args) {
		// Creating a HashSet
		HashSet<String> hset = new HashSet<String>();

		// Adding new elements to the HashSet
		hset.add("Big Data");
		hset.add("Node.js");
		hset.add("Java");
		hset.add("Python");
		hset.add("Blockchain");
		hset.add("JavaScript");
		hset.add("Selenium");
		hset.add("AWS");
		hset.add("Machine Learning");
		hset.add("RPA");

		// Adding duplicate elements will be ignored
		hset.add("Java");
		hset.add("RPA");

		System.out.println(hset);

		// Check if the HashSet contains an specific element
		String myCourse = "Node.js";
		if (hset.contains(myCourse)) {
			System.out.println(myCourse + " is in the courses list.");
		} else {
			System.out.println(myCourse + " is not in the courses list.");
		}

		// Sorting eduCourses using List
		List<String> list = new ArrayList<String>(hset);
		Collections.sort(list);

		// Printing the sorted elements of the HashSet
		System.out.println("Printing the Courses in sorted order using List: " + list);

		// Removing items from HashSet using remove()
		hset.remove("Python");

		// Iterating over HashSet items
		System.out.println("Iterating over course list after removing Python:");
		Iterator<String> i = hset.iterator();
		while (i.hasNext())
			System.out.println(i.next());

		// Creating another object of HashSet
		HashSet<String> eduNewCourses = new HashSet<String>();
		eduNewCourses.add("Node.js");
		eduNewCourses.add("Python");
		eduNewCourses.add("Machine Learning");

		// Removing all the new elements from HashSet
		hset.removeAll(eduNewCourses);
		System.out.println("After invoking removeAll() method courses left: " + hset);

		// Removing elements on the basis of specified condition
		hset.removeIf(str -> str.contains("Java"));
		System.out.println("After invoking removeIf() method: " + hset);

		// Removing elements from eduCourses which are specified in eduNewCourses
		hset.retainAll(eduNewCourses);
		System.out.println("HashSet after " + "retainAll() operation : " + eduNewCourses);

		// Removing all the elements available in the set
		hset.clear();
		System.out.println("After invoking clear() method: " + hset);

	}
}
