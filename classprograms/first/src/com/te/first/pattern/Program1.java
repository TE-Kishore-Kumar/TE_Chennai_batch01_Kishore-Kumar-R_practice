package com.te.first.pattern;

public class Program1 {
	
	public static void main(String[] args) {
		int n=4;
		int sp=n-1;
		int st=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<sp;j++) {
				System.out.print(" "+" ");
			}
			for(int k=0;k<st;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			sp--;
			st=st+2;
		}
	}

}
