package com.te.practice.test;

abstract class Android{
	void calling() {
		System.out.println("Calling");
	}
	
	void Messaging() {
		System.out.println("Messaging");
	}
	
	abstract void ui();
}

class Miui extends Android{
	@Override
	void ui() {
		System.out.println("Redmi");
	}
}

class FunTouchOs extends Android{
	@Override
	void ui() {
		System.out.println("Vivo");
	}
}

class ColorOs extends Android{
	@Override
	void ui() {
		System.out.println("Oppo");
	}
}
public class Abstract {

	public static void main(String[] args) {
		
		Android ap;
		ap = new Miui();
		ap.calling();
		ap.Messaging();
		ap.ui();
		
		ap = new FunTouchOs();
		ap.calling();
		ap.Messaging();
		ap.ui();
		
		ap = new ColorOs();
		ap.calling();
		ap.Messaging();
		ap.ui();
	}
}
