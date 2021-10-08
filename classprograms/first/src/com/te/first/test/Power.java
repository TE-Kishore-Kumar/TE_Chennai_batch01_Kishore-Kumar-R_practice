package com.te.first.test;

public class Power {

	int a=10;
	int b=2;
	
	public Power() {
		
	}
	
	public Power(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void answer() {
		System.out.println(Math.pow(a, b));
	}
}
