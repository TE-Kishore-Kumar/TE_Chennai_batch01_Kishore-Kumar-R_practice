package com.te.practice.test;

class Message {
	void run(int a) {
		System.out.println("Hi");
	}
	
	void run(int a, int b) {
		System.out.println("Hello");
	}
	
	void run(int a, String s) {
		System.out.println("hiiiii");
	}
}

public class Overloading {

	public static void main(String[] args) {
		
		Message ref = new Message();
		ref.run(12);
		ref.run(12, 13);
		ref.run(12, "acd");
	}
}
