package com.te.java8featurs;

import java.util.ArrayList;
import java.util.List;

public class ListJava8Methods {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(11);
		integers.add(7);
		integers.add(17);
		integers.add(74);
		integers.add(1);
		integers.add(9);
		integers.add(3);

		/*
		 * System.out.println(" org "+integers);
		 * integers.forEach(a->System.out.println(a*a));
		 * System.out.println(" after forEach "+integers);
		 * 
		 * System.out.println("-------- method ref(non static --------)");
		 * integers.forEach(System.out::println);
		 * 
		 * System.out.println("-------- method ref(static) --------");
		 * integers.forEach(ListJava8Methods::getData);
		 */

//		integers.removeIf(x -> {
//			return x > 7;
//		});

//		integers.removeIf(x -> x > 7);

		integers.removeIf(ListJava8Methods::filter);

		System.out.println("after remove If" + integers);
	}

	public static void getData(int a) {
		System.out.println(a + "from other method");
	}

	public static boolean filter(int a) {
		return a > 7;
	}
}
