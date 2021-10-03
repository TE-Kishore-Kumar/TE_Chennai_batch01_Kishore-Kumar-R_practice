package com.te.program3;

public class NumberOfArgs {

	public static void main(String[] args) {
		
		 int count = 0;
			
			for (int i = 0; i < args.length; i++) {
				count ++;
			}
			System.out.println(count);
	}
}
