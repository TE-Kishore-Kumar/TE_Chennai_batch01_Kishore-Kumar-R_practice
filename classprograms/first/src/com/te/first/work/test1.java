package com.te.first.work;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Value :");
		int num= scn.nextInt();

		if (num % 2 != 0) {
			System.out.println("Weird");
		} else if (num% 2 == 0 && num > 2 && num < 5) {
			System.out.println("Not Weird");
		} else if (num % 2 == 0 && num > 6 && num < 20) {
			System.out.println("Weird");
		} else if (num % 2 == 0 && num > 20) {
			System.out.println("Not Weird");
		}

		scn.close();
	}

}
