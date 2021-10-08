package com.te.threads.runnableimpl;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("--------- ThreadTwo Started ---------");
		int[] number = {0,6,4,1,9,9,8};
		for (int i : number) {
			System.out.println(i);
		}
		System.out.println("-------- ThreadTwo Ended ---------");
	}
}
