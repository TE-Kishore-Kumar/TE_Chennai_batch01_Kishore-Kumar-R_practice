package com.te.practice.test;

interface Animal{
	void makeNoise();
}

class Dog implements Animal {
	@Override
	public void makeNoise() {
		System.out.println("Bow Bow");
	}
}

class Cat implements Animal {
	@Override
	public void makeNoise() {
		System.out.println("Meow Meow");
	}
}

class Lion implements Animal {
	@Override
	public void makeNoise() {
		System.out.println("Roar Roar");
	}
}

public class Interface {

	public static void main(String[] args) {
		
		Animal a;
		a = new Dog();
		a.makeNoise();
		
		a = new Cat();
		a.makeNoise();
		
		a = new Lion();
		a.makeNoise();
	}
}
