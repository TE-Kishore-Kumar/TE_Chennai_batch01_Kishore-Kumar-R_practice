package com.te.practice.test;
class Aim{
	void run() {
		System.out.println("Running");
	}
}

class Ball extends Aim{
	void test() {
		System.out.println("Testing");
	}
}
public class TypeCasting {

	public static void main(String[] args) {
		
		Aim a =new Ball();
		a.run();
		
		Ball b = (Ball) a;
		b.test();
		b.run();
	}
}
