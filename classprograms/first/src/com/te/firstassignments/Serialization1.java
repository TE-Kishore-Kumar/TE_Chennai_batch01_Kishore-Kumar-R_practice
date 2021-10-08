package com.te.firstassignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization1  {

	public static void main(String[] args)throws Exception {
		
		Example ex = new Example();
		
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream("D:\\JDrive\\Java.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ex);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		System.out.println("Completeted");
		}
		FileInputStream fis;
		fis = new FileInputStream("D:\\JDrive\\Java.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Example obj = (Example) ois.readObject();
		System.out.println("Reading Object Completeted");
	}
}
