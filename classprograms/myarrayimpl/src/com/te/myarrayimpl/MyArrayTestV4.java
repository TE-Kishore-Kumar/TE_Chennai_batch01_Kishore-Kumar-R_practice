package com.te.myarrayimpl;

public class MyArrayTestV4 {
	
	public static void main(String[] args) {
	
		MyArrayV4 array = new MyArrayV4();
		System.out.println(array.size());//0
		
		System.out.println(array.add(10));
		System.out.println(array.add("abc"));
		System.out.println(array.add(true));
		System.out.println(array.add('c'));
		System.out.println(array.add(null));
		
		System.out.println(array.size());//5
		System.out.println("------ after adding extra elements -----");
		System.out.println(array.add(60));
		System.out.println(array.size());//6
		
		System.out.println("Reading data");
		System.out.println(array);
		
		System.out.println(" Setting the Values ");
		array.set(4, 90);
		array.set(0, 99);
		
		System.out.println(array);
		
		System.out.println("Removing the element by index");
		System.out.println("Before Removing ----> "+array.size());//6
		array.remove(0);
		array.remove(5);
		System.out.println("After Removing -----> "+array.size());//4
		System.out.println(array);
}
}
