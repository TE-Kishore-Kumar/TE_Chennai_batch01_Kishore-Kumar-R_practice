package com.te.exception;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		
		try(Scanner scn = new Scanner(System.in);
			FileOutputStream stream = new FileOutputStream(new File(""))){
			scn.hasNextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
