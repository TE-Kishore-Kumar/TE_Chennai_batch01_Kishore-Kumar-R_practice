package com.te.threads.race;

public class BankTest {

	public static void main(String[] args) {
		
		final Bank bank = new Bank();
		
		Runnable wd = () -> {
			bank.withDraw(15000);
		};
		
		Runnable de = () -> {
			bank.deposite(10000);
		};
		
		new Thread(wd).start();
		new Thread(de).start();
	}
}
