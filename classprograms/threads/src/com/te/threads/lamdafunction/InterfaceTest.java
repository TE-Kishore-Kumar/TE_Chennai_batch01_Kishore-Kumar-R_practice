package com.te.threads.lamdafunction;

public class InterfaceTest {

	public static void main(String[] args) {

		MyInterface1 ref = () -> {
			System.out.println("Inside the count method");
		};

		MyInterface1 ref1 = () -> {
			System.out.println("One more impl");
		};

		MyInterface1 ref2 = () -> {
			System.out.println("again one more impl");
		};
		
		ref.count();
		ref1.count();
		ref2.count();
	}
}
