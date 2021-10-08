package com.te.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\kisho\\Desktop\\File.txt");
			Scanner scn = new Scanner (file);
			
			while(scn.hasNext()) {
				System.out.println(scn.nextLine());
			}
			scn.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
