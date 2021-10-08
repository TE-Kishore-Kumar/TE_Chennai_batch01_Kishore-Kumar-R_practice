package com.te.practice.test;
class Demo{
	int a = 11;
	void run() {
		System.out.println("Running");
	}
	static int b = 10;
	static void test() {
		System.out.println("Testing");
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		System.out.println(Demo.b);
		Demo.test();
		Demo ref = new Demo();
		ref.run();
		System.out.println(ref.a);
	}
}
