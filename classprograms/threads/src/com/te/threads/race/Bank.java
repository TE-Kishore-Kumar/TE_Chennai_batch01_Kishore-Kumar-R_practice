package com.te.threads.race;

public class Bank {

	int amount = 10000;
	
	public synchronized void withDraw(int money) {
		System.out.println("Going to withdrar.....");
		if(money > amount) {
			System.out.println("Less Balance..!! Waiting for deposite");
		}
		amount -= money;
		System.out.println("Withdraw Successful");
	}
	
	public synchronized void deposite(int money) {
	
		System.out.println("Depositing Money");
		amount += money;
		System.out.println("Deposite Successfull");
	}
}
