package com.te.threads.lamdafunction;

public class InterfaceTest2 {

	public static void main(String[] args) {
		
		MyInterface2 ref = (a) -> {
			System.out.println("First Impl");
			System.out.println(a);
		};
		
		MyInterface2 ref1 = (c) -> {
			System.out.println("Second Impl");
			System.out.println(c);
		};
		
		MyInterface2 ref2 = (b) -> {
			System.out.println("Third Impl");
		};
		
		ref.test(10);
		ref1.test(20);
		ref2.test(30);
	}
}
