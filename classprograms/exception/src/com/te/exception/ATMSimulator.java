package com.te.exception;

public class ATMSimulator {

	private Long balance;

	public ATMSimulator() {
		this.balance = 10000l;
	}

	public Long getBalance() {
		return this.balance;
	}

	public void withDraw(Long withDrawAmount) throws InSufficientBalance {
		if (withDrawAmount <= balance) {
			this.balance -= withDrawAmount;
			System.out.println("With Draw Successfull");
			System.out.println("Current Balance : " + getBalance());
		} else {
			throw  new InSufficientBalance("Insufficient Amount");
		}
	}

	public void deposite(Long depositeAmount) throws InSufficientBalance {
		if (depositeAmount >= 100) {
			this.balance += depositeAmount;
			System.out.println("Deposite Successfull");
			System.out.println("Current Balance : " + getBalance());
		} else {
			throw new InSufficientBalance("Amount Should be more than 100");
		}
	}
}
