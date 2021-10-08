package com.te.mock;

class FacebookOld1{
	
	void response() {
		System.out.println("Like");
	}
}

class FacebookNew1 extends FacebookOld1{
	
	@Override
	void response() {
		System.out.println("Like,Angry,Sad,Wow");
	}
}

public class Program2 {

	public static void main(String[] args) {
		
		FacebookOld1 ref = new FacebookNew1();
		ref.response();
		
		FacebookNew1 ref1 = (FacebookNew1) ref;
		ref1.response();
	}
}
