package com.te.first.work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		try {
			System.out.println(x/y);
		} catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: /by zero");
		} finally {
			scn.close();
		}
		

	}

}
