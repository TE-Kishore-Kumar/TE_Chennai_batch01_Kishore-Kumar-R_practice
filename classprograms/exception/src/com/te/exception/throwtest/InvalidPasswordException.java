package com.te.exception.throwtest;

public class InvalidPasswordException extends Exception{

	public InvalidPasswordException(String msg) {
		super(msg);
	}
}
