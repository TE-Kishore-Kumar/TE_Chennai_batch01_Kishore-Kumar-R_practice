package com.te.exception.throwtest;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		
		try {
			LoginCredentials.loginPage("Kishore", "12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
