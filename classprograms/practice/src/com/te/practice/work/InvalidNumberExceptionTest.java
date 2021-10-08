package com.te.practice.work;

public class InvalidNumberExceptionTest {

	static void verifyMobileNumber(String number) throws InvalidNumberException{
		
		if(number.length() != 10 || number.startsWith("0")) {
			throw new InvalidNumberException();
		} else {
			System.out.println("All is Well");
		}
	} 
	
	public static void main(String[] args) {
		
		try {
			verifyMobileNumber("7892722348");
		} catch (InvalidNumberException e) {
			System.out.println("Please Provide Valid Mobile Number");
		}
	}
}
