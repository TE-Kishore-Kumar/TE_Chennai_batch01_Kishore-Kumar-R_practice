package com.te.firstassignments;

import java.io.File;

public class DeleteFile {

	void del() {
		File ref = new File("D:\\JDrive\\Demo.txt");
		boolean b = ref.exists();
		
		if(b==true) {
			ref.delete();
			System.out.println("File Deleted");
		} else {
			System.out.println("File not Found");
		}
	}
}
