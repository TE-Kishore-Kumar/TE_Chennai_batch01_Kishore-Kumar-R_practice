package com.te.practice.work;

public class TryMultipleCatch {

	public void test() {
		
		String str = "Developers";
		
		try {
			System.out.println(str.charAt(5));
		} catch (NullPointerException e) {
			System.out.println("Operation with Null Reference");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}
}
