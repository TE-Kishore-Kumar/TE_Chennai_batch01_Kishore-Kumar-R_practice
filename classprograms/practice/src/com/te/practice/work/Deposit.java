package com.te.practice.work;

public class Deposit extends BankAccount {

	static void deposit(int depositeamt) {

		accBal += depositamt;
		System.out.println("Available Account balance : " + accBal);
		System.out.println("deposit successfull");

	}
}
