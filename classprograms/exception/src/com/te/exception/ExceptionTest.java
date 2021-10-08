package com.te.exception;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			
			try {
				int a =10;
				int b = 0;
				int c = a/b;
			} catch (ArithmeticException e) {
				System.out.println("Divide by zero is not possible in Java");
			}
			
			System.out.println("This is Executed");
			String name = null;
			
			System.out.println(name.length());
			
		} catch (NullPointerException e) {
			System.out.println("String is null");
		}
		
		System.out.println("Hi");
	}
}
