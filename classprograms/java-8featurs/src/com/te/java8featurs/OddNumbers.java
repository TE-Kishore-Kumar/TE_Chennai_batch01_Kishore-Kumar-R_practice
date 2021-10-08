package com.te.java8featurs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddNumbers {

	public static void main(String[] args) {
		
		List<Integer> integer = new ArrayList<Integer>();
		
		integer.add(10);
		integer.add(7);
		integer.add(13);
		integer.add(15);
		integer.add(18);
		integer.add(6);
		
		System.out.println("Original Integers "+ integer);
		
		List<Integer> odd = integer.stream().map((a) -> {
			if(a % 2 != 0) {
				return a;
			} else {
				return a - 1;
			}
		}).collect(Collectors.toList());
		System.out.println(odd);
		
		List<Integer> even = integer.stream().map((a) -> {
			if(a % 2 == 0) {
				return a;
			} else {
				return a + 1;
			}
		}).collect(Collectors.toList());
		System.out.println(even);
		
		List<Double> squarert = integer.stream().map(a->Math.sqrt(a)).collect(Collectors.toList());
			System.out.println(squarert);
	}
}
