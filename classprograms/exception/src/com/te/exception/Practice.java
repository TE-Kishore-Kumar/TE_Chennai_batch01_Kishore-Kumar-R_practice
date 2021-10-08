package com.te.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice {

	public void getData(int a, int b, String fileName) {
		System.out.println(divide(a,b));
		fileReader(fileName);
	}
	
	public int divide(int a, int b) {
		if(a>0 && b>0) {
			return a / b;
		} else {
			return 0;
		}
	}
	
	public void fileReader(String fileName) {
		
		try {
			Scanner scn = new Scanner (new File(fileName));
			
			while(scn.hasNext()) {
				System.out.println(scn.nextLine());
			}
			scn.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
