package com.te.exception.throwtest;

public class LoginCredentials {

	public static void loginPage(String name, String password) throws InvalidUsernameException, InvalidPasswordException {
		if(name == "Kishore") {
			System.out.println("Valid username");
		}else {
			throw new InvalidUsernameException("Invalid Username");
		}
		
		if(password == "1234") {
			System.out.println("Valid Password");
		}else {
			throw new InvalidPasswordException("Invalid Password");
		}
	} 
}
