package com.te.myarrayimpl;

public class MyArrayTestV3 {

public static void main(String[] args) {
		
		MyArrayV3 array = new MyArrayV3(4);
		
		System.out.println(array.add(10));
		System.out.println(array.add(20));
		System.out.println(array.add(30));
		System.out.println(array.add(40));
		System.out.println(array.add(50));//exception
		System.out.println("-------------");
		System.out.println(array);
	}
}
