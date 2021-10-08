package com.te.firstassignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public void write() {
		
		FileWriter ref = null;
		try {
			ref = new FileWriter("D:\\JDrive\\java.doc");
			ref.write("Java is a high-level, class-based, object-");
			ref.write("\n");
			ref.write("oriented programming language that is designed");
			ref.write("\n");
			ref.write("to have as few implementation dependencies as possible.");
			ref.flush();
			System.out.println("Data Transfer Complete");
		} catch (IOException e) {
			
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
