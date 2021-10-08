package com.te.firstassignments;

public class AssignmentString {
	
	public static void main(String[] args) {
		
		String str = "wonderful";
		String str1 = "  Test Engineer ";
		String str2 = "Java is an object oriented Language";
		char[] ch = str.toCharArray();
		String[] arr = str2.split(" ");
		
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('u'));
		System.out.println(str.contains("onder"));
		System.out.println(str.startsWith("won"));
		System.out.println(str.endsWith("ful"));
		System.out.println(str.equals("wonderful"));
		System.out.println(str.equalsIgnoreCase("Wonderful"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(0, 4));
		System.out.println(str1.trim());
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
