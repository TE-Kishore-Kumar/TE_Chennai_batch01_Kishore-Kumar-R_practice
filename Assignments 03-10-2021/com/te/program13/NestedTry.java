package com.te.program13;

public class NestedTry {

	public void test() {
		try {

			try {
				int a = 49 / 3;
				System.out.println(a);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception...");
			}

			try {
				int[] b = new int[5];
				b[5] = 6;
				System.out.println(b);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bound Excption");
			}

		} catch (Exception e) {
			System.out.println("Outer Try and Catch");
		}
	}
}
