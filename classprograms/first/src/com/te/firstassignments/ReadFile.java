package com.te.firstassignments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public void read() {
		
		FileReader ref = null;
		try {
			ref = new FileReader("D:\\JDrive\\java.doc");
			int val = ref.read();
			while(val != -1) {
				System.out.print((char)val);
				val = ref.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ref.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
