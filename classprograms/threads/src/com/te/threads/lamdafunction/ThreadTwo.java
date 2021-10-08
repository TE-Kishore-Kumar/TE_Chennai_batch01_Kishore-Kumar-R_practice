package com.te.threads.lamdafunction;

public class ThreadTwo extends Thread{

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}
}
