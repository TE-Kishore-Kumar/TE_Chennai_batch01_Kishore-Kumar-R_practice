package com.te.threads.race;

public class BankTest1 {

	public static void main(String[] args) {

		final Bank1 bank = new Bank1();

		Runnable wd = () -> {
			bank.withDraw(15000);
		};

		Runnable de = () -> {
			bank.deposit(10000);
		};

		new Thread(wd).start();
		new Thread(de).start();
	}
}
