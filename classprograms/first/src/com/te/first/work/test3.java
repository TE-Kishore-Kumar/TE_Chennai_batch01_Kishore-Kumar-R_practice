package com.te.first.work;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Value:");
		int n = scn.nextInt();
		for (int i = 1; i <= 10; i++) {
			int m = n * i;
			System.out.println(n + "*" + i + "=" + m);
		}
	}

}
