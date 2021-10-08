package com.te.myarrayimpl;

public class MyArrayV1 {

	private int[] arr;
	private int position = 0;
	private final int DEFAULT_SIZE = 5;
	
	public MyArrayV1() {
		arr = new int[DEFAULT_SIZE];
	}
	
	public MyArrayV1(int initSize) {
		arr = new int[initSize];
	}
	
	public boolean add(int element) {
		if(position < arr.length) {
			arr[position++] = element;
		} else {
			//calculating new Size
			int newSize = arr.length + (arr.length/2);
			int[] arr2 = new int[newSize];
			
			//copying the old array to new Array
			for(int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;//reassign
			arr[position++] = element;
		}
		return true;
	}
	public int get(int index) {
		return arr[index];
	}
	
	public int size() {
		return arr.length;
	} 
}
