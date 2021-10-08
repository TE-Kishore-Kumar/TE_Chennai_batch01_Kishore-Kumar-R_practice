package com.te.exception;



public class ATMUtil {

	public static ATMSimulator pinCheck(int pin) {
		if (pin == 1880) {
			return new ATMSimulator();
		}else{
			throw new InvalidCredentialsException("Wrong Pin , try again Later..!!");
		}
	}
}
