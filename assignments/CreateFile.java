package com.te.assignments;

import java.io.File;
import java.io.IOException;

public class CreateFile {

public void file() {
		
		File ref = new File("D:/Ki/Java.doc");
		boolean b = ref.exists();
		if(b==false) {
			try {
				ref.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File Created");
		} else {
			System.out.println("File Exists");
		}
	}
}
