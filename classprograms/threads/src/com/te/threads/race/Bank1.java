package com.te.threads.race;

public class Bank1 {

int amount = 10000;
	
	public synchronized void withDraw(int money) {
		System.out.println("Going to withdraw.....");
		if(money > amount) {
			System.out.println("Less Balance..!! Waiting for deposit");
			try {
				wait(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		amount -= money;
		System.out.println("Withdraw Successful");
	}
	
	public synchronized void deposit(int money) {
	
		System.out.println("Depositing Money");
		amount += money;
		System.out.println("Deposit Successfull");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
}
