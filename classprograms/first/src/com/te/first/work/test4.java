package com.te.first.work;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = scn.next();
		String cp = s;
		boolean flag = true;
		char[] ch = s.toCharArray();
		s = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			s = s + ch[i];
		}
		for (int j = 0; j <= s.length() / 2; j++) {
			if (s.charAt(j) != s.charAt(s.length() - 1) - j)
				flag = false;
			break;
		}

		System.out.println("After Reverse: " + s);
		String msg = flag == true ? "Yes" : "No";
		System.out.println("Palindrome: " + msg);
		scn.close();

	}

}
