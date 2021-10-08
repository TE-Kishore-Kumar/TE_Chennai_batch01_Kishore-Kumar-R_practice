package com.te.practice.test;

class Demo1{
	Demo1(int a){
		System.out.println("Aim");
	}
	
	Demo1(int a, int b){
		System.out.println("Higher");
	}
	
	Demo1(int a, String s){
		System.out.println("Believe");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1(10);
		Demo1 d2 = new Demo1(10,12);
		Demo1 d3 = new Demo1(10,"asd");
	}
}
