package com.te.threads.runnableimpl;

public class ThreadOne implements Runnable {

	@Override
	public void run() {
		System.out.println("-------- ThreadOne Started ---------");
		String[] names = {"K", "i", "s", "h", "o", "r", "e"};
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("--------- ThreadOne Ended ---------");
	}
}
