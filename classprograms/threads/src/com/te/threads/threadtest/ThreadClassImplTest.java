package com.te.threads.threadtest;

import com.te.threads.lamdafunction.ThreadOne;
import com.te.threads.lamdafunction.ThreadTwo;

public class ThreadClassImplTest {

	public static void main(String[] args) {
		
		System.out.println("---------- Main Started -------");
		
		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();
		
		one.start();
		System.out.println("--------");
		two.start();
		
		System.out.println("---------- Main Ends ---------");
	}
}
