package com.te.firstassignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial {

	public void serialization(String fileName) {
		
		Example ex = new Example();
		
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ex);
			System.out.println("Writing Object Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deSerialization(String fileName) {
		
		try {
			FileInputStream fis;
			fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Example obj =(Example) ois.readObject();
			System.out.println("Reading Object Completeted");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
