package com.te.practice.test;

class FacebookOld {
	
	void reaction() {
		System.out.println("Like");
	}
}

class FacebookNew extends FacebookOld {
	
	@Override
	void reaction() {
		System.out.println("Like,sad,angry");
		
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		
		FacebookOld ref = new FacebookNew();
		FacebookOld ref1 = new FacebookOld();
		FacebookNew ref2 = new FacebookNew();
		ref.reaction();
		ref1.reaction();
		ref2.reaction();
	}
}
