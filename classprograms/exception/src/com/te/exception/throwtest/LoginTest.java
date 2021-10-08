package com.te.exception.throwtest;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) throws IllegalAccessException {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the UserName:");
		String user = scn.next();
		
		System.out.println("Enter the Password:");
		String pwd = scn.next();
		
		LoginToAdmin admin = new LoginToAdmin();
		admin.login(user, pwd);
	}
}
