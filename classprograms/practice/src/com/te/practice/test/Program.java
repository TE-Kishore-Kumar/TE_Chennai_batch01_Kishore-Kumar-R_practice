package com.te.practice.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value");
		
		try {
			int n = scn.nextInt();
			System.out.println("the Entered Number is "+n);
		} catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		} finally {
			scn.close();
			System.out.println("Scanner Closed");
		}
	}
}
