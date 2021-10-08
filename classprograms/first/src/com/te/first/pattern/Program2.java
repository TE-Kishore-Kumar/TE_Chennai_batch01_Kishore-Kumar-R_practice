package com.te.first.pattern;

public class Program2 {
	
	public static void main(String[] args) {
		int n=4;
		int spc=n-1;
		int str=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<spc;j++) {
				System.out.print(" "+" ");
			}
			for(int k=0;k<str;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			spc--;
			str=str+2;
		}
	}

}
