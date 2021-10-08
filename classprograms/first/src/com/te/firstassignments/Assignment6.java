package com.te.firstassignments;

public class Assignment6 {
	
	public static void main(String[] args) {
		
		String str = "kishore";
		char[] ch = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<ch.length; j++) {
				if(i==j || i+j==str.length()-1) {
					System.out.print(ch[j]+" ");
				} else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
