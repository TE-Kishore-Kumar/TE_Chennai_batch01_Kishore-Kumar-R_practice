package com.te.practice.test;

interface Alpha{
	void send();
}

interface Beta{
	void run();
}

class Gamma implements Alpha,Beta {
	@Override
	public void send() {
		System.out.println("Executing Send....");
	}
	
	@Override
	public void run() {
		System.out.println("Executing run.....");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Alpha a = new Gamma();
		a.send();
		
		Beta b = new Gamma();
		b.run();
		
		Gamma g = new Gamma();
		g.send();
		g.run();
	}
}
