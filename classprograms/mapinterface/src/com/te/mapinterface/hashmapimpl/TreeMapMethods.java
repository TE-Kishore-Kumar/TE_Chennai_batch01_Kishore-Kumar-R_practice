package com.te.mapinterface.hashmapimpl;

import java.util.TreeSet;

public class TreeMapMethods {

	public static void main(String[] args) {
		
		TreeSet<Integer> integers = new TreeSet<Integer>();
		integers.add(10);
		integers.add(30);
		integers.add(50);
		integers.add(60);
		integers.ceiling(5);
		integers.clone();
		
		System.out.println(integers);
		System.out.println("Contains " + integers.contains(30));
		System.out.println("First Value " + integers.first());
		System.out.println("Last Value " + integers.last());
		System.out.println("Higher " + integers.higher(10));
		System.out.println("Lower " + integers.lower(12));
		
		
		integers.remove(50);
		System.out.println("After removing element " + integers);
		integers.pollFirst();
		System.out.println("After removing first " + integers);
		integers.pollLast();
		System.out.println("After removing last " + integers);
		
		for (Integer value : integers) {
			System.out.print(value + " ");
			System.out.println();
		}
	}
}
