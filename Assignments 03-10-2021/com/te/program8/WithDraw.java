package com.te.program8;

public class WithDraw extends BankAccount {

	static void withDraw() {

		if (accBal > amt) {
			System.out.println("Withdrawa Success...");
		} else {
			System.out.println("Insufficient Balance...");
		}
	}
}
