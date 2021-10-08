package com.te.java8featurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITest {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();

		integers.add(11);
		integers.add(7);
		integers.add(17);
		integers.add(74);
		integers.add(1);
		integers.add(9);
		integers.add(3);
		integers.add(11);
		integers.add(7);
		integers.add(17);

		System.out.println("org" + integers);

		// convert manipulated data to list
		List<Integer> mapOutPut = integers.stream().map(x -> x * x).collect(Collectors.toList());

		// convert manipulated data to set
		Set<Integer> mapSetOutPut = integers.stream().map(x -> x * x).collect(Collectors.toSet());

		System.out.println("Map" + mapOutPut);
		System.out.println(mapSetOutPut);
		// integers = mapOutPut; reassign the data
		System.out.println("after map operation" + integers);

		System.out.println("--------- sorted --------");
		// sort the elements in ascending order
		List<Integer> sortedList = integers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println(" org " + integers);

		System.out.println("--------- distinct--------");
		List<Integer> disList = integers.stream().distinct().collect(Collectors.toList());
		System.out.println(" distinct List " + disList);

		System.out.println("--------- count ---------");
		long count = integers.stream().count();
		System.out.println("C ount " + count);

		System.out.println("--------- skip ---------");
		List<Integer> skippedList = integers.stream().skip(5).collect(Collectors.toList());
		System.out.println(" after skip " + skippedList);

		System.out.println("--------- filter --------");
		System.out.println(" org " + integers);
		List<Integer> filteredList = integers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println(" After Filter " + filteredList);

	}
}
