package com.te.threads.lamdafunction;

public class ThreadOne extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
	}
}
