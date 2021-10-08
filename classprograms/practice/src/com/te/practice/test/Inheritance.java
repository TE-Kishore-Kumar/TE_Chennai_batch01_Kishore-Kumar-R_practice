package com.te.practice.test;

class InstagramOld {
	void postPhotos() {
		System.out.println("Posting Photos...");
	}
}

class InstagramNew extends InstagramOld{
	void directMessage() {
		System.out.println("Sending Message");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		InstagramOld ref = new InstagramOld();
		ref.postPhotos();
		
		InstagramNew ref1 = new InstagramNew();
		ref1.postPhotos();
		ref1.directMessage();
	}
}
