package com.te.exception.throwtest;

import com.te.exception.InvalidCredentialsException;

public class LoginToAdmin {

	public void login(String user, String pwd) {
		
		if(user.equalsIgnoreCase("admin")) {
			if(pwd.equalsIgnoreCase("admin123")) {
				System.out.println("Logged in Successfully");
			} else {
				throw new InvalidCredentialsException("Wrong Password");
			}
		} else {
			throw new InvalidCredentialsException("Wrong credentials");
		}
	}
}
