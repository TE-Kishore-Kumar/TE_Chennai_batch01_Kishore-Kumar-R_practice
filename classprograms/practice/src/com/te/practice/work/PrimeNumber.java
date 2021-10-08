package com.te.practice.work;

import java.util.Scanner;

public class PrimeNumber {

	public void pgr() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = scn.nextInt();
		int i = 2;
		while(i <= num/2) {
			if(num % i == 0) {
				break;
			}
			i++;
		}
		String msg = i>num/2 ? "Prime Number" : "Not a Prime Number";
		System.out.println("The given Number is : "+msg);
		scn.close();
	}
}
