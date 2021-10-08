package com.te.practice.test;

class Amazon{
	
	void payment(int a) {
		System.out.println("Cash on Delivery");
	}
	
	void payment(String upi) {
		System.out.println("Gateway Payment");
	}
	
	void payment(long card) {
		System.out.println("Card Payement");
	}
	
	void payement(String name, String pwd) {
		System.out.println("Payment Processing....");
	}
}
public class MethodOverloading {
	
	public static void main(String[] args) {
		
		Amazon pay = new Amazon();
		
		pay.payment(8);
		pay.payment("kishore@upi");
		pay.payment(123l);
		pay.payement("Kishore", "12345");
	}
}
