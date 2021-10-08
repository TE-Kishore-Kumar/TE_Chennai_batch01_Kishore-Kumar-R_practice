package com.te.practice.test;

class A {
	void run() {
		System.out.println("Executing run()......");
	}
}

class B extends A {
	void disp() {
		System.out.println("Executing disp()......");
	}
}

class C extends B {
	void test() {
		System.out.println("Executing test()......");
	}
}

class D extends B {
	void play() {
		System.out.println("Executing play()......");
	}
}

public class Inheritance1 {
	
	public static void main(String[] args) {
		
		A ref = new A();
		ref.run();
		
		B ref1 = new B();
		ref1.disp();
		ref1.run();
		
		C ref2 = new C();
		ref2.run();
		ref2.test();
		ref2.disp();
		
		D ref3 = new D();
		ref3.disp();
		ref3.play();
		ref3.run();
	}
}
