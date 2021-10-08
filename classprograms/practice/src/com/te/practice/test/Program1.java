package com.te.practice.test;

public class Program1 {

	static void verifyMobileNumber(String number) throws InvalidNumberException {
		if(number.length() != 10 || number.startsWith("0")) {
			throw new InvalidNumberException("Invalid Number");
		} else {
			System.out.println("Valid NUmber");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			verifyMobileNumber("701097562");
		} catch (InvalidNumberException e) {
			System.out.println("Invalid Number");	
		}
	}
}
