package com.te.threads.runnableimpl;

public class RunnableLamdaFunction {

	public static void main(String[] args) {
		
		System.out.println("-------- Main Started --------");
		Runnable ref = () -> {
				System.out.println("-------- ThreadOne Started ---------");
				String[] names = {"K", "i", "s", "h", "o", "r", "e"};
				for (String name : names) {
					System.out.println(name);
				}
				System.out.println("--------- ThreadOne Ended ---------");
		};
		
		Runnable ref1 = () -> {
			System.out.println("--------- ThreadTwo Started ---------");
			int[] number = {0,6,4,1,9,9,8};
			for (int i : number) {
				System.out.println(i);
			}
			System.out.println("-------- ThreadTwo Ended ---------");
		};
		
		Thread thread1 = new Thread(ref);
		Thread thread2 = new Thread(ref1);
		
		thread1.start();
		thread2.start();
		
		System.out.println("--------- Main Ended --------");
	}
}
