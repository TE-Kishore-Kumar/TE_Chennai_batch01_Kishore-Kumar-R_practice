package com.te.practice.test;

class Star{
	Star(){
		System.out.println("Star Constructor");
	}
	
	Star(int a){
		this();
		System.out.println("Star int constructor");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		Star s = new Star(15);
	}
}
