package com.te.firstassignments;

import java.util.Scanner;

public class Assignment7 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int n = scn.nextInt();
		
		for(int i=0; i<n; i++) {
			if(i>=n/2) {
				for(int j=0; j<n; j++) {
					if(i==j || i+j==n-1) {
						System.out.print("*"+" ");
					} else {
						System.out.print(" "+" ");
					}
				}
				for(int j=0; j<n; j++) {
					if(i==j || i+j==n-1) {
						System.out.print("*"+" ");
					} else {
						System.out.print(" "+" ");
					}
				}
				for(int j=0; j<n; j++) {
					if(i==j || i+j==n-1) {
						System.out.print("*"+" ");
					} else {
						System.out.print(" "+" ");
					}
				}
				System.out.println();
				scn.close();
			}
		}
	}
}
