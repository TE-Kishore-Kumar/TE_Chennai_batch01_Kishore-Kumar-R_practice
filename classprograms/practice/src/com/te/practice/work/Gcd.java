package com.te.practice.work;

import java.util.Scanner;

public class Gcd {

	public void gcd1() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number");
		int a = scn.nextInt();
		System.out.println("Enter the 2nd Number");
		int b = scn.nextInt();
		int gcd = 1;
		
		for(int i = 1; i <= a && i <=b; i++) {
			
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of "+a+" and "+b+" is "+gcd);
		scn.close();
	}
}
