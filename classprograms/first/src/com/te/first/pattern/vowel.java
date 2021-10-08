package com.te.first.pattern;

public class vowel {

	public static void main(String[] args) {
		int n=6;
		int str=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j||i+j==n-1) {
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			for(int k=0;k<n;k++) {
				if(k==0||k==str-2) {
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
	}

}
