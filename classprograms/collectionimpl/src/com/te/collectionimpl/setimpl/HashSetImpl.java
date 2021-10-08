package com.te.collectionimpl.setimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {
	
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(100);
		System.out.println("For each");

		for (Integer integer : set) {
			System.out.println(integer);
		}

		System.out.println("Itereator");

		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ArrayList<Integer> arrayList = new ArrayList<Integer>(set);
		System.out.println("Before Sort " + arrayList);
		Collections.sort(arrayList);
		System.out.println("After Sorting " + arrayList);
		
		System.out.println("------- remove(data) and remove(object) -------");
		set.remove(0);
		set.remove(new Integer(100));
		System.out.println(set);
	}
}