package com.te.assignments;

import java.io.File;

public class CreateFolder {
	
	public void folder() {
		File ref = new File("D:\\Ki");
		boolean b = ref.exists();
		
			if(b == false) {
			ref.mkdir();
			System.out.println("Folder Created");
			} else {
			System.out.println("Folder exists");
			}
		
		}
}
