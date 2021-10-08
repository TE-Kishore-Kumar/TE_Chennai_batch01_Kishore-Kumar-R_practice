package com.te.firstassignments;

import java.util.Scanner;

public class Assignment5 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = scn.nextInt();
		int b = 2;
		while(b<=a/2) {
			if(a%b==0) {
				break;
			}
			b++;
		}
		
		String msg = (b>a/2) ? "Prime Number" : "Not a Prime Number";
		System.out.println(msg);
		scn.close();
	}
}
