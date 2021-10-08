package com.te.exception;

import java.util.Scanner;

public class ATMTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Welcome to TamilNadu Mercantile Bank ATM ");
		System.out.println("Enter the PIN : ");
		int pin = scanner.nextInt();
		ATMSimulator atmSimulator = null;
		try {
			atmSimulator = ATMUtil.pinCheck(pin);
			System.out.println(atmSimulator.getBalance()); //10000
			atmSimulator.deposite(1000L);//11000
			atmSimulator.withDraw(100000l);// exp
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Any Time Money -_- ");
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
