package com.te.practice.test;

public class StrongNumber {

	public static void main(String[] args) {
		
		int num = 145;
		int sum =0;
		int cp = num;
		
		while(num>0) {
			int n = num % 10;
			int fact = 1;
			while(n>0) {
				fact = fact*n;
				n--;
			}
			sum = sum+fact;
			num = num/10;
		}
		String msg = cp==num ? "Strong Number" : "Not a Strong Number";
		System.out.println(msg);
	}
}
