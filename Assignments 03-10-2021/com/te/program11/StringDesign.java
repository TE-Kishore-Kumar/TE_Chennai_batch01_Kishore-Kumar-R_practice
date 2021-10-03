package com.te.program11;

public class StringDesign {

	public void test() {

		String str = "Engineer";

		System.out.println("String is Equal : " + str.equals("engineer"));
		System.out.println("String in UpperCase : " + str.toUpperCase());
		System.out.println("String in LowerCase : " + str.toLowerCase());

		char[] ch = str.toCharArray();
		str = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			str = str + ch[i];
		}
		System.out.println("Reverse String : " + str);

	}
}
