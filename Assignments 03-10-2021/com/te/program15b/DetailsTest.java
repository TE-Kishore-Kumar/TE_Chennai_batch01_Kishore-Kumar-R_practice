package com.te.program15b;

import com.te.program15a.Details;

public class DetailsTest {

public static void main(String[] args) {
		
		Details v1 = new Details();
		
		//Access static variable
		System.out.println(Details.name);
		
	    //Access non static variable
		System.out.println(v1.age);
		System.out.println(v1.salary);
	}
}
